package swing.s_05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ColorChangeFrame extends JFrame implements ActionListener {

	JPanel centerPanel;
	JPanel bottomPanel;
	JButton button1;
	JButton button2;

	public ColorChangeFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
setSize(500,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
centerPanel = new JPanel();
bottomPanel = new  JPanel();
button1 = new JButton("버튼1");
button2 = new JButton("버튼2");

	}

	private void setInitLayout() {
		setLayout(new BorderLayout());
		
		this.add(centerPanel,BorderLayout.CENTER);
		centerPanel.setBackground(Color.blue);
		bottomPanel.setBackground(Color.cyan);
		this.add(bottomPanel,BorderLayout.SOUTH);
		this.add(button1,BorderLayout.WEST);
		this.add(button2,BorderLayout.EAST);
		setVisible(true);
	}

	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedbutton = (JButton)e.getSource();
		String clikedJbuttonName = clickedbutton.getText();
		String button1Name = button1.getText();

		if(button1Name.equals(clikedJbuttonName)) {
			//버튼1이 눌러 졌구나!!
			centerPanel.setBackground(Color.black);
		}else {
			//버튼2가 눌러 졌구나
			bottomPanel.setBackground(Color.gray);
		}
		System.out.println(clickedbutton.getText());
	}
	public static void main(String[] args) {
		new ColorChangeFrame();
	}
}







