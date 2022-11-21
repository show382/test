package ex02;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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

		player = new Player();
	}

	private void setIntiLayout() {
		setLayout(null);// 좌표기반 레이아웃
		// 크기와, 위치
		add(player);

		setLocationRelativeTo(null);// 프레임 정 가운데로 배치
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// System.out.println(e.getKeyCode());
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					player.left();
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					player.right();
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					player.up();
				}

			}
		});
	}

	public static void main(String[] args) {
		new BubbleFrame();
	}

}
