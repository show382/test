package september;

public class Claen {
	public static boolean isLeapYear(int year) {
		return year % 4 ==100 && year % 100 !=0 || year % 400 ==0;
	}
	public static int LastDay(int year,int month) {
		int[] m = {31,28,31,30,31,30,31,31,30,31,30,31};
		m[1]=isLeapYear(year)?29:28;
		return m[month-1];
	}
	public static int totalday(int year, int month, int day) {
		int sum = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		for(int i =1;i<month;i++) {
			sum += LastDay(year, i);
		}
		return sum + day;
	}
	public static int weekDay(int year, int month, int day) {
		switch(totalday(year, month, day)%7){
		case 0:System.out.print("일");break;
		case 1:System.out.print("월");break;
		case 2:System.out.print("화");break;
		case 3:System.out.print("수");break;
		case 4:System.out.print("목");break;
		case 5:System.out.print("금");break;
		case 6:System.out.print("토");
		}
		return totalday(year, month, day)%7 ;
	}
}
