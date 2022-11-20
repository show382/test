package september;

public class Calendar {
	public static void main(String[] args) {
		System.out.println(Claen.isLeapYear(2001)?"윤년":"평년");
		System.out.println(Claen.LastDay(2000, 2));
		System.out.println(Claen.totalday(2000, 2, 30));
		System.out.println(Claen.weekDay(2000, 2, 29));
	}

}
