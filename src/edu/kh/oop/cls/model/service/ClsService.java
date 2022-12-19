package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

public class ClsService {
	
	public void ex1() {
		Student std = new Student();
		
		System.out.println(std.v1);
	}
	
	public void ex2() {
		//static 필드 확인 예제 
		
		//학생 객체 2개 생성 
		Student std1 = new Student();
		Student std2 = new Student();
		
		System.out.println(std1.schoolName);
		//public 여기 때문에 직접 접근 가능
		//System.out.println(std.name);
		
		System.out.println("변경 전 : "+ std1.getName());
		std1.setName("김정윤");
		System.out.println("변경 후 : " + std1.getName());
		
		//System.out.println(std2.schoolName);
		// public 이기 때문에 직접 접근 가능
		
		System.out.println("변경 전  : " + std1.schoolName);
		std1.schoolName = "KH 고등학교";
		System.out.println("변경 후 : " + std1.schoolName);
		
		//schoolName에 노랑줄이 뜨는 이유! ==> 제대로 작성 안해서 
		//클래스명, 변수명 으로 사용함
		
		Student.schoolName = "KH";
		System.out.println("Student.schoolName " + Student.schoolName);
		
		/* static
		 * 
		 * 1) 공유 메모리 영역(또는 정적 메모리 영역) 이라고 함.
		 * --> 프로그램 시작시 static이 붙은 코드들이 모두 static 영역에 생성되고,
		 * 프로그램이 종료될 때 까지 사라지지 않음(정적)
		 * 그리고 static 영역에 생성된 변수는 어디서든 공유 가능( 공유 메모리 영역)
		 * 
		 * 2) 사용 법: 클래스명.변수명
		 */
	}

	public void ex3() {
		//생성자 확인 테스크
		
	Student s1 = new Student();  //기본생성자

	//User 기본생성자를 이용해서 객체 생성
	User u1 = new User();
	User u2 = new User();
	
	
	//user 객체 필드 초기화 확인
	System.out.println(u1.getUserId());
	System.out.println(u1.getUserPw());
	System.out.println(u1.getUserName());
	System.out.println(u1.getUserAge());
	System.out.println(u1.getUserGender());	
	
	System.out.println("==============================================");
	
	//문제점: u1이 참조하고있는 User 객체와 
	//		u2가 참조하고 있는 User 객체가 필드의 값이 모두 동일 
	// (같은 기본생성자로 User객체를 생성했기 때문)
	
	//해결방법 1 : setter 를 이용해서 새로운 값을 대입
	u2.setUserId("asdf1234");
	u2.setUserPw("asdf1234");
	u2.setUserName("김영희");
	u2.setUserAge(19);
	u2.setUserGender('F');
	
	System.out.println(u2.getUserId());
	System.out.println(u2.getUserPw());
	System.out.println(u2.getUserName());
	System.out.println(u2.getUserAge());
	System.out.println(u2.getUserGender());	
	System.out.println("==============================================");
	
	//System.out.println(u1.getUserName()); 클래스에서 메서드에 getter/setter 미작성시 간접 접근 불가능 
	
	User u3 = new User("test33","pwrd23r23");
	System.out.println(u2.getUserId());
	System.out.println(u2.getUserPw());
	System.out.println(u2.getUserName());
	System.out.println(u2.getUserAge());
	System.out.println(u2.getUserGender());	
	System.out.println("==============================================");
	
	
	User u4 = new User("test34","pwrd30r30");
	System.out.println(u2.getUserId());
	System.out.println(u2.getUserPw());
	System.out.println(u2.getUserName());
	System.out.println(u2.getUserAge());
	System.out.println(u2.getUserGender());	
	System.out.println("==============================================");
	
	
	
	}
}
