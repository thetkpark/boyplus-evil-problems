import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ukrit = sc.next().toLowerCase();
		String worarat = sc.next().toLowerCase();
		if(ukrit.equals(worarat)){
			System.out.println("Draw");
		}
		else if(ukrit.equals("rock")){
			if(worarat.equals("paper"))
				System.out.println("Dr.Worarat Krathu");
			else if(worarat.equals("scissors"))
				System.out.println("Mr.Ukrit Ruckcharti");
		}
		else if(ukrit.equals("paper")){
			if(worarat.equals("rock"))
				System.out.println("Mr.Ukrit Ruckcharti");
			else if(worarat.equals("scissors"))
				System.out.println("Dr.Worarat Krathu");
		}
		else if(ukrit.equals("scissors")){
			if(worarat.equals("paper"))
				System.out.println("Mr.Ukrit Ruckcharti");
			else if(worarat.equals("rock"))
				System.out.println("Dr.Worarat Krathu");
		}
	}
}