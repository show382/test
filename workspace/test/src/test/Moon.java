package test;

import java.util.Random;

public class Moon {
	public static void main(String[] args) {
		
		int[] lotto = new int[45];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=i+1;
			System.out.printf("%2d ",lotto[i]);
			if((i+1)%10==0) {
				System.out.println();
			}
		}
		System.out.println("==========섞기전==========");
		
		Random random = new Random();
		int r = random.nextInt(44);
		
		for(int i=0;i<1;i++) {
			int temp = lotto[0];
			lotto[0]=lotto[r];
			lotto[r]=temp;
			
		}
		
		
		
		
		
	}

}
