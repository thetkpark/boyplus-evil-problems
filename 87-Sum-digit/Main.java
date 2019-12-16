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