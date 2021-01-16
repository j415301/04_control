package com.condition.controller;

import java.util.Scanner;

public class ConditionController {
	
	public void ifTest() {
		//기본 if 활용하기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		//입력받은 값이 양수면 양수입니다 출력, 아니면 아무 것도 하지 않음.
		int num = sc.nextInt();
		//삼항연산자
		System.out.println(num>0? "양수입니다" : "");
		//if문으로 적용하려면?
		if (num>0) {
			System.out.println("양수입니다.");
			//변수 선언 가능
//			String name = "되니?";
//			System.out.println(name);
			//밖에서 선언한 클래스 사용 가능
//			String email = sc.next();
			//int num = 0;//error, if문이 실행되는 클래스들을 통틀어 변수 중복 불가
		}//조건문이 true라면 괄호 안 모든 내용이 실행되지만 false라면 모두 무시됨(else가 없으므로)
		//System.out.println(name);//error, if에서 선언한 변수는 외부에서 사용할 수 없음
		System.out.println("=====메소드 끝!====");
		
		//이름을 입력받고 자신의 이름과 동일한 이름이 입력되면
		//나는 코딩을 잘 할 수 있다.를 출력, 아니면 아무 것도 하지 않는 로직 구성하기
		System.out.println("당신의 이름은?");
		String name = sc.next();
		if (name.equals("장혜린")) {
			System.out.println("나는 코딩을 잘 할 수 있다.");
		}
		System.out.println("===============================");
		
		//국어, 영어, 수학을 입력받고 평균이 60점 이상이면 합격입니다 출력하기
		System.out.print("국어: ");
		int kor = sc.nextInt();
		System.out.print("영어: ");
		int eng = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();
		if ((kor+eng+math)/3>=60) {
			System.out.println("합격입니다.");
		}
//			//같은 내용을 다른 코드로 표현하기
//			System.out.println("국어: ");
//			int total = sc.nextInt();
//			System.out.println("영어: ");
//			total += sc.nextInt();
//			System.out.println("수학: ");
//			total += sc.nextInt();
//			if (total/3>=60) {
//				System.out.println("합격입니다.");
//			}
		System.out.println("===============================");
		
		//정수 한 개를 입력받아 정수가 짝수면 짝수다를 출력하는 기능
		System.out.print("정수 입력:");
		int num2 = sc.nextInt();
		if (num2%2==0) {
			System.out.println("짝수다");
		}
		System.out.println("===============================");
		
		//아이디와 패스워드를 입력받아 아이디가 admin, 패스워드가 admin일 때 로그인 성공 출력하기
		System.out.print("아이디: ");
		String id = sc.next();
		System.out.print("패스워드: ");
		String pw = sc.next();
		if (id.equals("admin") && pw.equals("admin")) {
			System.out.println("로그인 성공");
		}
		
	}
	
	public void ifelseTest() {
		//if ~ else문 활용하기
		//if ~ else문은 한 개의 그룹이므로 else 예약어만 사용할 수 없다.
		//조건에 따라 반드시 둘 중 하나만 실행된다.
		
		//입력받은 수가 양수면 양수입니다 출력, 음수면 음수입니다 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int su = sc.nextInt();
		if (su>0) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("음수입니다.");
		}
		
		//미성년자는 가입이 불가능한 로직을 구성
		//성인은 가입 가능 출력, 미성년자는 불가능 출력
		System.out.print("나이: ");
		int age = sc.nextInt();
		if (age>=20) {
			System.out.println("가입 가능");
			System.out.println("====== 회원 가입 ======");
			System.out.print("아이디: ");
			String id = sc.next();
			System.out.print("패스워드: ");
			String pw = sc.next();
			sc.nextLine();
			System.out.print("닉네임: ");
			String nickname = sc.nextLine();
		} else {
			System.out.println("가입 불가능");
		}
		
		//if를 두 개 사용한 것과 if ~ else를 사용하는 것의 차이
		//두 개의 if문은 별도로 실행됨 -> 선행 if가 후행 if에 영향을 미치지 않을 수 있음
		
	}
	
	public void ifelseifTest() {
		//if ~ else if ~ else
		//조건의 경우 수가 여러가지일 경우 사용(앞 조건에 해당되지 않으면서 다른 조건을 적용할 때)
				
		//성적을 입력받아 성적에 따라 수우미양가 등급으로 나누자 (10점씩 자름)
		Scanner sc = new Scanner(System.in);
		System.out.print("평균입력: ");
		double avg = sc.nextDouble();
		if (avg<=100 && avg>=90) {
			System.out.println("등급: 수");
		} else if (avg>=80) {//else if문은 위 코드가 포함되어 있음 -> !(avg<=100 && avg>=90) && avg>=80
			System.out.println("등급: 우");
		} else if (avg>=70) {
			System.out.println("등급: 미");
		} else if (avg>=60) {
			System.out.println("등급: 양");
		} else {
			System.out.println("등급: 가");
		}
		
		//연령별 메세지 출력하기
		//10대: 열심히 공부해야지 -> 좋은 대학 가지
		//20대: 열심히 공부해야지 -> 취업하지
		//30대: 열심히 일해야지 -> 결혼하지
		//40대: 열심히 일해야지 -> 자식들 먹이지
		//50대: 열심히 일해야지 -> 손자, 손녀 보지
		System.out.println("나이는?");
		int age = sc.nextInt();
		if (age>=10 && age<20) {
			System.out.println("열심히 공부해야지 -> 좋은 대학 가지");
		} else if (age<30) {
			System.out.println("열심히 공부해야지 -> 취업하지");
		} else if (age<40) {
			System.out.println("열심히 일해야지 -> 결혼하지");
		} else if (age<50) {
			System.out.println("열심히 일해야지 -> 자식들 먹이지");
		} else {
			System.out.println("열심히 일해야지 -> 손자, 손녀 보지");
		}
		
		//id하고 pw 입력 받고
		//id가 user01이고 pw가 user01이면 로그인 성공
		//id가 user01이고 pw가 user01이 아니면 패스워드가 틀립니다
		//id가 user01이 아니고 pw가 user01이면 아이디가 틀립니다
		//id, pw가 user01이 아니면 모두 틀립니다
		System.out.print("ID: ");
		String id = sc.next();
		System.out.print("PASSWORD: ");
		String pw = sc.next();
		if (id.equals("user01") && pw.equals("user01")) {
			System.out.println("로그인 성공");
		} else if (id.equals("user01") && !pw.equals("user01")) {
			System.out.println("패스워드가 틀립니다");
		} else if (!id.equals("user01") && pw.equals("user01")) {
			System.out.println("아이디가 틀립니다");
		} else {
			System.out.println("모두 틀립니다");
		}
			
	}
	
	public void doubleifTest() {
		//중첩 if문: 전제가 되는 조건에 대해 설정하고 그 안에서 다시 if문을 사용하는 것
		//나이가 성인이면서 내국인일 때는 회원가입, 외국인은 외국인등록번호 유무 확인 후 있으면 입력, 없으면 가입 불가
		//성인이 아니라면 가입할 수 없습니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("==== kh클럽 회원가입 ====");
		System.out.println("당신의 나이는?");
		int age = sc.nextInt();
		System.out.println("당신의 국적은?");
		String nation = sc.next();
		if (age>=20) {
			if (nation.equals("대한민국")) {
				System.out.println("== 내국인 회원가입 ==");
				System.out.print("이름: ");
				String name = sc.next();
			} else {
				System.out.println("외국인등록번호 유무 (1: 있다 / 2: 없다)");
				int choice = sc.nextInt();
				if (choice == 1) {
					System.out.println("== 외국인 회원가입 ==");
					System.out.print("이름: ");
					String name = sc.next();//내국인 회원가입을 하는 실행문과 중복에러가 나지 않는 이유는
					                        //저 조건이 true이면 이 조건은 실행되지 않고,
					                        //저 조건이 false면 이 조건만 실행됨
					                        //따라서 실행되는 것이 중복되지 않기 때문에 중복에러가 나지 않음
				} else {
					System.out.println("가입할 수 없습니다.");
				}
			}
		} else {
			System.out.println("가입할 수 없습니다.");
		}
		
	}
	
	public void switchTest() {
		//switch문: 조건문으로 예상되는 값에 따라 분기처리 하는 방식
		//동등 비교를 실행함
		
		//조건문에 사용될 수 있는 변수에 따라
		//정수 가능
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 오늘의 점심메뉴는? ======");
		System.out.println("1. 파스타 2. 오삼불고기 3. 샌드위치 4. 냉면");
		int choice = sc.nextInt();
		switch(choice) {
			case 1: System.out.println("봉골레 하나~"); break;
			case 2: System.out.println("15입니다~"); break;
			case 3: System.out.println("서브웨이~"); break;
			case 4: System.out.println("육삼냉면"); break;
			default: System.out.println("먹지 뫄!"); break;
		}
		
		//문자열 가능
		System.out.println("파스타 / 오삼불고기?");
		String name = sc.next();
		switch(name) {
			case "파스타": System.out.println("파스타 맛있다"); break;
			case "오삼불고기": System.out.println("오삼불고기 맛있다"); break;
		}
		
		//char 가능
		System.out.println("가. 자바, 나. 오라클, 다. html/css");
		char choice2 = sc.next().charAt(0);
		switch(choice2) {
			case '가': System.out.println("자바는 쉽다!고 말하고 싶다!"); break;
			case '나': System.out.println("오라클은 DB"); break;
			case '다': System.out.println("html/css 화면구현"); break;
		}
		
		//boolean형, 실수형: 불가능
//		int su = 100;
//		switch(su>50) {
//		}
//		double dnum = 3.14;
//		switch(dnum) {
//		}
		
		//break문을 사용하는 이유
		System.out.println("오늘의 점심메뉴?");
		System.out.println("1. 마라탕 2. 피자 3. 짬뽕 4.돈까스");
		int choice3 = sc.nextInt();
		switch (choice3) {
			case 1:
				System.out.println("마라탕은 매워!");
				ifTest();//같은 클래스 중괄호에 있는 매소드 호출 
				break;//switch에서도 긴 구문을 쓸 수 있지만, 이럴꺼면 차라리 if문을 쓰는 게 효율적..ㅎㅎ
			case 2: System.out.println("피자 먹고 얼굴 피자!");
			case 3: System.out.println("난 짬뽕!");
			case 4: System.out.println("바삭한 돈까스!");
		}//break가 없으면 지정된 case 이외에 그 밑에 있는 case도 모두 실행됨
	}

}