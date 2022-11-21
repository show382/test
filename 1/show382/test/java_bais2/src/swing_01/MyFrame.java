package swing_01;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	// 인스턴스화 될 때 (new 할 때) 가장 먼저 실행되는 코드이다.
	public MyFrame() {
		super.setTitle("myframe");
		super.setSize(500,500);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("생성자가 실행 되었습니다.");
		super.setVisible(true);
	}
}
