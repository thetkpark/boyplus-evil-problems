
  
## CSC102 Quiz#3 2019 Car (OOP)

#### Difficulty: `Low`

- - -

### Description

> Given a Car class and a driver class called CarCaller, please complete a Car class that supports the driver class.  
> 
>A Car class should contains the data of car id, brand, color, the name of owner, and total driving distance. Each data should have getter and setter methods. It also has a method called drive which takes an input of driving distance. For each drive, the drive method will accumulate total driving distance for a car (Hint: the accumulate total distance should be a static variable called accumulatedDist). The distance andaccumulatedDist are double.


### Input

>There is no input in this problem.

### Output

> The output of program from Driver class (Main class).

### Code Templates
	
```java
//Import here
class Car {
  //Write your code here.
}
class Main{
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
```
