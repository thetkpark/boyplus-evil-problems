import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String x2 = sc.next();
        String y2 = sc.next();
        if(x2.equals("1")&&y2.equals("-")){
            x+=1;
            y=0;
            x=x%2;
        }
        else if(y2.equals("1")&&x2.equals("-")){
            y+=1;
            x=0;
            y=y%2;
        }
        
        if(x==0&& y==0){
            System.out.println("NEUTRAL");
        }
        else if (x==0&&y==1){
            System.out.println("DnD");
        }
        else if(x==1&&y==0){
            System.out.println("MuR");
        }
        
  }
}