package swing.s_09;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame2 extends JFrame {

	JLabel backgroundLabel;
	JLabel player1Label;
	JLabel player2Label;

	int playerX1 = 100;
	int playerY1 = 350;
	int playerX2 = 300;
	int playerY2 = 450;

	boolean flag = true;// true 오른쪽 진행 방향이야!!, false면 왼쪽

	public MainFrame2() {
		initData();
		setInitLayout();
		addEventListener();

		// 익명 클래스 Thread(익명 구현 클래스로).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// 무한 반복 횟수 x (while)
				while (true) {

//					playerX2 += 10;

					if (flag == true) {
						playerX2 += 10;
					} else {
						playerX2 -= 10;
					}

					// 조건 확인
					// 1.좌표값이 500보다 크다면 방향을 왼쪽으로 변경해!!
					if(playerX2 == 500) {
						flag = false;
					}
					
					if(playerX2==0) {
						flag = true;
					}
					player2Label.setLocation(playerX2, playerY2);

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
//////////////////////////////////////////
	}

	private void addEventListener() {

		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					playerX1 += 10;
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					playerX1 -= 10;
				}

				player1Label.setLocation(playerX1, playerY1);
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

	private void setInitLayout() {
		setLayout(null);
		backgroundLabel.setSize(800, 800);
		backgroundLabel.setLocation(0, 0);

		player1Label.setSize(150, 150);
		player1Label.setLocation(playerX1, playerY1);

		player2Label.setSize(100, 100);
		player2Label.setLocation(playerX2, playerY2);
		add(player1Label);
		add(player2Label);
		add(backgroundLabel);
		setVisible(true);
	}

	private void initData() {
		setTitle("움직이는 간단 게임");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		player1Label = new JLabel(new ImageIcon("player-removebg1-preview.png"));
		player2Label = new JLabel(new ImageIcon("monster-removebg-preview.png"));
		backgroundLabel = new JLabel(new ImageIcon("backgraund1.jpg"));

	}

}
