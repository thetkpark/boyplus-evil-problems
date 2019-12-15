public class SavingAccount {
    private double balance;

    public SavingAccount(){
        this.balance = 0;
    }
    public SavingAccount(double b){
        this.balance = b;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double a){
        this.balance -= a;
    }
    public void deposit(double a){
        this.balance += a;
    }
}
