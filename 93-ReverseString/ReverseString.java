import java.util.Scanner;
public class ReverseString{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			String str = sc.next();
			str = str.toLowerCase();
			str = str.substring(0,str.length()-1)+str.substring(str.length()-1).toUpperCase();
			for(int j=str.length()-1;j>=0;j--){
				System.out.print(str.charAt(j));
			}
		}
	}
}