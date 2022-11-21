package ex04;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

// 화면에 보여진다 --> new 가능한 애들!!! 게임에 존재 할 수 있다.
public class Player extends JLabel implements Moveable {

	private int x;
	private int y;

	private ImageIcon playerR;
	private ImageIcon playerL;

	// 플레이어 속도 상태
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;

	// 움직임 상태
	private boolean left = false;
	private boolean right = false;
	private boolean up = false;
	private boolean down= false;

	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

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
		left = true;
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (left) {
					if (x >= 60) {
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
					if (x <= 880) {
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
		up = true;
		new Thread(new Runnable() {
			@Override
			public void run() {
				// 130 만큼 위로 올리기
				for (int i = 0; i < 130 / JUMPSPEED; i++) {
					y = y - JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end for
				up = false;
				down();
			}
		}).start();
	}

	@Override
	public void down() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				down = true;
				for(int i = 0; i <(130/JUMPSPEED);i++) {
					y=y+JUMPSPEED;
					setLocation(x,y);
					try {
						Thread.sleep(3);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				down = false;
			}
		}).start();
	}

}
