import java.util.Random;
public class Gen{
	public static void main(String[] args){
		Random random = new Random();
		int n = random.nextInt(1000000)+1;
		System.out.println(n);
	}
}