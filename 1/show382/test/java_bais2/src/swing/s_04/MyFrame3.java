package swing.s_04;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame3 extends JFrame {
	MyJPanel myJPanel;
	public MyFrame3() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("집그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		myJPanel = new MyJPanel();
	}

	private void setInitLayout() {
		setVisible(true);
		add(myJPanel);
	}
	// 내부클래스 사용해주세요~~
	// JPanel 상속해서 재 정의 paint메서드!!!
class MyJPanel extends JPanel{
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("★",100,100);
		g.drawLine(250, 50, 50, 150);
		g.drawLine(250, 50, 450, 150);
		g.drawLine(50, 150, 450, 150);
		g.drawLine(330, 200, 330, 300);
		g.drawLine(280, 250, 380, 250);
		g.drawRect(50,150,400,250);
		g.drawRect(200,400,50,250);
		g.drawRect(280,200,100,100);
	}
}
}
