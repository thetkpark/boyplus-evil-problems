import java.util.Scanner;
import java.util.Arrays;
public class SwapArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] arr = new double[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextDouble();
		}
		Arrays.sort(arr);
		int left = 0,right = n-1;
		while(left < right){
			double temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left+=2;
			right-=2;
		}
		for(int i=0;i<n;i++){
			System.out.prinf("%.2f ",arr[i]);
		}
	}
}