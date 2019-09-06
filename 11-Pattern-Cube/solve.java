import java.util.Scanner;
public class solve{
	public static void printCube(int n){
		int i,j,k;
		char space = '-';
		char dok = '*';
		for(i=0;i<n;i++){
			for(j=n-i-1;j>=1;j--)
				System.out.print(space);
			if(i == 0 || i == n-1)
				for(j=0;j<n;j++)
					System.out.print(dok);
				else{
					System.out.print(dok);
					for(j=0;j<n-2;j++)
						System.out.print(space);
					System.out.print(dok);
				}
				for(j=1;j<i;j++)
					System.out.print(space);
				if(i!=0)
					System.out.print(dok);
				System.out.println("");
			}
			for(i=1;i<n-1;i++){
				for(j=0;j<n;j++){
					if(j == 0 || j == n-1)
						System.out.print(dok);
					else
						System.out.print(space);
				}
				for(j=n-2-i;j>0;j--)
					System.out.print(space);
				System.out.print(dok);
				System.out.println("");
			}
			for(i=0;i<n;i++)
				System.out.print(dok);
			System.out.println("");
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			printCube(n);
		}
	}