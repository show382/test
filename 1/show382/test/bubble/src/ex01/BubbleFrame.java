package ex01;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {

	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initData();
		setIntiLayout();
		addEventListener();

	}

	private void initData() {
		setSize(1000, 640);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
		setContentPane(backgroundMap);

		player =new Player();
	}

	private void setIntiLayout() {
		setLayout(null);// 좌표기반 레이아웃
		
		add(player);
		setVisible(true);
	}

	private void addEventListener() {

	}

	public static void main(String[] args) {
		new BubbleFrame();
	}

}
