import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String temp = "";
		if(x == 0)
			temp = "0";
		while(x!=0){
			temp = temp+(x%8);
			x=x/8;
		}
		String ans = "";
		for(int i=temp.length()-1;i>=0;i--)
			ans+=temp.charAt(i);
		System.out.println(ans);
	}
}