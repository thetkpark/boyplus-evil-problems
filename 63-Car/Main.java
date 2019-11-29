

public class Main {
	public static void main(String[] args){
		Car car1 = new Car(15012016);
		Car car2 = new Car(20022011, "Jajuar XKR-S", "Blue", "Paul");
		Car car3 = new Car(11112015, "Mercedes-AMG GT", "Yello", "Smith");
		
		car1.setBrand("Lamborghini Veneno");
		car1.setColor("Black");
		car1.setOwner("James");
		
		car1.drive(120);
		car2.drive(300);
		car2.drive(50);
		car1.drive(15);
		
		System.out.println("----- car1 Info -----");
		System.out.println("id: "+car1.getId()+ 
				" brand: "+ car1.getBrand() +
				" color: "+ car1.getColor() + 
				" owner: "+ car1.getOwner() +
				" total driving distance: " + car1.getTotalDrivingDist());
		
		System.out.println("----- car2 Info -----");
		System.out.println("id: "+car2.getId()+ 
				" brand: "+ car2.getBrand() +
				" color: "+ car2.getColor() + 
				" owner: "+ car2.getOwner() +
				" total driving distance: " + car2.getTotalDrivingDist());

		System.out.println("----- car3 Info -----");
		System.out.println("id: "+car3.getId()+ 
				" brand: "+ car3.getBrand() +
				" color: "+ car3.getColor() + 
				" owner: "+ car3.getOwner() +
				" total driving distance: " + car3.getTotalDrivingDist());
				
		System.out.println("---Accumulated Driving Distance---");
		System.out.println(Car.accumulatedDist);
	}
}
class Car {
    private int id;
    private String brand;
    private String color;
    private String owner;
    private double total;
    public static double accumulatedDist;
    Car(){
        
    }
    Car(int id){
        this(id,"","","");
    }
    Car(int id,String brand,String color,String owner){
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.owner = owner;
    }
    void setBrand(String brand){
        this.brand = brand;
    }
    void setColor(String color){
        this.color = color;
    }
    void setOwner(String owner){
        this.owner = owner;
    }
    
    int getId(){
        return this.id;
    }
    String getBrand(){
        return this.brand;
    }
    String getColor(){
        return this.color;
    }
    String getOwner(){
        return this.owner;
    }
    void drive(double dis){
        total+=dis;
        accumulatedDist+=dis;
    }
    double getTotalDrivingDist(){
        return total;
    }
}
/*
----- car1 Info -----
id: 15012016 brand: Lamborghini Veneno color: Black owner: James total driving distance: 135.0
----- car2 Info -----
id: 20022011 brand: Jajuar XKR-S color: Blue owner: Paul total driving distance: 350.0
----- car3 Info -----
id: 11112015 brand: Mercedes-AMG GT color: Yello owner: Smith total driving distance: 0.0
---Accumulated Driving Distance---
485.0


*/
