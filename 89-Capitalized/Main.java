import java.util.Scanner;
public class Main{
	public static String rec(String s){
		if(s.length() == 0)
			return "";
		if(s.charAt(0) >= 'A' && s.charAt(0) <= 'Z')
			return s.charAt(0)+rec(s.substring(1));
		else
			return rec(s.substring(1));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = rec(s);
		System.out.println(ans);
	}
}