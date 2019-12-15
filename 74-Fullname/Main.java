// You are given 2 String represent your firstname and lastname and you need to print out your Fullname with fomal form.
// Input: The two String represent your firstname and lastname.
// Output: The only one line of String represent your Fullname with fomal form.
// Example:
// in: tHaNaWAt bEnJAchAtRIROj
// out: Thanawat Benjachatriroj

import java.util.Scanner;
public class FullnameFormal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String f = sc.next();
        String l = sc.next();
        System.out.println(f.substring(0,1).toUpperCase() + f.substring(1).toLowerCase() + " " + l.substring(0,1).toUpperCase() + l.substring(1).toLowerCase());
    }
}