
public class MemoTest {
	public static void main(String[] args) {
		
		MemoVo vo1 = new MemoVo();
		MemoVo vo2 = new MemoVo("홍길동", true, "1등 입니다.");
		
		System.out.println(vo1);
		System.out.println(vo2.toString());
	}
	
}
