class Factory{
    private double iron, copper, silver, gold;
    private int circuitBoard;

    public Factory(double iron, double copper, double silver, double gold) {
        this.iron = iron;
        this.copper = copper;
        this.silver = silver;
        this.gold = gold;
        this.circuitBoard = 0;
    }

    public void buildCircuitBoard(int n){
        double copperNeeded = (5*n)/1000000;
        double silverNeeded = (2*n)/1000000;
        double goldNeeded = (0.01*n)/1000000;
        this.copper = this.copper - copperNeeded;
        this.silver = this.silver - silverNeeded;
        this.gold = this.gold - goldNeeded;
        circuitBoard += n;
    }

    public double getIron() {
        return iron;
    }

    public double getCopper() {
        return copper;
    }

    public double getSilver() {
        return silver;
    }

    public double getGold() {
        return gold;
    }

    public int getCircuitBoard() {
        return circuitBoard;
    }
}

public class Main{
    public static void main(String[] args) {
        Factory fac1 = new Factory(67,9,10,1);
        System.out.println(fac1.getIron());
        System.out.println(fac1.getSilver());
        System.out.println(fac1.getCopper());
        System.out.println(fac1.getGold());
        System.out.println(fac1.getCircuitBoard());
        fac1.buildCircuitBoard(500000);
        fac1.buildCircuitBoard(850000);
        System.out.println(fac1.getIron());
        System.out.println(fac1.getSilver());
        System.out.println(fac1.getCopper());
        System.out.println(fac1.getGold());
        System.out.println(fac1.getCircuitBoard());
    }
}