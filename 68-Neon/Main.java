import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),mx=0;
        String[] str = new String[n];
        for(int i=0;i<n;i++){
            str[i] = sc.next();
            if(str[i].length() > mx){
                mx = str[i].length();
            }
        }
        int idx = 0;
        for(int i=0;i<mx;i++){   
            for(int j=0;j<n;j++){
                if(idx < str[j].length()){
                  System.out.print(str[j].charAt(idx) +" ");
                }
                else{
                    System.out.print("  ");
                }
         
            }
            System.out.println("");
            idx++;
        }
    }
}
