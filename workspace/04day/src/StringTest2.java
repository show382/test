import java.util.Scanner;

public class StringTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("문자열을 입력하세요: ");
		String str =sc.nextLine();
		System.out.println("입력한 문자열의 크기 : " + str.length());
//		trim() 문자열 앞 , 뒤의 불필요한 공백을 제거한다.
		System.out.println("입력한 문자열에서 불필요한 공백을 제거한 문자열의 크기 : " + str.trim().length());
		System.out.println("대문자로 출력: " + str.toUpperCase());
		System.out.println("소문자로 출력: " + str.toLowerCase());
//		charAt(index):문자열에서 index 번째 문자 1문자를 얻어온다. 문자의 위치를 계산할 때 맨앞자리 문자를 0번째로 계산한다.
		System.out.println("3번째 문자 :"+str.charAt(2));
		
	}
	
	
}
