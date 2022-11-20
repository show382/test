import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	System.out.println("값을 입력하시오 :");
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();
	switch ((int)i/2) {
	case 2:
	System.out.println("4이다");
	case 4:
		System.out.println("8이다");
	case 6:
		System.out.println("12이다");
	case 8:
	System.out.println("16이다");
	case 10:
		System.out.println("20이다");
	case 12:
		System.out.println("24이다");
		break;
	case 14:
		System.out.println("28이다");
		default:
			System.out.println("끝");
		
	}
}
}
