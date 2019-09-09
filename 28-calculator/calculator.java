import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		char op = sc.next().charAt(0);
		int b = sc.nextInt();
		if(op == '*') System.out.println(a*b);
		if(op == '/'){
			if(b==0){
				System.out.println("error");
			}else{
				System.out.println(a/b);
			}
		}
		if(op == '-') System.out.println(a-b);
		if(op == '+') System.out.println(a+b);
		if(op == '%') {
			if(b==0){
				System.out.println("error");
			}else{
				System.out.println(a%b);
			}
		}
		
	}
}