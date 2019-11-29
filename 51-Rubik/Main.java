import java.util.Scanner;
public class Main{
	public static int[][][] copy(int[][][] arr){
		int[][][] newArr = new int[3][3][3];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				for(int k=0;k<3;k++)
					newArr[k][i][j] = arr[k][i][j];
		return newArr;
	}
	public static int[][][] up(int[][][] arr,int n){
		int[][][] temp = copy(arr),ori = copy(arr);
		temp[0][0][n] = ori[0][2][n];
		temp[0][1][n] = ori[1][2][n];
		temp[0][2][n] = ori[2][2][n];

		temp[1][0][n] = ori[0][1][n];
		temp[1][1][n] = ori[1][1][n];
		temp[1][2][n] = ori[2][1][n];

		temp[2][0][n] = ori[0][0][n];
		temp[2][1][n] = ori[1][0][n];
		temp[2][2][n] = ori[2][0][n];
		
		return temp;
	}

	public static int[][][] left(int[][][] arr,int n){
		int[][][] temp = copy(arr),ori=copy(arr);
		temp[0][n][0] = ori[0][n][2];
		temp[0][n][1] = ori[1][n][2];
		temp[0][n][2] = ori[2][n][2];

		temp[1][n][0] = ori[0][n][1];
		temp[1][n][1] = ori[1][n][1];
		temp[1][n][2] = ori[2][n][1];

		temp[2][n][0] = ori[0][n][0];
		temp[2][n][1] = ori[1][n][0];
		temp[2][n][2] = ori[2][n][0];
		return temp;
	}
	public static void main(String[] args) {
		int[][][] arr = new int[3][3][3];
		int cnt = 1;
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				for(int k=0;k<3;k++)
					arr[i][j][k]=cnt++;
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for(int qq=0;qq<q;qq++){
			String cmd = sc.next();
			int n = sc.nextInt();
			if(cmd.equals("up")){
				arr = up(arr,n);
			}
			else if(cmd.equals("down")){
				for(int i=0;i<3;i++)
					arr = up(arr,n);
			}
			else if(cmd.equals("left")){
				arr = left(arr,n);
			}
			else if(cmd.equals("right")){
				for(int i=0;i<3;i++)
					arr = left(arr,n);
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
				System.out.print(arr[0][i][j]+" ");
			System.out.println("");
		}

	}
}