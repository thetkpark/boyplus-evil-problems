import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),m = sc.nextInt(),cnt=0;
		int[][] arr = new int[n+2][m+2];
		int[] maxRow = new int[n+2];
		int[] maxCol = new int[m+2];
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				arr[i][j] = sc.nextInt();
				maxRow[i] = arr[i][1];
				maxCol[j] = arr[1][j];
			}
		}
		//Find max for every row
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				if(arr[i][j] > maxRow[i]){
					maxRow[i] = arr[i][j];
				}
			}
		}
		//Find max for every column
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(arr[j][i] > maxCol[i]){
					maxCol[i] = arr[j][i];
				}
			}
		}

		//Count how many answer
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				if(arr[i][j] == maxRow[i] && arr[i][j] == maxCol[j]){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				if(arr[i][j] == maxRow[i] && arr[i][j] == maxCol[j]){
					System.out.println(i+" "+j);
				}
			}
		}
	}
}