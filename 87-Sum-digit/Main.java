// You are given 1 Number and you need to calculate summation from each digit of this number with recursive ( NO LOOPS ).
// Input: The only one line represent one positive number N. 0 <= N <= 5,000,000,000
// Output: The only one line represent one positive number after calculate summation form each digit.


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        System.out.println(sumDigits(x));
    }
    public static long sumDigits(String n){
        if(n.length() == 1) return Integer.parseInt(n);
        return sumDigits(n.substring(0,n.length()-1)) + (n.charAt(n.length()-1)-48);
    }
}