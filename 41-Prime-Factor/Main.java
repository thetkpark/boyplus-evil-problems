import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),now=2;
		boolean first = true;
		while(n!=1){
			while(n%now == 0){
				n/=now;
				if(first){
					System.out.print(now);
					first = false;
				}
				else{
					System.out.print(" x "+now);
				}
			}
			now++;
		}
		System.out.println("");
	}
}