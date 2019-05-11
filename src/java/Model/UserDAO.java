
package Model;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class UserDAO {
    
    public void signup(users u){
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
            s.save(u);
            t.commit();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            s.close();
            sf.close();
        } 
   }
    
    public users verify(String email){
        Configuration cf = null;
        SessionFactory sf = null;
        Session s = null;
        Transaction t = null;
        users u = null;
        try{
            
            cf = new Configuration();
            cf.configure();
            sf = cf.buildSessionFactory();
            s = sf.openSession();
            t = s.beginTransaction();
            Query q = s.createQuery("from users where email=:email");
            q.setString("email",email);
            u = (users)q.uniqueResult();
            t.commit();
            return u;
    }catch(Exception e){
        e.printStackTrace();
   }
        finally{
            s.close();
            sf.close();
        }
        return u;
 }   
    
    public boolean checkUser(String email , String password){
        
        users  u = null;
        u = verify(email);
        if(u!=null && email.equals(u.getEmail()) && password.equals(u.getPassword())){
            return true;
        }
        return false;
    }
    
    
    
}
