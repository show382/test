package ex04;

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
//		setContentPane(backgroundMap);

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
					//->->->->
					//만약 한번 호출을 했다면 한번더 호출 못하게 처리
					//left == false 라면 아직 한번도 left()메서드를 호출하지 않은 상황
					//f==f -->t
					//t!=f -->f
					if(player.isLeft()==false) {
						player.left();//left() 한번 호출 하면 left -->true
					}
					//왼쪽 화살표를 누르고 있으면 계속 player.left()메서드가 실행 되는 거다!! 여러번
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					if(!player.isRight()) {
						player.right();
					}
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					//올라가고 있는 도중에 up()메서드를 다시 호출 하면 안됨
					//내려가고 있는 도중에 up()메서드를 다시 호출 하면 안됨
					if(player.isUp()==false&&player.isDown()==false){
						player.up();
					}
				}
			}// end of KeyPressed

			// 키보드 해제 처리
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					player.setLeft(false);
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					// 오른쪽 화살표 누르고 있는 순간은 계속 오른쪽으로 가고 있는 상태 중..
					// 땟을때 while --> 멈춤해야 함!!!
					player.setRight(false);
				}
			}
		});
	}

	public static void main(String[] args) {
		new BubbleFrame();
	}

}
