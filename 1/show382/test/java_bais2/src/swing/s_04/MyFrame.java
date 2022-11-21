package swing.s_04;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * 패널 --> 컴포넌트들을 그룹화할 때 사용 --> 각각 배치관리자를 지정할 수 있다
 *
 * 내부 클래스 : 클래스 안에 클래스가 있는것
 */

public class MyFrame extends JFrame {

//	private JPanel jPanel;
	private ImagePanel imagePanel;

	public MyFrame() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("패널에 이미지 넣어보기");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();// 생성자 호출 ---> 이미지 객체 초기화 ---> 자동으로 paint() 메서드 호출 됨.
	}

	private void setInitLayout() {
		setVisible(true);
		add(imagePanel);

	}
	//사용이유?? --> 외부 클래스 안에서만 거의 사용한다.
	//용어정리
	//외부 클래스 - MyFrame
	//내부 클래스 - ImagePanel --> 접근 제어 지시자를 private 사용 가능하다
	//내부 클래스 앞에 static 키워드도 붙일 수 있다
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	//내부 클래스 앞에 static이 붙으면 - 정적 내부 클래스
	//내부 클래스 앞에 static이 안 붙으면 - 인스턴스 내부 클래스
static class ImagePanel extends JPanel {

		private Image image;

		public ImagePanel() {
			image = new ImageIcon("ramen.gif").getImage();
			image = new ImageIcon("젓가락.jpg").getImage();
		}

		// JPanel 여러가지 기능중에 직접 그림을 그리는 기능
		// 이미지를 확인해서 직접 그림을 다시 그린다.
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image, 50, 50, null);
		}

	}

}
