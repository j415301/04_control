package com.condition.controller;

import java.util.Scanner;

public class ConditionControllerPractice {
	
	public void ifTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		//삼항연산자
		System.out.println(num>0? "양수입니다." : "");
		//if문
		if (num>0) {
			System.out.println("양수입니다.");
			String name = "되니?";
			System.out.println(name);
			//String email = sc.next();
			//int num = 0;
		}
		
		//System.out.println(name);
		System.out.println("======================");
		
		//이름을 입력받고 자신의 이름과 동일한 이름이 입력되면
		//나는 코딩을 잘 할 수 있다.를 출력, 아니면 아무 것도 하지 않는 로직 구성하기
		System.out.print("이름: ");
		String name = sc.next();
		if (name.equals("장혜린")) {
			System.out.println("나는 코딩을 잘 할 수 있다.");
		}
		System.out.println("========================");
		
		//국어, 영어, 수학을 입력받고 평균이 60점 이상이면 합격입니다 출력하기
		System.out.print("국어: ");
		int total = sc.nextInt();
		System.out.print("영어: ");
		total += sc.nextInt();
		System.out.print("수학: ");
		total += sc.nextInt();
		if (total/3>=60) {
			System.out.println("합격입니다.");
		}
		System.out.println("=======================");
		
		//정수 한 개를 입력받아 정수가 짝수면 짝수다를 출력하는 기능
		System.out.print("정수 입력: ");
		int num2 = sc.nextInt();
		if (num2%2==0) {
			System.out.println("짝수다.");
		}
		System.out.println("======================");
		
		//아이디와 패스워드를 입력받아 아이디가 admin, 패스워드가 admin일 때 로그인 성공 출력하기
		System.out.print("아이디: ");
		String id = sc.next();
		System.out.print("비밀번호: ");
		String pw = sc.next();
		if (id.equals("admin") && pw.equals("admin")) {
			System.out.println("로그인 성공");
		}
		System.out.println("=====================");
		
	}
	
	public void ifelseTest() {
		//if ~ else
		
		//입력받은 수가 양수면 양수입니다 출력, 음수면 음수입니다 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		if (num>0) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("음수입니다.");
		}
		System.out.println("======================");
		
		//미성년자는 가입이 불가능한 로직을 구성
		//성인은 가입 가능 출력, 미성년자는 불가능 출력
		System.out.println("나이를 입력하시오.");
		int age = sc.nextInt();
		if (age>=20) {
			System.out.println("가입 가능");
		} else {
			System.out.println("가입 불가능");
		}
		System.out.println("======================");
		
	}
	
	public void ifelseifTest() {
		//if ~ else if ~ else
		
		//성적을 입력받아 성적에 따라 수우미양가 등급으로 나누자 (10점씩 자름)
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하시오.");
		int result = sc.nextInt();
		if (result>=90) {
			System.out.println("수");
		} else if (result>=80) {
			System.out.println("우");
		} else if (result>=70) {
			System.out.println("미");
		} else if (result>=60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
		System.out.println("==========================");
		
		//연령별 메세지 출력하기
		System.out.println("나이를 입력하시오.");
		int age = sc.nextInt();
		if(age>=10 && age<20) {
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
		System.out.print("아이디: ");
		String id = sc.next();
		System.out.print("비밀번호: ");
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
		
		//나이가 성인이면서 내국인일 때는 회원가입, 외국인은 외국인등록번호 유무 확인 후 있으면 입력, 없으면 가입 불가
		//성인이 아니라면 가입할 수 없습니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		if (age>=20) {
			System.out.println("내국인이신가요? (Y/N)");
			char nation = sc.next().charAt(0);
			if (nation == 'Y') {
				System.out.println("[내국인 회원가입]");
				System.out.print("이름: ");
				String name = sc.next();
			} else {
				System.out.println("외국인등록번호 유무 (Y/N)");
				char foreigner = sc.next().charAt(0);
				if (foreigner == 'Y') {
					System.out.println("[외국인 회원가입]");
					System.out.print("이름: ");
					String name = sc.next();
				} else {
					System.out.println("회원가입 불가");
				}
			}
			
		} else {
			System.out.println("가입할 수 없습니다.");
		}
		
	}
	
	public void switchTest() {
		
		//정수
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 오늘의 점심메뉴는? ====");
		System.out.println("1. 파스타 2. 오삼불고기 3. 샌드위치 4. 냉면");
		int choice = sc.nextInt();
		switch (choice) {
			case 1: System.out.println("파스타"); break;
			case 2: System.out.println("오삼불고기"); break;
			case 3: System.out.println("샌드위치"); break;
			case 4: System.out.println("냉면"); break;
			default: System.out.println("아무거나 먹어!");
		}
		
		//문자열
		System.out.println("파스타 / 오삼불고기?");
		String name = sc.next();
		switch (name) {
			case "파스타": System.out.println("봉골레"); break;
			case "오삼불고기": System.out.println("깻잎에 싸서 먹기"); break;
			default: System.out.println("아무거나 먹어!");
		}
		
		//char
		System.out.println("가. 자바, 나. 오라클, 다. html/css");
		char choice2 = sc.next().charAt(0);
		switch (choice2) {
			case '가': System.out.println("자바는 쉽다!고 말하고 싶다!"); break;
			case '나': System.out.println("오라클은 DB"); break;
			case '다': System.out.println("html/css 화면구현"); break;
		}
		
	}

}
