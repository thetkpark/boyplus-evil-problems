import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for(int qq=1;qq<=q;qq++){
			int n = sc.nextInt(),ans=0;
			for(int i=1;i<=n;i++){
				if(n%i == 0){
					ans++;
				}
			}
			System.out.print(ans+" ");
		}
	}
}