import java.util.Scanner;
public class Main{
    public static double f(double x,double c1,double c2){
        return c1+(c2*(x-Math.sin(x)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble(),b=sc.nextDouble(),c1=sc.nextDouble(),c2=sc.nextDouble(),tol=sc.nextDouble();
        double nowtol = (b-a)/2;
        double mid = (a+b)/2;
        while(nowtol > tol){
            mid = (a+b)/2;
            nowtol = (b-a)/2;
            if(f(a,c1,c2)*f(mid,c1,c2) < 0){
                b = mid;
            }
            else if(f(a,c1,c2)*f(mid,c1,c2) > 0){
                a = mid;
            }
        }
        System.out.println(mid);
    }
}