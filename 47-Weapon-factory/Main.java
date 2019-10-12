import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n/21;
		n%=21;
		int sword = temp + (n/10);
		n%=10;
		int shield = temp + (n/8);
		n%=8;
		int helmet = temp + (n/3);
		n%=3;
		System.out.println(sword+" "+shield+" "+helmet+" "+n);
	}
}