import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        x = x.toLowerCase();
        int j = 0;
        int sum = 0;
        char q = 'a';
        int sumi=0;
        
        for (int i = 0; i < x.length(); i++) {
                int k=0;
                q = x.charAt(i);
                k = k + (int) q - 96;
                
                if (x.charAt(i) != ' '&&k>0){
                sum = sum + i;}
                
            
        }
        for (int i = 0; i < x.length(); i++) {
            int k=0;
                q = x.charAt(i);
                k = k + (int) q - 96;
            if (x.charAt(i) != ' '&&k>0) {

                q = x.charAt(i);
                j = j + (int) q - 96;
            }

        }
        System.out.println(j - sum);

    }
}