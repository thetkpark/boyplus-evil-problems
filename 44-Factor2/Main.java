import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for(int qq=1;qq<=q;qq++){
			int n = sc.nextInt(),now=2,ans=1;
			while(n!=1){
				int cnt = 0;
				while(n%now == 0){
					n/=now;
					cnt++;
				}
				now++;
				ans = ans*(cnt+1);
			}
			System.out.print(ans+" ");
		}
	}
}