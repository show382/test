package ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainTest3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line2 = scanner.nextLine();
		System.out.println(line2);
		
		BufferedReader reder = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Enter your name");
		
		String name;
		try {
			name = reder.readLine();
			System.out.println("Your name is : " + name);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
