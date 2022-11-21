package swing.s_08;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFreame extends JFrame implements KeyListener {

	JLabel backgroundLabel;
	JLabel playerLabel;
	JLabel monsterLabel;
	int playerX = 100;
	int playerY = 350;

	public MainFreame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void addEventListener() {
		this.addKeyListener(this);
	}

	private void setInitLayout() {
		setLayout(null);// 컴퍼넌트에 크기,위치를 직접 지정해야 된다.
		playerLabel.setSize(250, 250);
		playerLabel.setLocation(playerX, playerY);
		add(playerLabel);
		add(monsterLabel);
		add(backgroundLabel);
		monsterLabel.setLocation(20,600);
		monsterLabel.setSize(100,100);
		backgroundLabel.setSize(800,800);
		backgroundLabel.setLocation(0,0);
		setVisible(true);
	}

	private void initData() {
		setTitle("움직이는 간단 게임 만들기");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// JLabel 이미지를 올리자
		backgroundLabel = new JLabel(new ImageIcon("backgraund1.jpg"));
		playerLabel = new JLabel(new ImageIcon("player-removebg1-preview.png"));
		monsterLabel = new JLabel(new ImageIcon("monster-removebg-preview.png"));
	}

	// 메인함수
	public static void main(String[] args) {
		new MainFreame();
	}// end of main

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keyCode: " + e.getKeyCode());
		// 만약 오른쪽 방향키가 눌러졌으면!!
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("오른쪽 방향키가 눌러졌음!!!");
			// x좌표값 --> 현재 이미지 좌표 값에서 더하기 10만큼 움직여라
			playerX = playerX + 10;
			playerLabel.setLocation(playerX, playerY);
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("왼쪽 방향키가 눌러졌음!!!");
			playerX = playerX - 10;
			playerLabel.setLocation(playerX, playerY);
		} else if (e.getKeyCode()==KeyEvent.VK_UP) {
			playerY = playerY-10;
			playerLabel.setLocation(playerX,playerY);
		}else if (e.getKeyCode()==KeyEvent.VK_DOWN) {
			playerY = playerY+10;
			playerLabel.setLocation(playerX,playerY);
		}else if (e.getKeyCode()==32) {
			playerY = playerY-50;
			playerLabel.setLocation(playerX,playerY);
		}else if (e.getKeyCode()==KeyEvent.VK_DOWN+32) {
			playerY = playerY+50;
			playerLabel.setLocation(playerX,playerY);
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}// end of class
