import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] score = new int[n];
        
      for(int i=0;i<n;i++){
          score[i] = sc.nextInt();
      }


      int[] sorted = score.clone();

      Arrays.sort(sorted);

      double p90 = (90.0/100)*(n+1);
      double p70 = (70.0/100)*(n+1);
      double p50 = (50.0/100)*(n+1);
      double p30 = (30.0/100)*(n+1);
      double p10 = (10.0/100)*(n+1);

      

      p90 = sorted[(int)p90 - 1] + ((p90 - (int) p90) * (sorted[(int)p90] - sorted[(int)p90 - 1]));
      p70 = sorted[(int)p70 - 1] + ((p70 - (int) p70) * (sorted[(int)p70] - sorted[(int)p70 - 1]));
      p50 = sorted[(int)p50 - 1] + ((p50 - (int) p50) * (sorted[(int)p50] - sorted[(int)p50 - 1]));
      p30 = sorted[(int)p30 - 1] + ((p30 - (int) p30) * (sorted[(int)p30] - sorted[(int)p30 - 1]));
      p10 = sorted[(int)p10 - 1] + ((p10 - (int) p10) * (sorted[(int)p10] - sorted[(int)p10 - 1]));
      

      for(int i=0;i<n;i++){
        if(score[i]>=p90) System.out.print("A ");
        else if(score[i]>=p70) System.out.print("B ");
        else if(score[i]>=p50) System.out.print("C ");
        else if(score[i]>=p30) System.out.print("D ");
        else if(score[i]>=p10) System.out.print("E ");
        else System.out.print("F ");
      }

    
  }
}
        
    
