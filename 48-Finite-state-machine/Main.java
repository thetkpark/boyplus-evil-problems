import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f_mur = sc.nextInt();
        int f_dnd = sc.nextInt();
        String a_mur = sc.next();
        String a_dnd = sc.next();
        if(a_mur.equals("1")) System.out.println("MuR");
        else if(a_dnd.equals("1")) System.out.println("DnD");
        else{
            if(f_mur == 0 && f_dnd == 0) System.out.println("NEUTRAL");
            else if(f_mur == 0 && f_dnd == 1) System.out.println("DnD");
            else if(f_mur == 1 && f_dnd == 0) System.out.println("MuR");
        }
    }
}