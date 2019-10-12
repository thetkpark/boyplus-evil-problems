import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int left = 0, right = 0;
        for (int qq = 0; qq < n * 2; qq++) {
            int q = sc.nextInt();
            if (left <= right) {
                int idx = -1;
                for (int i = 0; i < n; i++) {
                    if (arr[i][0] == 0) {
                        idx = i;
                        break;
                    }
                }
                if (idx != -1) {
                    arr[idx][0] = q;
                } else {
                    int mn = arr[0][0], mnidx = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i][0] <= mn) {
                            mn = arr[i][0];
                            mnidx = i;
                        }
                    }
                    int ans = -1;
                    for (int i = 0; i < n; i++) {
                        if (arr[i][1] == 0) {
                            ans = i;
                            break;
                        }
                    }
                    arr[ans][1] = arr[mnidx][0];
                    arr[mnidx][0] = q;
                }
                
            } else {
                int idx = -1;
                for (int i = 0; i < n; i++) {
                    if (arr[i][1] == 0) {
                        idx = i;
                        break;
                    }
                }
                if (idx != -1) {
                    arr[idx][1] = q;
                } else {
                    int mn = arr[0][1], mnidx = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i][1] <= mn) {
                            mn = arr[i][1];
                            mnidx = i;
                        }
                    }
                    int ans = -1;
                    for (int i = 0; i < n; i++) {
                        if (arr[i][0] == 0) {
                            ans = i;
                            break;
                        }
                    }
                    arr[ans][0] = arr[mnidx][1];
                    arr[mnidx][1] = q;
                }
            }
            left = 0;
            right=0;
            for(int i=0;i<n;i++){
                left = left+arr[i][0];
                right=right+arr[i][1];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }

}