import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int length =  sc.nextInt();
        for(int i=0;i<length;i++){
            System.out.print("*");
            System.out.print("_");
        }
        System.out.print("*");
        System.out.println("");
        for(int j=0;j<height;j++){
            for(int i=0;i<=length;i++){
                System.out.print("|");
                if(i<length) System.out.print("_");
            }
            System.out.println("");
        }
    }
}