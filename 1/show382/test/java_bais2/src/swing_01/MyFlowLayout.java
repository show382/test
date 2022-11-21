package swing_01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFlowLayout extends JFrame {

	private JButton boButton1;
	private JButton boButton2;
	private JButton boButton3;
	private JButton boButton4;
	private JButton boButton5;
	private JButton boButton6;
	//문제
	//버튼 3개 생성해서 화면에 올려 보세요.
	
	private FlowLayout flowLayout;

	public MyFlowLayout() {
		initData();
		setInitLayout();
		// 순서도 중요하다
	}

	// 데이터에 초기화(값을 넣는 기능으로 만들 꺼임)
	private void initData() {
		setTitle("배치 관리자 - FlowLayout");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		flowLayout = new FlowLayout();
//		hagp
		flowLayout = new FlowLayout(FlowLayout.CENTER,100,200);
		
		
		boButton1 = new JButton("버튼 1");
		boButton2 = new JButton("버튼 2");
		boButton3 = new JButton("버튼 3");
		boButton4 = new JButton("버튼 4");
		boButton5 = new JButton("버튼 5");
		boButton6 = new JButton("버튼 6");
	}

	// 화면을 컴포넌트를 추가한다거나 사라지게 하는 기능 담당
	private void setInitLayout() {
		setVisible(true);
		//배치 관리자를 등록해보자
		setLayout(flowLayout);
		
		add(boButton1);
		add(boButton2);
		add(boButton3);
		add(boButton4);
		add(boButton5);
		add(boButton6);
	}

}
