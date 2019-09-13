import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] txt = str.split(" ",-1);
		int[] nums = new int[txt.length];
		for(int i=0;i<txt.length;i++){
			nums[i] = Integer.parseInt(txt[i]);
		}
		Arrays.sort(nums);
		int len = nums.length;
		int median;
		if(len%2==0){
			median = (nums[len/2-1]+nums[len/2])/2;
		}else{
			median = (nums[len/2]);
		}
		// System.out.println(median);
		int fin = 0;
		for(int i=0;i<len;i++){
			fin += Math.abs(nums[i]-median);
		}
		System.out.println(fin);

	}
}