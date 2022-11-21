package swing.s_07;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame2 extends JFrame{
	
	private JTextArea area;
	
	public MyFrame2() {
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
		//익명 클래스로 구현 하시오
		//어뎁터 클래스가 있으면 사용하시오
		area.addKeyListener(new KeyAdapter() {
		@Override
		public void keyReleased(KeyEvent e) {
area.append("code:"+e.getKeyCode()+"\n");		}
		});
		
	}

	//테스트 코드
	public static void main(String[] args) {
		new MyFrame2();
	}

	
	
}
