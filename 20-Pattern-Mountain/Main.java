import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][3];
		int i,j,k,high=0;
		for(i=0;i<n;i++){
			a[i][0] = sc.nextInt();
			a[i][1] = a[i][0]*2-1;
			a[i][2] = 1;
			if(a[i][0]>high){
				high=a[i][0];
			}
		}
		for(i=0;i<high;i++){
			for(j=0;j<n;j++){
				if(high-i>a[j][0]){
					for(k=0;k<a[j][1];k++){
						System.out.print("-");
					}
				}
				else if(high-i==a[j][0]){
					a[j][1]=(a[j][1])/2;
					for(k=0;k<a[j][1];k++){
						System.out.print("-");
					}
					for(k=0;k<a[j][2];k++){
						System.out.print("*");
					}
					for(k=0;k<a[j][1];k++){
						System.out.print("-");
					}
					a[j][2]+=2;				
				}
				else{
					a[j][1]-=1;
					for(k=0;k<a[j][1];k++){
						System.out.print("-");
					}
					for(k=0;k<a[j][2];k++){
						System.out.print("*");
					}
					for(k=0;k<a[j][1];k++){
						System.out.print("-");
					}

					a[j][2]+=2;
				}
			}
			System.out.println("");
		}
	} 
}