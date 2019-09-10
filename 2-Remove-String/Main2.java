import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if (str1.contains(str2)) {
            str1=str1.replaceAll(str2,"");
            System.out.println(str1);
            
        }
        if (str2.contains(str1)) {
            str2=str2.replaceAll(str1,"");
            System.out.println(str2);
            
        }
        
    }
}