package swing.s_06;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.MouseInputListener;

/**
 * 
 * @author ITPS 버튼에 이벤트 등록할 때 ActionEventListener 마우스 이벤트 리스너
 */
public class MyFrame2 extends JFrame  {

	JLabel jLabel;
	Container rootContainer;

	public MyFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		
		//프레임 안에 자동으로 루트 패널이 생성 되어 실행 된다.
		rootContainer = getContentPane();
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jLabel = new JLabel("Hellow Java");
	}

	private void setInitLayout() {
		setLayout(null);
		jLabel.setSize(100, 100);
		jLabel.setLocation(200, 200);
		add(jLabel);
		setVisible(true);
	}

	private void addEventListener() {
		//이름이 다르다!!- 마우스 이벤트!
		//익명클래스 --> 이름이 없는 클래스 (변수명이 없다)
		//변수명이 없기 때문에 다른 메서드,클래스에서 사용 할 수 없다.
		//그순간에 필요하기 때문에 사용한다.
		//MyFrame1 과 다른 코드 방식을 적용해 보자.
		
		//추상 클래스 --> new 할 수 없다(기본적으로)
		//인터 페이스 --> new 할 수 없다(기본적으로)
		//익명 구현 클래스(인터페이스) -- 인터페이스를 new 키워드를 사용해서 추상 메서드를
		//오버라이드 해서 일반 메서드로 변경 완료 하였다.
rootContainer.addMouseListener(new MouseListener() {
	
	@Override
	public void mouseReleased(MouseEvent e) {
System.out.println(e.toString());
System.out.println("mouseReleased 메서드 호출 됨~!!!");
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		jLabel.setLocation(e.getX(),e.getY());
	}
});
	}

	// 테스트 코드
	public static void main(String[] args) {
		new MyFrame2();// 익명 클래스
	}

	
}
