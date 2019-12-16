import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        boolean is = true;
        for(int i=0;i<len/2;i++){
            if(str.charAt(i) != str.charAt(len-i-1)){
                is = false;
                break;
            }
        }
        if(is == true)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}