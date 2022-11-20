import java.util.Scanner;

public class ifTest1 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("3과목의 점수를 입력하시오.: ");
	int 수학 = sc.nextInt();
	int 과학 = sc.nextInt();
	int 영어 = sc.nextInt();
	
	int 합계 = (수학 + 과학 + 영어);
double 평균 = 합계/3.	;
System.out.printf("평균 점수 :" + 평균);
if(평균>=90) {
	System.out.println("\n수");}
else if ( 평균>=80) {
	System.out.println("우");}
else if ( 평균>=70) {
	System.out.println("미");}
else if ( 평균>=60) {
	System.out.println("양");}
else {
	System.out.println("가");}
}
	
	
}
