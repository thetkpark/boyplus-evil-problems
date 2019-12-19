import java.util.Scanner;
public class Average{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		double[][] arr = new double[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j] = sc.nextDouble();
			}
		}
		//Calculate average of each row
		System.out.println("Average of each row:");
		for(int i=0;i<row;i++){
			double sum = 0;
			for(int j=0;j<col;j++){
				sum+=arr[i][j];
			}
			System.out.printf("%.2f ",sum/col);
		}
		//Calculate average of each column
		System.out.println("\nAverage of each column:");
		for(int i=0;i<col;i++){
			double sum = 0;
			for(int j=0;j<row;j++){
				sum+=arr[j][i];
			}
			System.out.printf("%.2f ",sum/row);
		}
		System.out.println("");
	}
}