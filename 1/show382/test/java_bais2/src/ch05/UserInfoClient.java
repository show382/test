package ch05;

public class UserInfoClient {
	public static void main(String[] args) {
		// 기본 코드
		// Scanner 사용 해서 값을 입력 받을 수 있다.

		UserInfoDao userInfoDao = new UserInfoDao();
		// 1. 회원가입 기능 호출
		UserInfoDto dto = new UserInfoDto();
		dto.userId = "show382";
		dto.userName = "문승주";
		dto.userPw = "123123";

//		userInfoDao.insertUserinfo(dto);
		// 2.회원정보 수정 기능
//		userInfoDao.updateUserinfo(dto);
		// 3.회원정보 삭제 기능 호출
//		userInfoDao.deleteUserinfo("abc");
//		//4.회원정보 조회
//		userInfoDao.selectUserinfo();
	}
}
