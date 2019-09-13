import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),cnt=0;
		for(int i=1;i<=n;i++){
			if(n%i == 0){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}