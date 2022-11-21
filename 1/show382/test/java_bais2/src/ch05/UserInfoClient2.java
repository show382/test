package ch05;

import java.util.Scanner;

public class UserInfoClient2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("기능을 선택해 주세요");
		
		UserInfoDao userInfoDao = new UserInfoDao();
		
		System.out.println("1.회원 가입 2. 회원정보수정 3. 회원조회 4.회원정보삭제 0.종료");
		int userInput = scanner.nextInt();
		UserInfoDto dto = new UserInfoDto();
		dto.userId ="abc";
		dto.userName = "이순신";
		dto.userPw="123";
		if (userInput == 1) {
			System.out.println("1111111");
			userInfoDao.insertUserinfo(dto);
		}else if (userInput == 2) {
			System.out.println("22222");
			userInfoDao.updateUserinfo(dto);
		}else if (userInput == 3) {
			System.out.println("1111111");
			userInfoDao.selectUserinfo();
		} else if (userInput == 4) {
			System.out.println("1111111");
			userInfoDao.deleteUserinfo("1");
		} else {
			System.out.println("잘못된 값을 입력하셨습니다");
		}

	}

}
