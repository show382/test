package swing._02;

import java.awt.GridLayout;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame {

	JButton[] buttons = new JButton[9];
	String[] str = {"가","나","다","라","마","바","사","아","자"};
	public GridLayoutEx() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("그리드 레이아웃 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 숫자 쓰는것 보다 가독성이 좋다
		setSize(400, 400);

		for (int i = 0; i < buttons.length; i++) {
			buttons[i]= new JButton(str[i]);
		}
	}

//	GridLayout gridLayout = new GridLayout();
	private void setInitLayout() {
		// borderlayout --> gridlayout
		// rows,clos
		setLayout(new GridLayout(4,2,30,20));
		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i]);
		}
		setVisible(true);
	}

}
