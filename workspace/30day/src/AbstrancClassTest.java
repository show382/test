
// 추상 클래스 : 한 개 이상의 추상 메소드를 포함한 클래스로 불완전한 클래스이기 때문에 객체를 만들어 사용할 수 없다.
// 추상 클래스는 상속을 시키기 위해 만드는 클래스로 추상 클래스를 상속받은 자식 클래스는 상속받은 추상 메소드를 반드시 오버라이드 시켜서 사용해야 한다.
abstract class Product {
//	추상 메소드 : 아무런 일도 하지 않는 메소드로 {} 블록을 가지지 않는 메소드로 abstract 예약어를 사용해서 만든다.
//	추상 메서드를 만드는 이유는 상속받을 자식 클래스에서 무조건 오버라이드 시켜서 사용해야 할 메소드는 부모 클래스에서 코딩을 해봐야 어차피 무시되므로
//	그냥 내용이 없는 메소드로 만드는 것이다. 상속바든 자식 클래스에서 무조건 재정의 시켜 사용해야 할 메소듸을 강제하다.
//	public void move() { } 		// 아무런 일도 하지 않는 일반 메소드
	public abstract void move();
	
}

// 추상 클래스 Product를 상속받아 Camera 클래스를 만든다.
class Camera extends Product {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
}

// 파일 이름과 같은 이름을 가지는 클래스에만 public을 붙여줄 수 있다.
public class AbstrancClassTest {

	public static void main(String[] args) {
		
//		Product product = new Product();		//추상 클래스는 객체를 만들어 사용할 수 없으므로 에러가 발생된다.
		
	}
}
