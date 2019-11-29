import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int now = 1,sum=0;
        for(int i=1;i<=x;i++){
            now = i;
            if(i%15 == 0){
                now*=10;
            }
            else if(i%5 == 0){
                now*=3;
            }
            else if(i%3 == 0){
                now*=2;
            }
            sum+=now;
        }
        System.out.println(sum);
    }
}