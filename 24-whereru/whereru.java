import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
		char x = sc.next().charAt(0);
		x = Character.toLowerCase(x);
		String ans = "";
		int c = 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==x){
				ans += i;
				ans += ", ";
				c++;
			}
		}
		if(c==0){
			System.out.println("ERROR");
		}else{
			System.out.println(c);
			System.out.println(ans.substring(0,ans.length()-2));
		}
	}
}