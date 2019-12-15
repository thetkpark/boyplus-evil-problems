// You are given 1 line of String and you need to find if this string is Palindrome String or not.
// Input: The only one line of String.
// Output: Output "YES" if this String is Palindrome String and"No" if this String is not Palindrome String.


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        boolean is = true;
        for(int i=0;i<len/2;i++){
            if(str.charAt(i) != str.charAt(len-i-1)){
                is = false;
                break;
            }
        }
        String ans = is ? "YES" : "NO";
        System.out.println(ans);
    }
}