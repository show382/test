package ch02;

public class MainTest1 {

	public static void main(String[] args) {
		Car aiminiCupe = new AICar();
		Car miniCupe = new ManuaCal();
		
		aiminiCupe.run();
		System.out.println("--------");
		miniCupe.run();
		
	}

}
