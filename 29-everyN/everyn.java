import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int x = sc.nextInt();
		String ans = "";
		for(int i=0;i<str.length();i+=x){
			ans += str.charAt(i);
		}
		System.out.println(ans);
	}
}