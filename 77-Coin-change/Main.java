import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int money = sc.nextInt();
        int change = money - price;
        int[] ans = new int[9];
        // 1000 500 100 50 20 10 5 2 1
        if (change < 0) {
            System.out.println("Not enough money.");
        } else if (change == 0) {
            System.out.println("No change for you.");
        } else {
            System.out.println("Change: " + change);
            if (change >= 1000) {
                ans[0] = change / 1000;
                change %= 1000;
            }
            if (change >= 500) {
                ans[1] = change / 500;
                change %= 500;
            }
            if (change >= 100) {
                ans[2] = change / 100;
                change %= 100;
            }
            if (change >= 50) {
                ans[3] = change / 50;
                change %= 50;
            }
            if (change >= 20) {
                ans[4] = change / 20;
                change %= 20;
            }
            if (change >= 10) {
                ans[5] = change / 10;
                change %= 10;
            }
            if (change >= 5) {
                ans[6] = change / 5;
                change %= 5;
            }
            if (change >= 2) {
                ans[7] = change / 2;
                change %= 2;
            }
            if (change >= 1) {
                ans[8] = change;
            }
            System.out.println("1000THB: " + ans[0]);
            System.out.println("500THB: " + ans[1]);
            System.out.println("100THB: " + ans[2]);
            System.out.println("50THB: " + ans[3]);
            System.out.println("20THB: " + ans[4]);
            System.out.println("10THB: " + ans[5]);
            System.out.println("5THB: " + ans[6]);
            System.out.println("2THB: " + ans[7]);
            System.out.println("1THB: " + ans[8]);
        }
    }
}
