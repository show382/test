package swing.s_05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ColorChangeFrame2 extends JFrame implements ActionListener {

	JPanel centerPanel;
	JPanel bottomPanel;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	
	//토글 버튼 개념 1-->2-->1
	boolean isBlack = false;

	public ColorChangeFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
setSize(500,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
centerPanel = new JPanel();
button1 = new JButton("버튼1");
button2 = new JButton("버튼2");
button3 = new JButton("버튼3");
button4 = new JButton("버튼4");

	}

	private void setInitLayout() {
		setLayout(new GridLayout());
		
		this.add(centerPanel,BorderLayout.SOUTH);
		centerPanel.setBackground(Color.blue);
		this.add(button1,BorderLayout.NORTH);
		this.add(button2,BorderLayout.NORTH);
		setVisible(true);
	}

	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==button1) {
			//버튼1이 눌러 졌구나!!
			if(isBlack==true) {
				centerPanel.setBackground(Color.black);
//				isBlack = false;
			}else {
				centerPanel.setBackground(Color.RED);
//				isBlack = true;
			}
			isBlack =!isBlack;
			
		} else if(e.getSource()==button2)  {
			//버튼2가 눌러 졌구나
			centerPanel.setBackground(Color.gray);
		}
	}
	public static void main(String[] args) {
		new ColorChangeFrame2();
	}
}







