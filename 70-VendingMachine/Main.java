import java.util.Scanner;

public class TestVendingMachine {
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
        public int getPrice(){
            return this.price;
        }
        public void setPrice(int price){
            this.price = price;
        }
        public String getName(){
            return this.name;
        }
        public void setName(String name){
            this.name = name;
        }
        public int getId(){
            return this.id;
        }
        public void setId(int id){
            this.id = id;
        }
        public int getQuantity(){
            return this.quantity;
        }
        public void setQuantity(int quantity){
            this.quantity = quantity;
        }
	
	//put your code here
}

class VendingMachine {
	private Product[] slots = new Product[10];
	private int[] coins = {0, 0, 0};
	private int insertedMoney = 0;
	private CoinProcessor cp = new CoinProcessor(100, 100, 100);
	
	//put your code here
        public VendingMachine(){
            
        }
        public void addProduct(Product product,int index){
            this.slots[index] = product;
        }
        public void removeProduct(Product product,int index){
            slots[index].setQuantity(0);
        }
        public void addQuantity(int index,int quantity){
            slots[index].setQuantity(slots[index].getQuantity()+quantity);
        }
        public Product getProduct(int index){
            return slots[index];
        }
        public int getInsertedMoney(){
            return insertedMoney;
        }
        public void buy(int index,int quantity){
            Product product = slots[index];
            int sum = product.getPrice()*quantity;
            boolean check = cp.returnChange(insertedMoney-sum,coins);
            if(check == true){
                insertedMoney = 0;
                coins[0] = 0;
                coins[1] = 0;
                coins[2] = 0;
            }
            else{
                System.out.println("Not enough change");
            }
            
        }
        public void insertCoin(int coin){
            if(coin == 1){
                coins[0]++;
                insertedMoney++;
            }
            else if(coin == 5){
                coins[1]++;
                insertedMoney+=5;
            }
            else if(coin == 10){
                coins[2]++;
                insertedMoney+=10;
            }
            
        }
        public void cancel(){
            this.insertedMoney = 0;
            coins[0] = 0;
            coins[1] = 0;
            coins[2] = 0;
        }
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
        public boolean returnChange(int money,int[] coins){
            if(money < 0){
                return false;
            }
            int[] temp = {coins[0],coins[1],coins[2]};
            int ten = money/10;
            money%=10;
            int five = money/5;
            money%=5;
            int one = money/1;
            money%=1;
            if(tenbahtCoin < ten || fivebahtCoin < five || onebahtCoin < one){
                return false;
            }
            else{
                System.out.println("One-baht Coin: "+one);
                System.out.println("Five-baht Coin: "+five);
                System.out.println("Ten-baht Coin: "+ten);
                this.onebahtCoin-=one;
                this.fivebahtCoin-=five;
                this.tenbahtCoin-=ten;
                return true;
            }
        }
}