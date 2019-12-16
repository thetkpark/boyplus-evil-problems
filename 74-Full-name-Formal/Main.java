import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String f = sc.next();
        String l = sc.next();
        System.out.println(f.substring(0,1).toUpperCase() + f.substring(1).toLowerCase() + " " + l.substring(0,1).toUpperCase() + l.substring(1).toLowerCase());
    }
}