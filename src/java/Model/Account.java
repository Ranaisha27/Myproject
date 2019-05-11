
package Model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Account {
    
    @Id
    private long AccNo;
    
    private int Amnt;
    String Category;

    public long getAccNo() {
        return AccNo;
    }

    public void setAccNo(int AccNo) {
        this.AccNo = AccNo;
    }

    public int getAmnt() {
        return Amnt;
    }

    public void setAmnt(int Amnt) {
        this.Amnt = Amnt;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }
}
