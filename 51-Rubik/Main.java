import java.util.Scanner;
public class RubikTurn {
	public static void main(String[] args){
	    //initial state of rubik
		RubikTurn rt = new RubikTurn();
		int[][][] rubik = {
				{   {1,10,19},
                    {2,11,20},
                    {3,12,21}
                },
				{   {4,13,22},
                    {5,14,23},
                    {6,15,24}},
				{
                    {7,16,25},
                    {8,17,26},
                    {9,18,27}}
				};
				
	    //code your logic here...
	    Scanner sc= new Scanner(System.in);
	    int x = sc.nextInt();
        for(int k = 0 ;k<x;k++){
            String method = sc.next();
            int n = sc.nextInt();
            switch(method){
                case "up":
                    up(rubik,n);
                    break;
                case "down":
                    down(rubik,n);
                    break;
                case "right":
                    right(rubik,n);
                    break;
                case "left":
                    left(rubik,n);
                    break;
            }
        }
        
        
        for(int i = 0 ;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(rubik[i][j][0]+" ");
            }
            System.out.println("");
        }
    }
    static int[][][] right(int[][][] rubic,int row){
        int temp1 = rubic[row][0][0]; 
        int temp2 = rubic[row][1][0]; 
        int temp3 = rubic[row][2][0]; 
        
        rubic[row][2][0] = rubic[row][0][0];
        rubic[row][1][0] = rubic[row][0][1];
        rubic[row][0][0] = rubic[row][0][2];
        rubic[row][0][0] = rubic[row][0][2];
        rubic[row][0][1] = rubic[row][1][2];
        rubic[row][0][2] = rubic[row][2][2];
        rubic[row][0][2] = rubic[row][2][2];
        rubic[row][1][2] = rubic[row][2][1];
        rubic[row][2][2] = rubic[row][2][0];
        rubic[row][2][2] = temp3;
        rubic[row][2][1] = temp2;
        rubic[row][2][0] = temp1;
        return rubic;
    }
    static int[][][] left(int[][][] rubic,int row){
        int temp1 = rubic[row][0][0];
        int temp2 = rubic[row][1][0];
        int temp3 = rubic[row][2][0];
        rubic[row][0][0] = rubic[row][2][0];
        rubic[row][1][0] = rubic[row][2][1];
        rubic[row][2][0] = rubic[row][2][2];
        rubic[row][2][0] = rubic[row][2][2];
        rubic[row][2][1] = rubic[row][1][2];
        rubic[row][2][2] = rubic[row][0][2];
        rubic[row][2][2] = rubic[row][0][2];
        rubic[row][1][2] = rubic[row][0][1];
        rubic[row][0][2] = rubic[row][0][0];
        rubic[row][0][2] = temp1;
        rubic[row][0][1] = temp2;
        rubic[row][0][2] = temp3;
        return rubic;
    }
    static int[][][] up(int[][][] rubic,int col){
        int temp1 = rubic[0][col][0];
        int temp2 = rubic[1][col][0];
        int temp3 = rubic[2][col][0];
        rubic[0][col][0]= rubic[2][col][0];
        rubic[1][col][0]= rubic[2][col][1];
        rubic[2][col][0]= rubic[2][col][2];
        rubic[2][col][0]= rubic[2][col][2];
        rubic[2][col][1]= rubic[1][col][2];
        rubic[2][col][2]= rubic[0][col][2];
        rubic[2][col][2]= rubic[0][col][2];
        rubic[1][col][2]= rubic[0][col][1];
        rubic[0][col][2]= rubic[0][col][0];
        rubic[0][col][2]= temp1;
        rubic[0][col][1]= temp2;
        rubic[0][col][0]= temp3;
        return rubic;
    }
    static int[][][] down(int[][][] rubic,int col){
        int temp1 = rubic[0][col][0];
        int temp2 = rubic[1][col][0];
        int temp3 = rubic[2][col][0];
        rubic[2][col][0] = rubic[0][col][0];
        rubic[1][col][0] = rubic[0][col][1];
        rubic[0][col][0] = rubic[0][col][2];
        rubic[0][col][0] = rubic[0][col][2];
        rubic[0][col][1] = rubic[1][col][2];
        rubic[0][col][2] = rubic[2][col][2];
        rubic[0][col][2] = rubic[2][col][2];
        rubic[1][col][2] = rubic[2][col][1];
        rubic[2][col][2] = rubic[2][col][0];
        rubic[2][col][2] = temp3;
        rubic[2][col][1] = temp2;
        rubic[2][col][0] = temp1;
        
        return rubic;
    }
}