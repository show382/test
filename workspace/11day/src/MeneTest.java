import java.util.Scanner;

public class MeneTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;

		
//	while(true) {	
	while(menu != 5){
		do {
			System.out.println("============================");
			System.out.println("1.저장 2.보기 3.수정 4.삭제 5.종료");
			System.out.println("============================");
			System.out.println("원하는 메뉴를 선택하세요: ");
			menu = sc.nextInt();
		}while(menu < 1 || menu >5);
		
//		여기에 왔다는 것은 메뉴가 1~5 사이의 숫자가 입력되었다는 것이다.
		switch (menu) {
		case 1: System.out.println("입력");break;
		case 2: System.out.println("보기");break;
		case 3: System.out.println("수정");break;
		case 4: System.out.println("삭제");break;
		/*
		case 5: 
			System.out.println("바이바이");
			System.exit(0);    //프로그램을 강제로 종료시킨다.
		break;
		*/
			}
		}
	System.out.println("바이바이");
		sc.close();
	}

}
