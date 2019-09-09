import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];

        double x2 = 0;
        double sx2 = 0;
        double mean = 0;
        
        for(int i=0;i<n;i++){
            score[i] = sc.nextInt();
            x2 = x2 + (score[i]*score[i]);
            sx2 = sx2 + score[i];
            mean = mean + score[i];
        }

        sx2 = sx2 * sx2;
        x2 = x2 * n;
        mean = mean/n;

        double sd = Math.sqrt((x2-sx2)/(n*(n-1)));
        
        char[] result = new char[n];

        for(int i=0;i<n;i++){
          if(score[i] >= mean+(2*sd)) result[i] = 'A';
          else if(score[i] >= mean+(1*sd)) result[i] = 'B';
          else if(score[i] >= mean-(1*sd)) result[i] = 'C';
          else if(score[i] >= mean-(2*sd)) result[i] = 'D';
          else result[i] = 'F';
        }

        for(int i=0;i<n;i++){
          System.out.print(result[i] + " ");
        }

    
  }
}
        
    
