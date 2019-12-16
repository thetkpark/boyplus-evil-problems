import java.util.ArrayList;
import java.util.Iterator;

public class BankCustomer extends Customer {
    private ArrayList<SavingAccount> acc = new ArrayList<>();

    public BankCustomer(String name,int age){
        super(name,age);
    }

    public void AddAccount(SavingAccount a){
        this.acc.add(a);
    }

    public double getTotalBalance(){
        double sum = 0;
        Iterator<SavingAccount> it = acc.iterator();
        while(it.hasNext()){
            SavingAccount s = it.next();
            sum += s.getBalance();
        }
        return sum;
    }
}