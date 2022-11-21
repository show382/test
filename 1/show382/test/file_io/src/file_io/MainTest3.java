package file_io;

import java.io.IOException;

public class MainTest3 {

	public static void main(String[] args) {

		System.out.println("알파벳 여러개 쓰고 엔터");
		
		int i;
		try {
			while( (i= System.in.read()) != '\n'  )  {
				System.out.print("i : ");
				System.out.print(i);
				System.out.print((char)i);
				System.out.print("\t");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
