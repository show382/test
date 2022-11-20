
import java.util.Date;

public class MemoVo {

	private int no;				//객체가 생성될 때 마다 자동으로 1씩 증가
	private String name;
	private boolean gender;
	private String memo;
	private Date writeDate;		//객체가 생성되는 순간의 날짜와 시간

//	생성자 메소드(이하 생성자)
//	생성자 이름은 반드시 클래스 이름과 같아야 한다.
//	생성자는 return을 가지지 않는다. return을 가지지 않는 메소드는 접근 권한에"void"를 입력하는데 생성자는 접근 권한을 쓰지 않는다.
//	생성자를 선언하지 않으면 자바 컴파일러가 아무런 일도 하지 않는 기본 생성자를 만들어 준다 하지만 사용자가 생성자를 선언하면 기본 생서자는
//	자동으로 생성되지 않는다.
//	생성자는 객체가 생성될 때 자동으로 실행되며 멤버 변수를 초기화 시키는 목적으로 사용된다.
//	public MemoVo() {  //기본생성자
//		
//	}
	public MemoVo() {
//		System.out.println("기본 생성자가 실행됩니다.");
		// TODO Auto-generated constructor stub
//		name = "무명씨";
//		gender = false;
//		memo = "없음";
		this("무명씨",false,"없음");		// 생성자 MemoVo(String name, boolean gender, String memo)를 실행한다.
	}

	public MemoVo(String name, boolean gender, String memo) {
//		같은 {} 블록에 같은 이름을 가지는 지역 변수와 멤버 변수가 있을 경우 지역 변수에 우선권을 준다.
//		super():부모 클래스의 생성자를 의미한다. 생략하면 super()를 컴파일러가 자동으로 넣어준다.
//		this():현재 클래스의 생성자를 의미한다.
//		super()와this()는 반드시 생성자의 첫줄에 코딩해야 한다.
//		super(): 부모 클래스를 의미한다.
//		this():현재 클래스를 의미한다.
		this.name = name;
		this.gender = gender;
		this.memo = memo;
}
//	public MemoVo(String name , boolean gender, String memo) {
//		this.name = name;
//		this.gender = gender;
//		this.memo = memo;
//	}

//	객체에 저장된 내용을 출력해야 한다면 toString() 메소들르 override(재정의)한다.
	@Override
	public String toString() {
		return name + "(" + (gender ? "남" : "여") +")이 남긴말 " + memo;
	}
	
	
	
	
	
	
	
	
	
	
}
