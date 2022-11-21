package ch07;

public class ArrayExceptionHandling {
	public static void main(String[] args) {
		//여기 코드는 런타임 에러를 확인해 봄...
		//예외처리에서 가장 중요한 본질은 프로그램의 비정상 종료를 막기 위함니다.
		
		int[] arr = { 1, 2, 3, 4, 5 };
		
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(arr[i]);
			}
			//ArrayIndexOutOfBoundsException
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();//문제가 어딘지 알려주는 명령어
			System.out.println("예외가 발생 되었습니다.");
		}
		
		//런타임 오류가 발생 --> 프로그램이 자동종료 된다.
		//프로그램이 비정상 종료 되지 않았다.
		System.out.println("<<<<<<<<<여기 코드가 실행이 될까요?>>>>>>>>");
	}
}
