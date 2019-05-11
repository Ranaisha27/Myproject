/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigInteger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Abhiraj
 */
public class AccountsDAO {
    
    public void AddAcc(Account ac){
        
        Configuration cf = null;
        SessionFactory sf = null;
        Session s = null;
        Transaction t = null;
        
        try{
            
            cf = new Configuration();
            cf.configure();
            sf = cf.buildSessionFactory();
            s = sf.openSession();
            t = s.beginTransaction();
            s.save(ac);
            t.commit();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            s.close();
            sf.close();
        }
    
}
   
   public void AddExp(Expanse ex , int accno){
       
        Configuration cf = null;
        SessionFactory sf = null;
        Session s = null;
        Transaction t = null;
        try{
            
            cf = new Configuration();
            cf.configure();
            sf = cf.buildSessionFactory();
            s = sf.openSession();
            t = s.beginTransaction();
            Query q = s.createQuery("from Account where AccNo =:accno");
            q.setInteger("accno", accno);
            Account ac = (Account)q.uniqueResult();
            long amnt = ac.getAmnt();
            amnt = ( amnt + ex.getCredit() ) - ex.getDebit();
            ex.setCurrBal(amnt);
            Query q1 = s.createQuery("Update Account set Amnt = :amnt where AccNo = :accno");
            q1.setLong("amnt", amnt);
            q1.setInteger("accno", accno);
            q1.executeUpdate(); 
            s.save(ex);
            t.commit();
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            s.close();
            sf.close();
        }
       
   } 
    
}
