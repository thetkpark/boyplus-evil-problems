import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        for(int i = 0 ;i < str.length();i++){
            String now = str.substring(i,i+1);
            switch(now){
                case "a":System.out.print(".-");break;
                case "b":System.out.print("-...");break;
                case "c":System.out.print("-.-.");break;
                case "d":System.out.print("-..");break;
                case "e":System.out.print(".");break;
                case "f":System.out.print("..-.");break;
                case "g":System.out.print("--.");break;
                case "h":System.out.print("....");break;
                case "i":System.out.print("..");break;
                case "j":System.out.print(".---");break;
                case "k":System.out.print("-.-");break;
                case "l":System.out.print(".-..");break;
                case "m":System.out.print("--");break;
                case "n":System.out.print("-.");break;
                case "o":System.out.print("---");break;
                case "p":System.out.print(".--.");break;
                case "q":System.out.print("--.-");break;
                case "r":System.out.print(".-.");break;
                case "s":System.out.print("...");break;
                case "t":System.out.print("-");break;
                case "u":System.out.print("..-");break;
                case "v":System.out.print("...-");break;
                case "w":System.out.print(".--");break;
                case "x":System.out.print("-..-");break;
                case "y":System.out.print("-.--");break;
                case "z":System.out.print("--..");break;
                default:System.out.print("/");break;
            }
            System.out.print(" ");
        }
    }
}