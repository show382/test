
public class PrintTest {

	public static void main(String[] args) {
		
//		서식 없는 출력(println)
		System.out.println("안녕\n 자바");
		System.out.println("안녕 자바");
		System.out.println();
		System.out.println(" 5 + 3 = " + (5 + 3));
		System.out.println(" 5 - 3 = " + (5 - 3));
		System.out.println(" 5 * 3 = " + 5 * 3);
		System.out.println(" 5 / 3 = " + 5 / 3);
		
	
	//	boolean : 1바이트(8비트),true 또는 fales를 기억합니다.
	//	char : 2바이트,1문자를 기억한다.
//		short : 2바이트, -32768 ~ 32767 사이의 정수를 기억한다.
//		int : 4바이트, -2147483648 ~ 2147483647 사이의 정수를 기억하다
//		long : 8바이트, -2의63승 ~ 2의 63승 - 1 사이의 정수를 기억한다.
//		float : 4바이트, 단정도 실수, 소수점 아래로 6자리 정도를 표현한다.
//		duoble : 8바이트, 배정도 실수, 소수정 아래로 16자리 정도를 표현한다. float 보다 더 정밀한 연산이 가능하다.
		
		System.out.println(" 5 / 3 = " + 5. / 3);
		System.out.println(" A + 32 = " + ('A' + 32));
		System.out.println(" a - 32 = " + ('a' - 32));
		
//		명시정 형변환 : 프로그래머가 그 수간의 자료형을 변경할 수 있다. castimg, 형변환
		
		System.out.println(" 5 / (double)3 = " + 5 / (double)3);
		
		System.out.println(" A + 32 = " + (char)('A' + 32));
		System.out.println(" a - 32 = " + (char)('a' - 32));

//		서식 있는 출력 (printf() ==> 
//		printf("출력서식", 출력할 내용);
//		출력 서식은 출력 서식 문자를 제외한 나머지 문자는 입력한 그대로 출력된다.
//		출력 서식 문자 : d 정ㅅ f 실수 c 문자 s 문자열
//		출력 서식의 형식 : %[-][0][n][.m]
//		- : 
		
		System.out.printf("5 + 3 = %d\n", 5 + 4);
		System.out.printf("%d / %f = %f\n",5, 3., 5 / 3.);
		System.out.printf("%d * %d = %d\n",5,3,5*3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
