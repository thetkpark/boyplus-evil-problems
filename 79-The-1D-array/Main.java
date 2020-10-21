import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        double sum = 0;
        double mi = arr[0];
        double ma = arr[0];
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(arr[i] > ma) ma = arr[i];
            if(arr[i] < mi) mi = arr[i];
        }
        double avg = sum/(double)n;
        System.out.printf("Summation: "+"%.2f\n",sum);
        System.out.printf("Average: "+"%.2f\n",avg);
        System.out.printf("Max: "+"%.2f\n",ma);
        System.out.printf("Min: "+"%.2f\n",mi);
    }
}