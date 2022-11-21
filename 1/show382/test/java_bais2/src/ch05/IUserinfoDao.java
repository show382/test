package ch05;

public interface IUserinfoDao {

	// 클라이언트쪽 개발자는 인터페이스만 보고 기능을 구현 할 수 있습니다.
	// DB쪽 연결 기능을 구현하는(백엔드) 개발자도 인터페이스만 보고 기능을 구현 할 수 있습니다.
	// 어떤 기능을 만들지 먼저 정의해보자!!!
	// public abstract(아래는 생략됨)

	// C R U D
	// C - create
	// R - Read
	// U -Update
	// D - Delete
	void insertUserinfo(UserInfoDto userInfoDto);
	void updateUserinfo(UserInfoDto userInfoDto);
	void deleteUserinfo(String userId);
	//SQL -- DB--> DEKETER FROM tableNAme WHERE userId= '값'
	void selectUserinfo();
 
}
