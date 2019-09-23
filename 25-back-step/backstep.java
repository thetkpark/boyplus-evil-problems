import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b>a){
			int tmp = a;
			a = b;
			b = tmp;
		}
		String ans = "";
		for(int i=a;i>b-1;i--){
			for(int j=a;j>=i;j--){
				ans += ""+j+" ";
			}
		}
		System.out.println(ans);
	}
}