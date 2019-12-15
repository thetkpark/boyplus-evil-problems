// i: 5
// i: 4 6 2 1 5
// o: Summation: 18.0
// o: Average: 3.6
// o: Max: 6.0
// o: Min: 1.0
// output must be floating point !

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
        double mi = 1000000000;
        double ma = -1000000000;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(arr[i] > ma) ma = arr[i];
            if(arr[i] < mi) mi = arr[i];
        }
        double avg = sum/(double)n;
        System.out.println("Summation: "+sum+"\nAverage: "+avg+"\nMax: "+ma+"\nMin: "+mi);
    }
}