import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++)
				System.out.print("-");
			System.out.print("*");
			for(int j=1;j<=2*n;j++)
				System.out.print("-");
			System.out.println();
		}
		for(int i=1;i<=2*n+1;i++)
			System.out.print("*");
		for(int i=1;i<=n;i++)
			System.out.print("-");
		System.out.println("");
		for(int i=1;i<n;i++){
			for(int j=1;j<=n;j++)
				System.out.print("-");
			System.out.print("*");
			for(int j=1;j<n;j++)
				System.out.print("-");
			System.out.print("*");
			for(int j=1;j<=n;j++)
				System.out.print("-");
			System.out.println("");
		}
		for(int i=1;i<=n;i++)
			System.out.print("-");
		for(int i=1;i<=n*2+1;i++)
			System.out.print("*");
		System.out.println("");
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n*2;j++)
				System.out.print("-");
			System.out.print("*");
			for(int j=1;j<=n;j++)
				System.out.print("-");
			System.out.println("");
		}
	}
}