import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b){
			int tmp = a;
			a = b;
			b = tmp;
		}
		int sum = 0;
		for(int i=a;i<b;i++){
			boolean isPrime = true;
			for(int x=2;x<i;x++){
				if(i%x==0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				// System.out.println("i: "+i);
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}