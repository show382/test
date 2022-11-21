package swing_01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{

	//컴포넌트
	JButton botton1;
	
	public FlowLayoutEx() {
		setTitle("버튼 배치해보기");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//종료처리
		setVisible(true);//화면에 보이게 하라!!!
		
		botton1= new JButton("버튼");
		add(botton1);
		
		
	}
	
}
