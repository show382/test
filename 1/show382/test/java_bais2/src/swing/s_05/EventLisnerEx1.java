package swing.s_05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//이벤트 리스너!!!
public class EventLisnerEx1 extends JFrame implements ActionListener{
	
	JButton button1;
	JButton button2;
	
	
public EventLisnerEx1() {
initData();
setInitLayout();
addEventLisener();
}
//하나의 메소드는 가능한 하나의 책을 맡아서 처리한 것이 권장한다.
private void initData() {
	setSize(500,500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	button1=new JButton("button1");
	button2=new JButton("button2");
}
private void setInitLayout() {
	add(button1);
	add(button2);
	setLayout(new FlowLayout());//익명 데이터
	setVisible(true);
}
private void addEventLisener() {
	//이벤트 리스너를 등록 하겠다.
	//마우스가 버튼이 눌러 졌으면 나한테 알려줘(나의 프로그램)
	//인터페이스는 약속
	button1.addActionListener(this);
	button2.addActionListener(this);
}

//actionPerformed 메서드를 호출 시켜줘 --> 약속 되어 있다.
@Override
public void actionPerformed(ActionEvent e) {
	//문자열 비교(equals)
	JButton clickedJbutton =(JButton)e.getSource();
	String clikedJbuttonName = clickedJbutton.getText();
	String button1Name = button1.getText();

	if(button1Name.equals(clikedJbuttonName)) {
		//버튼1이 눌러 졌구나!!
		System.out.println("버튼1눌러졌음");
		button1.setText("버튼1");
	}else {
		//버튼2가 눌러 졌구나
		System.out.println("버튼2눌러졌음");
		button2.setText("버튼2");
	}
	System.out.println(clickedJbutton.getText());
	
	
//	System.out.println(button1.getText());
//	
//	System.out.println(e.toString());
//	System.out.println(e.getID());
//	System.out.println(e.getSource());
//	//구분을 어떻게 할 수 있을까 고민?
	
	//버튼1 이 눌러 졌으면 배경 색상을 파란색으로 변경해라
	//버튼2 가 눌러 졌으면 배경 색상을 빨간색으로 변경해라
//	System.out.println("여기 코드가 어떻게 될까요???");
}
//메인함수
public static void main(String[] args) {
	new EventLisnerEx1();
}

}
