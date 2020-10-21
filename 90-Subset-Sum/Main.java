import java.util.Scanner;
public class Main{
	public static boolean rec(int[] arr,int index,int sum){
		if(sum == 0) return true;
		if(index < 0) return false;
		return rec(arr,index-1,sum-arr[index])||rec(arr,index-1,sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		for(int i=0;i<q;i++){
			int x = sc.nextInt();
			boolean chk = rec(arr,n-1,x);
			if(chk == true)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}