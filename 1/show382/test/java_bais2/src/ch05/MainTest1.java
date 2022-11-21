package ch05;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int userInput;
		do {
			System.out.println("메뉴 고르시오");
			System.out.println("1.선택 2.고르기 3.종료");
			userInput=sc.nextInt();
			System.out.println("당신이 고른 번호는 : " + userInput);
		}while(userInput!= 3);{
			System.out.println("종료되었습니다");
		}
		
		
	
		
	}

}
