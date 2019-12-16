import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] done = str.split(" "); 
        for(int i=0;i<done.length;i++){
            switch(done[i]){
                case ".-" : System.out.print("A");break;
                case "-..." : System.out.print("B");break;
                case "-.-." : System.out.print("C");break;
                case "-.." : System.out.print("D");break;
                case "." : System.out.print("E");break;
                case "..-." : System.out.print("F");break;
                case "--." : System.out.print("G");break;
                case "...." : System.out.print("H");break;
                case ".." : System.out.print("I");break;
                case ".---" : System.out.print("J");break;
                case "-.-" : System.out.print("K");break;
                case ".-.." : System.out.print("L");break;
                case "--" : System.out.print("M");break;
                case "-." : System.out.print("N");break;
                case "---" : System.out.print("O");break;
                case ".--." : System.out.print("P");break;
                case "--.-" : System.out.print("Q");break;
                case ".-." : System.out.print("R");break;
                case "..." : System.out.print("S");break;
                case "-" : System.out.print("T");break;
                case "..-" : System.out.print("U");break;
                case "...-" : System.out.print("V");break;
                case ".--" : System.out.print("W");break;
                case "-..-" : System.out.print("X");break;
                case "-.--" : System.out.print("Y");break;
                case "--.." : System.out.print("Z");break;
            }
        }
    }
}