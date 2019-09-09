import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String y ="";
        int i;
        int z=0;
        int v=1;
        int b=0;
        if(x>1){
            System.out.print("0 "+"1");
            for(i=2;i<x;i++){
                z= b+v;
                y+=(" "+z);
                b=v;
                v=z;
            }
            System.out.println(y);
        }else{
            System.out.println("0");
        }
    }
}