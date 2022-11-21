package swing.s_06;

public class Player extends MoveableAdapter {

	// left
	@Override
	public void left() {
		System.out.println("왼쪽으로 갑니다");
	}

	// right
	@Override
	public void right() {
		System.out.println("오른쪽으로 갑니다");
	}
}
