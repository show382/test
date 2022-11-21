package ex03;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

// 화면에 보여진다 --> new 가능한 애들!!! 게임에 존재 할 수 있다.
public class Player extends JLabel implements Moveable {

	private int x;
	private int y;

	private ImageIcon playerR;
	private ImageIcon playerL;

	// 움직임 상태
	private boolean left = false;
	private boolean right = false;
	private boolean up = false;
	

	public boolean isLeft() {
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public Player() {
		initData();
		setInitLayout();

	}

	private void initData() {
		playerL = new ImageIcon("image/playerL.png");
		playerR = new ImageIcon("image/playerR.png");
	}

	private void setInitLayout() {
		x = 55;
		y = 535;
		this.setIcon(playerR);
		this.setSize(50, 50);
		this.setLocation(x, y);
	}

	@Override
	public void left() {
		left =true;
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(left) {
					if(x>=60) {
					setIcon(playerL);
					x -= 10;
					setLocation(x, y);
					}
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
	}

	@Override
	public void right() {
		right = true; // 여기 왔을 때 움직임 right -->true로 처리
		// 화살표 한번에 쓰래드 하나 생성된거
		// 화살표 두번 누르면 쓰래드 추가 생성 3번이면 또 추가된다. 점점 빨라진다.
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (right) {
					if(x<=880) {
						setIcon(playerR);
					x += 10;
					setLocation(x, y);
					}
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} // 0.01
				}
			}
		}).start();

	}

	@Override
	public void up() {
		System.out.println("점프");

	}

	@Override
	public void down() {

	}

}
