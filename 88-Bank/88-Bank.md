
## CSC102 #Do or die mock-up Bank Customer

#### Difficulty: `Low`

- - -

### Description

> In this problem, you need to implement the following UML diagram.
>
>![enter image description here](https://github.com/thetkpark/boyplus-evil-problems/raw/master/88-Bank/BankUML.png)
>
>Customer class represents the basic attributes and methods of collection and reading of customer data. Which contains the constructor, getter and setter methods for attributes "age" and "name".
>
>SavingAccount class contains the constructor, getter and setter for balance, and deposit which add the balance and withdraw which subtract the account's balance.
>
>BankCustomer class represents the customer attributes and method of the customer of the bank. The "getTotalBalance" method returns the summation of every saving account that the customer owns.
>
>Lastly, Main class is used as a driver class.
>
>PS. DO NOT MODIFY Main class!!

### Input

> There is no input for this problem.

### Output

> The output come from Main class.

### Code Templates
```Java
public class Main {

    public static void main(String[] args) {
      //DO NOT MODIFY!!
        // Create SavingAccounts
        SavingAccount s1 = new SavingAccount(3000);
        SavingAccount s2 = new SavingAccount(1000);
        SavingAccount s3 = new SavingAccount(2000);

        // Create 1st Customer
        BankCustomer b1 = new BankCustomer("Tutor", 15);
        b1.AddAccout(s1);
        s1.withdraw(200);
        s1.deposit(500);
        b1.AddAccout(s2);
        System.out.println(b1.getName());
        System.out.println(b1.getTotalBalance());
        b1.AddAccout(s3);
        System.out.println(b1.getTotalBalance());
        s1.withdraw(200);
        s1.deposit(500);

        // Create 2nd Customer
        BankCustomer b2 = new BankCustomer("Boy", 15);
        System.out.println(b2.getName());
        System.out.println(b2.getTotalBalance());
        b2.AddAccout(s1);
        s2.deposit(5000);
        s2.withdraw(200);
        b2.AddAccout(s2);
        System.out.println(b2.getTotalBalance());
    }
}

class BankCustomer{
  //Write you code here
  
}

class Customer{
  //Write you code here
  
}

class SavingAccount{
  //Write you code here
  
}
```
