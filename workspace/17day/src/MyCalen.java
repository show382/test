// 달력 작업에 사용할 메소드가 저장된 클래스
public class MyCalen {
	
//	인수로 년도를 넘겨받아 윤년, 평년을 판단해 윤년이면 true, 평년이면 false를 리턴하는 메소드
	public static boolean isLeapYear(int year) {
		return year % 4 ==0 && year % 100 !=0 || year % 400 ==0;
	}

//	인수로 년, 월을 넘겨받아 그 달의 마지막 날짜를 리턴하는 메소드
	public static int lastDay(int year,int month) {
		int[] m = {31,28,31,30,31,30,31,31,30,31,30,31};
		m[1]=isLeapYear(year)?29:28;
		return m[month-1];
	}

//	인수로 년, 월, 일을 넘겨받아 1년 1월 1일 부터 지나온 날짜의 합계를 계산해 리턴하는 메소드
	public static int totalDay(int year, int month, int day) {
		int sum = (year-1)*365 + (year-1)/4 -(year-1)/100 + (year-1)/400;
		for(int i=1;i<month;i++) {
			sum += lastDay(year,i);
		}
		return sum + day;
	}
//	인수로 년, 월, 일을 넘겨받아 요일을 숫자로 리턴하는 메소드
//	일~토 =0~6
	public static int weekDay(int year, int month, int day) {
		return totalDay(year, month, day)%7;
	}
	
}
