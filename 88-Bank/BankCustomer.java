import java.util.ArrayList;
import java.util.Iterator;

/**
 * BankCustomer
 */
public class BankCustomer extends BankInformation{
    
    private ArrayList<SavingAccount> acc = new ArrayList<>();
    
    public BankCustomer(String name,int age){
        super(name,age);
    }

    public void AddAccout(SavingAccount a){
        this.acc.add(a);
    }

    public int getTotalBalance(){
        int sum = 0;
        Iterator<SavingAccount> it = acc.iterator();
        while(it.hasNext()){
            SavingAccount s = it.next();
            sum += s.getBalance();
        }
        return sum;
    }
    
}