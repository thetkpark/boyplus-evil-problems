import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[][] rna = {{"CUU","CUC","CUA","CUG"},{"CCU","CCC","CCA","CCG"},{"CAU","CAC"},{"CAA","CAG"},{"CGU","CGC","CGA","CGG"}};
        int[] ans = new int[5];
        for(int i=0;i<str.length();i+=3){
            String now = str.substring(i,i+3);
            for(int j=0;j<5;j++){
                for(int k=0;k<rna[j].length;k++){
                    if(now.equals(rna[j][k])){
                        ans[j]++;
                        break;
                    }
                }
            }
        }
        for(int i=0;i<5;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
