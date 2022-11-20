import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {
		
		for(int i =1; i<=10;i++) {
		System.out.println((int)(Math.random() * 6) +1);
		}
		Random random = new Random();
		System.out.println("=============");
		for(int i =1; i<=6;i++) {
			System.out.println(random.nextInt(45));
			
		}
		
		
	}
	
}
