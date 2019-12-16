import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for(int qq=0;qq<q;qq++){
			String str1 = sc.next(),str2 = sc.next();
			int[] fre1 = new int[200],fre2 = new int[200];
			for(int i=0;i<str1.length();i++)
				fre1[str1.charAt(i)]++;
			for(int i=0;i<str2.length();i++)
				fre2[str2.charAt(i)]++;
			boolean chk = true;
			for(int i='a';i<='z';i++){
				if(fre1[i] != fre2[i]){
					chk = false;
					break;
				}
			}
			for(int i='A';i<='Z';i++){
				if(fre1[i] != fre2[i]){
					chk = false;
					break;
				}
			}
			if(chk == true)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}