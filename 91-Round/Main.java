import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		long y = Math.round(x);
		if(y%7 == 0 || y%10 == 7){
			System.out.println("Unlucky");
		}
		else{
			System.out.println("Lucky");
		}
	}
}