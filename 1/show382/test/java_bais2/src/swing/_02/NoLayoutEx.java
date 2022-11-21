package swing._02;

import javax.swing.JButton;
import javax.swing.JFrame;

//배열로 변경해서 코드를 완성해보자!!!

public class NoLayoutEx extends JFrame {
	// 멤버 변수,초기화
	// 메서드 선언(사용은 불가)
	// 생성자 선언
	// 할 수 없는것 : 식을 사용할 수 없다.

	private JButton button1;
	private JButton button2;
	private JButton button3;

	public NoLayoutEx() {
		initData();
		setInitLayout();
	}

	private void initData() {

		setTitle("좌표값 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		button1 = new JButton("button 1");
		button2 = new JButton("button 2");
		button3 = new JButton("button 3");
	}

	private void setInitLayout() {
//배치관리자
		setLayout(null);// <--좌표값으로 컴포넌트를 배치 할 수 있다.
		// 단 좌표값으로 레이아웃을 지정하면 버튼에 크기와 위치를 직접 지정해야 한다.
		
		//버튼의 크기를 먼저 만들어야 화면에 나온다. 기본값은 0,0이라 보이지 않음
		button1.setSize(100,50);
		button1.setLocation(0, 0);
		button2.setSize(100,50);
		button2.setLocation(200, 0);
		button3.setSize(100,50);
		button3.setLocation(490,511);
		add(button1);
		add(button2);
		add(button3);
		setVisible(true);

	}

}
