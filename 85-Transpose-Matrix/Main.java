import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int r = sc.nextInt();
        int[][] m = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(m[j][i]+" ");
            }
            System.out.println("");
        }
    }
}