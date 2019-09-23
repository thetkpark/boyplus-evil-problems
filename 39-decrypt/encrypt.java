import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toLowerCase();
		int sum = 0;
		for (int i=0; i<str.length(); i++) {
			if(Character.isLetter(str.charAt(i))){
				sum += str.charAt(i)-96;
			}else{
				int j=i;
				int x=j;
				while(x<str.length()-1 && !(Character.isLetter(str.charAt(x+1)))){
					x++;
				}
				sum += Integer.parseInt(str.substring(j,x+1));
				i = x;
			}
		}
		int ans = 0;
		int now = 2;
		int last = 0;
		while(sum != 1){
			while(sum % now == 0){
				sum/=now;
				if(last == 0){
					last = now;
					ans+=now;
				}
				else if(now != last)
				{
					last = now;
					ans+=now;
				}
				
			}
			now++;
		}
		System.out.println(ans);

	}
}
