import java.util.Scanner;

// 달력을 출력하는 클래스
public class MyCalendar {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("달력을 출력할 년, 월 :");
		int year = sc.nextInt();
		int month = sc.nextInt();
		System.out.println("=================");
		System.out.printf("      %4d년 %2d월\n",year,month);
		System.out.println("=================");
		System.out.println(" 일  월  화  수  목  금  토");
		System.out.println("=================");
		
//		1일의 요일 만큼 반복하며 빈칸을 출력한다.
		for(int i=1;i<=MyCalen.weekDay(year, month, 1);i++) {
			System.out.print("    ");
		}
		
//		1일부터 달력을 출력할 달의 마지막 날짜 만큼 반복하며 날짜를 출력한다.
		for(int i=1;i<=MyCalen.lastDay(year, month);i++) {
			System.out.printf(" %2d ",i);
//			출력한 날짜가 토요일이고 그달의 마지막 날짜가 아니면 줄을 바꾼다.
			if(MyCalen.weekDay(year, month, i)==6 && MyCalen.lastDay(year, month)!=i)  {
				System.out.println();
			}
		}
		System.out.println("\n=================");
	}

}
