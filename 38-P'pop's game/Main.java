import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] id = new int[n];
		for(int i=0;i<n;i++){
			int x = sc.nextInt();
			arr[i] = x;
			id[i] = i;
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

					temp = id[i];
					id[i] = id[j];
					id[j] = temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i] == arr[j]){
					if(id[i] > id[j]){
						int temp = id[i];
						id[i] = id[j];
						id[j] = temp;
					}
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(id[i]+1+" ");
		}
		System.out.println("");
	}
}