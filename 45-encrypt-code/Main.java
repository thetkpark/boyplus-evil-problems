import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
		for (int i=0; i<str.length(); i++) {
			if(Character.isLetter(str.charAt(i))){
				String tmp = str.substring(i+1);
				String find = ""+str.charAt(i);
				if(tmp.contains(find)){
					str = str.replaceAll(find,"-");
				}else{
					str = str.replaceAll(find,"*");
				}
			}
		}
		System.out.println(str);
	}
}