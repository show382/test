import java.util.Scanner;

public class ifTesr2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("윤년/평년을 판별할 년도를 입력하세요 :");
//		논리값을 기억하는 변수나 논리값을 리턴하는 메소드의 이름은 "is"로 시작하는 것이 관행이다.
	
		int year = sc.nextInt();
		boolean isLeapYear = year % 4 ==0 && year % 100 !=0 || year % 400 ==0;
		if(isLeapYear) {
			System.out.println(year + "년은 윤년 입니다.");}
		else {System.out.println(year + "년은 평년 입니다.");}
		
//		삼항 연산자(?:) :연산 순위가 늦기 때문에 ()가로로 묶어줘야 처리 됌
//		if 조건을 비교한 결과 조건이 참일때와 거짓일때 실행할 문장이 각각 1문장인 경우 사용하면 편리하다
	System.out.println(year + "년은" + (isLeapYear ? " 윤" : " 평") + "년 입니다.");
		
		
		sc.close();
		
	}

}
