
  
## CSC102 Quiz#4 2019 Vending machine   

#### Difficulty: `Mid`

- - -

### Description

> Write Java code according to the given description and UML diagram of a vending machine system as shown below.
> 
> ![enter image description here](https://github.com/thetkpark/boyplus-evil-problems/raw/master/70-VendingMachine/VendingMachineUML.jpg)

>Description: the vending machine system consists of three classes: Product, VendingMachine, and CoinProcessor.
>
>The Product class represents any product that can be sold in a vending machine. It contains necessary attributes of price per unit, product name, product id, and quantities. All attributes have setter and getter methods where the value of each attribute can be set and returned properly.
>
>The VendingMachine class represents a simple vending machine having ten slots. Each slot contains only one product with 20 quantities max. For example, one slot of the vending machine can contain 20 cans of Coke, or even 20 bars of Ferraro chocolate. The product can be added to each slot by using the addProduct(Product product, int index) method where the input product will be added to a slot at the input index. The quantity of each product can be added by using the addQuantity(int index, int quantity) method. Regarding coin management, assume that the machine allows to insert only one-baht, five-baht, and ten-baht coins. Hence, to keep track of the inserted coins, the VendingMachine has an array named coins which holds numbers of each inserted type of coins. Each index of an array holds numbers of one-baht, five-baht, and ten-baht coins respectively. The attribute insertedMoney can be calculated by summing up the value of those coins in the array. Moreover, the VendingMachine holds a CoinProcessor which processes money changes and manages numbers of coins left in the machine. Through the buy() method, the VendingMachine will call a CoinProcessor to manage changes and number of coins. If buying success, the VendingMachine will reset insertedMoney to 0 and every value in the coin array to 0 (i.e., it assumes that the machine must return change to the customer immediately after buying success.). The VendingMachine also provides the cancel() method for cancelling transaction. In this method, the value of insertedMoney and every value in the coins array must be set to 0 as well.
>
>The CoinProcessor class represents a processor object that is responsible for managing coins and changes. It holds attributes of onebahtCoin, fivebahtCoin, and tenbahtCoin that store number of each type of coin left in the machine. It provides the method returnChange(int money, int[] coins) which returns boolean whether the machine have enough money for change. In particular, this method will get the amount of change (int money) and the array of inserted coins (int[] coins) as inputs. From these inputs, the method does the following:
>
>1.Update the coin attributes (onebahtCoin,fivebahtCoin, andtenbahtCoin) according to the input of inserted coins.
>2.Calculate whether there is enough change.
>
>a.If there is enough change, it should print number of coins required for the amount of change. For example if the change is 15, it should print:
>
>“One-baht Coin: 0”
“Five-baht Coin: 1”
“Ten-baht
 Coin: 1”
 >
>Then update number of coins left in the machine.
>
>Hint: it is similar to the ATM machine but it is more advanced since it has to check whether the number of coins are enough otherwise use the other smaller-value coins instead.
>
>b.If there is not enough change, it should print “Not enough change”.
>
>The driver class of TestVendingMachine is provided in the answer box for testing the system as well as some part of each class. Please do not modify the driver class since your output may be incorrect.
*Driver class of TestVendingMachine is Main class.

### Input

>See the input format from the Driver Class (Main Class).

### Output

> The output from the Driver Class (Main Class).

### Code Templates
	
```java
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		VendingMachine vm = new VendingMachine();
		Product p1 = new Product("Pepsi", 13, 110);
		Product p2 = new Product("Coke", 13, 120);
		Product p3 = new Product("Fanta", 12, 130);
		Product p4 = new Product("Splash", 10, 140);
		Product p5 = new Product("Kit-kat", 15, 210);
		Product p6 = new Product("Snickers", 15, 220);
		Product p7 = new Product("Ferrero", 35, 230);
		Product p8 = new Product("vanhouten", 30, 240);
		Product p9 = new Product("Lay's", 25, 310);
		Product p10 = new Product("Testo", 20, 320);
		
		p1.setQuantity(20);
		p2.setQuantity(20);
		p3.setQuantity(20);
		p4.setQuantity(20);
		p5.setQuantity(20);
		p6.setQuantity(20);
		p7.setQuantity(20);
		p8.setQuantity(20);
		p9.setQuantity(20);
		p10.setQuantity(20);
		
		
		vm.addProduct(p1, 0);
		vm.addProduct(p2, 1);
		vm.addProduct(p3, 2);
		vm.addProduct(p4, 3);
		vm.addProduct(p5, 4);
		vm.addProduct(p6, 5);
		vm.addProduct(p7, 6);
		vm.addProduct(p8, 7);
		vm.addProduct(p9, 8);
		vm.addProduct(p10, 9);
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0;i<num;i++){
			vm.insertCoin(sc.nextInt());
		}
		System.out.println("---Inserted Money---");
		System.out.println(vm.getInsertedMoney());
		int pindex = sc.nextInt();
		int q = sc.nextInt();
		System.out.println("---Buy "+ q +" of "+vm.getProduct(pindex).getName()+" costs "+(vm.getProduct(pindex).getPrice()*q)+" baht---");
		System.out.println("---Change---");
		vm.buy(pindex, q);
	}
}

class Product{
	private int price;
	private String name;
	private int id; 
	private int quantity;
	
	public Product(String name, int price, int id){
		this.name = name;
		this.price = price;
		this.id = id;
		this.quantity = 0;
	}
	//put your code here
}

class VendingMachine {
	private Product[] slots = new Product[10];
	private int[] coins = {0, 0, 0};
	private int insertedMoney = 0;
	private CoinProcessor cp = new CoinProcessor(100, 100, 100);
	//put your code here
}

class CoinProcessor {
	private int onebahtCoin, fivebahtCoin, tenbahtCoin;
	
	CoinProcessor(){
		this.onebahtCoin = 0;
		this.fivebahtCoin = 0;
		this.tenbahtCoin = 0;
	}
	CoinProcessor(int one, int five, int ten){
		this.onebahtCoin = one;
		this.fivebahtCoin = five;
		this.tenbahtCoin = ten;
	}
	
	//put your code here
}
```
