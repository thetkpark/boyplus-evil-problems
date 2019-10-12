import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length() % 2 == 0) {
            for (int i = str.length() / 2 - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
            for (int i = str.length() - 1; i >= str.length() / 2; i--) {
                System.out.print(str.charAt(i));
            }
        }
        else{
            for(int i=str.length()/2-1;i>=0;i--){
                System.out.print(str.charAt(i));
            }
            System.out.print(str.charAt(str.length()/2));
            for(int i=str.length()-1;i>str.length()/2;i--){
                System.out.print(str.charAt(i));
            }
        }
    }
}
