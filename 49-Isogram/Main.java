import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] fre = new int[200];
        String str = sc.nextLine();
        String eiei = str;
        str = str.toLowerCase();        
        for(int i=0;i<str.length();i++){
            fre[str.charAt(i)]++;
        }
        boolean temp = true;
        for(int i='a';i<='z';i++){
            if(fre[i] > 1){
                temp = false;
                break;
            }
        }
        if(temp == true){
            System.out.println(eiei+" is an isogram");
        }
        else{
            System.out.println(eiei+" is not an isogram");
        }
    }
    
}
