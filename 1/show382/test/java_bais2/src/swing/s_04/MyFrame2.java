package swing.s_04;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame {

	// 내부 클래스를 멤버로 선언하기
	MyJpanel myJpanel;

	public MyFrame2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("패널 그림 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		myJpanel = new MyJpanel();
	}

	private void setInitLayout() {
		setVisible(true);
		add(myJpanel);
	}

	// 내부 클래스 만들어 보기
	class MyJpanel extends JPanel {

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawString("안녕~", 100, 100);
			g.drawString("★", 150, 150);
			g.drawLine(50,50,400,400);
			g.drawRect(250,250,100,100);
			g.drawOval(100,100,80,80);
		}
	}

}
