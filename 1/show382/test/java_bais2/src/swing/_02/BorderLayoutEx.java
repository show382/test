package swing._02;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {

	JButton[] buttons = new JButton[5];
	String[] strArr = {BorderLayout.AFTER_LAST_LINE,BorderLayout.CENTER,BorderLayout.LINE_START,BorderLayout.WEST,BorderLayout.EAST};
	public BorderLayoutEx() {
		// new 할 때 제일 먼저 실행
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("보더레이아웃 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		//5번 반복 됨
		for (int i = 0; i < buttons.length; i++) {
			buttons[i]=new JButton("버튼" + i);
		}
	}
	BorderLayout borderLayout = new BorderLayout();
	private void setInitLayout() {
		setVisible(true);
		//배치 관리자를 지정해 보자.
		setLayout(borderLayout);
		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i],strArr[i]);
		}
	}

}
