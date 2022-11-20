
public class MemoTest {
	public static void main(String[] args) {
		
		MemoVo vo1 = new MemoVo();
		MemoVo vo2 = new MemoVo("홍길동", true, "1등 입니다.");
		
		System.out.println(vo1);
		System.out.println(vo2.toString());
		
		MemoVo vo3 = new MemoVo("성춘향",false,"이쁜이에요");
		System.out.println(vo3);
		
		vo2.count = 100;
		System.out.println(vo3.count);
//		System.out.println(vo2.name);   	//name은 private 권한을 가ㅣ는 멤버이므로 에러가 생긴다.
		
		System.out.println(vo2.getName());
		vo2.setName("임꺽정");
		System.out.println(vo2.getName());
	}
	
}
