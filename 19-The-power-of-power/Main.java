import java.util.Scanner;
public class Main{
  public static long rec(long a,long b,long m){
    if(b == 0)
      return 1;
    long temp = rec(a,b/2,m)%m;
    if(b%2 == 1)
      return temp*temp%m*a%m;
    else
      return temp*temp%m;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long q = sc.nextLong();
    for(long i=0;i<q;i++){
      long a=sc.nextLong(),b=sc.nextLong(),m=sc.nextLong();
      long ans = rec(a,b,m);
      System.out.println(ans); 
    }
  }
}