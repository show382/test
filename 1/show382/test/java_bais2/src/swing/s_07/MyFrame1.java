package swing.s_07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame1 extends JFrame implements KeyListener{
	
	private JTextArea area;
	
	public MyFrame1() {
		intiData();
		setInitLayout();
		addEventListener();
	}

	private void intiData() {
		setTitle("key 이벤트 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();//타자 받기
	}

	private void setInitLayout() {
		add(area);
		setVisible(true);
	}

	private void addEventListener() {
		area.addKeyListener(this);
		
	}

	//테스트 코드
	public static void main(String[] args) {
		new MyFrame1();
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println("keyPressed 호출!!!");
//		System.out.println(e.getExtendedKeyCode());		
//		System.out.println(e.getKeyCode());
//		System.out.println(e.getID());
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("getKeyCode: " + e.getKeyCode());
//		area.setText("Code:" +e.getKeyCode());
		area.append("Code:" +e.getKeyCode()+"\n");
	}
	
}
