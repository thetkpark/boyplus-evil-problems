/**
 * Gen
 */
import java.lang.Math;
public class Gen {
    public static void main(String[] args) {
    double num = Math.random()*(1000-1+1)+1;
    System.out.println((int) num);

    
        for(int i=0;i<num;i++){
            double n = Math.random()*(100-1+1)+1;
            System.out.print((int) n + " ");
            //System.out.println((int)n);
        }
        
    }
}