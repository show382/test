package ch04;

public class MainTest {
	public static void main(String[] args) {
		
		//다형성!!!
		RemoteController[] remote =new RemoteController[3];
		
		//remote[0] <-- ToyRobot에 주소값
		remote[0] = new ToyRobot();
		//업캐스팅 된 상태이기 때문에 컴파일 시점(문법 작성하는 시점에는 데이터 타입만 확인 가능하다)
		//remote[0].name;<-- 불가능
		
		
		remote[1]=new Refrigerator();
		remote[2]=new Televsion();
		
		//한번에 모든 객체들을 on해주겠니??
		for (int i = 0; i < remote.length; i++) {
			remote[i].turnOn();
			System.out.println("----------");
		}
		for (int i = 0; i < remote.length; i++) {
			remote[i].turnOff();
			System.out.println("----------");
		}
//		RemoteController controller = new Televsion();//업 캐스팅 된 상태
		
		//문제foreach 문을 사용해서 notification 메서드를 전부 호출해 주세요
		//문제2. 반복문 돌다가 만약 데이터 타입이 ToyRobot 이라면 name 이라는 변수에 "건담"이라는 값을 추가해 주세요.
		//3.remote[0] 를 활용해서 name 값을 출력하시오 -- 다운캐스팅
		for (RemoteController r : remote) {
			if(r instanceof ToyRobot) {
				((ToyRobot) r).notification();
			}else if (r instanceof Refrigerator) {
				((Refrigerator) r).notification();
			}else if (r instanceof Televsion) {
				((Televsion) r).notification();
			}
		}
		for (int i = 0; i < remote.length; i++) {
			if(remote[i] instanceof ToyRobot) {
//				remote[i].name//업캐스팅 된 상태 --> 안보임(컴파일 시점)
				((ToyRobot)remote[i]).name = "건담";
			}
		}
		String toyRobotName = ((ToyRobot)remote[0]).name;
		System.out.println("toyRobotName : " + toyRobotName);
		
		
		
	}
}
