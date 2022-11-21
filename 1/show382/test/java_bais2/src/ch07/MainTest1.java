package ch07;

public class MainTest1 {

	public static void main(String[] args) {
		
		try {
			//예외가 발생할 수 있는 코드를 넣어 둡니다.
			//실제 예외가 발생하면 catch 블록으로 이동합니다.
			int result = 100/0;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("정수를 0으로 나눌 수 없다");
			
		}
		
	}

}
