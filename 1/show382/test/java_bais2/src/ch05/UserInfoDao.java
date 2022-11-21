package ch05;

//IUserinfoDao 추상메서드가 존재하기 때문에
//강제성 class UserInfoDao는 IUserinfoDao 있는 추상 메서드를  반드시 오버라이드 해야한다.
public class UserInfoDao implements IUserinfoDao {

	@Override
	public void insertUserinfo(UserInfoDto userInfoDto) {
		System.out.println("SQL 문 작성 --> insertUserInfo() 메서드 호출");
		System.out.println(userInfoDto.userId);
		System.out.println(userInfoDto.userName);
		System.out.println(userInfoDto.userPw);
	}

	@Override
	public void updateUserinfo(UserInfoDto userInfoDto) {
		System.out.println("SQL 문 작성 --> updateUserinfo() 메서드 호출");
		System.out.println("SQL 쿼리문을 배워서 작성해서 사용하면 된다");
	}

	@Override
	public void deleteUserinfo(String userId) {
		System.out.println("SQL 문 작성 --> deleteUserinfo() 메서드 호출");
	}

	@Override
	public void selectUserinfo() {
		System.out.println("SQL 문 작성 --> selectUserinfo() 메서드 호출");
	}

}
