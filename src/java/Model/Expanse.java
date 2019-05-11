
package Model;

import javax.persistence.*;

@Entity
public class Expanse {
  
    @Id
    private String Description;
    
    private long Accno;
    
    private long currBal;
    private String date;
    private int debit , credit;
    
    public long getCurrBal() {
        return currBal;
    }

    public void setCurrBal(long currBal) {
        this.currBal = currBal;
    }

    public long getAccno() {
        return Accno;
    }

    public void setAccno(int Accno) {
        this.Accno = Accno;
    }
 

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
    
}
