// 달력을 출력하는 클래스
public class MyCalendar {
	public static void main(String[] args) {
		
		System.out.println(MyCalen.isLeapYear(2001)?"윤년" : "평년");
		System.out.println(MyCalen.lastDay(2000,2));
		System.out.println(MyCalen.totalDay(2017, 10, 14));
		System.out.println(MyCalen.weekDay(2017, 10, 14));
	}

}
