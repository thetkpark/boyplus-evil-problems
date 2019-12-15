// You are given size of 2 dimensions matrix followed by 1 matrix. You need to transpose this matrix.
// Input: First Line is I and J which represent the dimension of matrix. Second Line to J+1(th) Line are given matrix.
// Output: The transposed matrix
// i: 2 3
// i: 1 2
// i: 3 4
// i: 5 6
// o: 1 3 5
// o: 2 4 6

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