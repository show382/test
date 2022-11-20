
public class MemberTest {
public static void main(String[] args) {
	
//	클래스 객체를 생성하는 방법
//	클래스이름 객체명 = new 생성장();
	MamberVO vo = new MamberVO();
//	생성된 객체의 멤버에 접근하려면 객체 이름에 "."을 찍어서 접근한다.
	System.out.println(vo.no);
	System.out.println(vo.name);
	System.out.println(vo.gender);
	System.out.println(vo.height);
	
}
}
