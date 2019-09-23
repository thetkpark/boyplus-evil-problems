import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int divide = n/21;
		int sword = divide;
		int shield = divide;
		int helmet = divide;
		n = n%21;
		
		sword = sword+(n/10);
		n = n%10;
		
		shield = shield+(n/8);
		n = n%8;
		
		helmet = helmet+(n/3);
		n = n%3;
		System.out.println(sword+" "+shield+" "+helmet+" "+n);
	}
}