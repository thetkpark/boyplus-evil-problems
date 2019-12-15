// You are given 2 Integer and you need to calculate product of them with recursive ( NO LOOPS , NO MULTIPLICATION ).
// Input: The two Integer represent two positive number A and B.
// Output: The only one line represent one positive number of A multiple B.

import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(mul(a,b));
        }
        public static int mul(int a,int b){
            if(b == 1) return a;
            return mul(a,b-1) + a;
        }
        
    
}