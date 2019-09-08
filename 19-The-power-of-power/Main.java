import java.util.Scanner;
class Main{
  public static void main(String[] args){
  Scanner src = new Scanner(System.in);
    String a = src.nextLine();
    String b = src.nextLine();
    if (a.length()<b.length()){
      String z = a.replaceAll(b,"");
      System.out.println(z);
    }
    else if (b.length()>a.length()){
      String z = b.replaceAll(a,"");
      System.out.println(z);
      
    }
    else{
      System.out.println("Eieiei");
    }
  }
}