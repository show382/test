package now;

import java.util.Random;
import java.util.Scanner;

public class Yes {
	public static void main(String[] args) {
		int ball[] = {0,1,2,3,4,5,6,7,8,9};
		Random random = new Random();
			for(int i=0;i<10000;i++) {
				int r = random.nextInt(9)+1;
				int temp = ball[0];
				ball[0] = ball[r];
				ball[r] = temp;
		}
			System.out.println("레벨을 입력하시오 :");
			Scanner sc = new Scanner(System.in);
			int level = sc.nextInt();
			System.out.print("CPU :");
			for(int i=0;i<level;i++) {
				System.out.print(ball[i]);
			}
			sc.nextLine();
			int count = 0;
			long start = System.currentTimeMillis();
			while(true) {
				int s=0,b=0;
				System.out.print("\nUSER :");
				String user = sc.nextLine();
				count++;
				for(int i=0;i<level;i++) {
					if(ball[i]==user.charAt(i)-48) {
						s++;
					}
					if(user.indexOf(ball[i]+"")>=0){
						b++;
					}
				}
				System.out.println(s+ "스트라이크" + (b-s) + "볼" );
				if(s==level) {
					break;
				}
				long end = System.currentTimeMillis();
				System.out.println((end-start)+ "시간 만에");
			}
		
		
		
		
		
	}

}
