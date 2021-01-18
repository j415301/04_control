package com.repeat.controller;

import java.util.Scanner;

public class RepeatControllerPractice {
	
	public void basicFor() {
		//안녕하세요 문구를 5번 출력하세요
		for(int i=0 ; i<5 ; i++) {
			System.out.println("안녕하세요");
		}
		
		//여러분 힘내세요를 100번 출력하세요
		for(int i=0 ; i<100 ; i++) {
			System.out.println("여러분 힘내세요");
		}
		
		//1부터 50까지 출력하는 반복문
		for(int i=1 ; i<=50 ; i++) {
			System.out.println(i);
		}
		
		//1~100까지 수에서 짝수만 출력하기
		for(int i=0 ; i<=100 ; i+=2) {
			System.out.println(i);
		}
		
		//1~100까지 수에서 홀수만 출력하기
		for(int i=1 ; i<100 ; i+=2) {
			System.out.println(i);
		}
		
		//학생정보를 입력받아 출력하는 프로그램이 5명의 학생을 입력받아 출력하게 할 것(이름, 나이, 학년)
		Scanner sc = new Scanner(System.in);
//		System.out.println("===== 학생 정보 시스템 =====");
//		for(int i=1 ; i<=5 ; i++) {
//			System.out.println("[학생정보 입력]");
//			System.out.print("이름: ");
//			String name = sc.next();
//			System.out.print("나이: ");
//			int age = sc.nextInt();
//			System.out.print("학년: ");
//			int grade = sc.nextInt();
//			System.out.printf("이름: %s, 나이: %d, 학년: %d\n\n", name, age, grade);
//		}
		
		//1부터 50까지 수 중에서 짝수면 짝, 홀수면 홀 출력하기
		for (int i=1 ; i<=50 ; i++) {
			if (i%2==0) {
				System.out.println("짝");
			} else {
				System.out.println("홀");
			}
		}
		
		//100부터 1까지 출력하는 로직 구현하기
		for(int i=100 ; i>0 ; i--) {
			System.out.println(i);
		}
		
		//for문의 초기식, 조건식, 증감식을 다 활용해야 하나??
		String msg = "";
		for (; !msg.equals("0") ;) {
			System.out.println("되니?");
			msg = sc.next();
		}
		
		for (;;) {
			System.out.println("못 멈추지랑~~");
		}
	}
	
	public void extraFor() {
		//사용자가 입력한 수만큼 반복하는 for문 구성하여 여러분은 할수있다 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int su = sc.nextInt();
		for(int i=0 ; i<su ; i++) {
			System.out.println("여러분은 할수있다");
		}
		
		//학생정보를 입력받아 출력하는 프로그램
		//입력할 학생의 수를 입력받고 그 수만큼 학생정보를 입출력 하는 프로그램
		System.out.println("===== 학생 정보 입출력 시스템 =====");
		System.out.print("입력할 학생 수: ");
		int stu = sc.nextInt();
		String print = "";
		for (int i=0 ; i<stu ; i++) {
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("나이: ");
			int age = sc.nextInt();
			System.out.print("학년: ");
			int grade = sc.nextInt();
			print += name+" "+age+" "+grade+"\n";
		}
		System.out.println(print);
		
		//성적의 합계, 평균을 구해주는 프로그램 작성
		//학생 수를 입력 받고, 학생에 대한 국어, 영어, 수학 성적을 입력 받아
		//학생수별 합계와 평균을 구하는 프로그램 작성
		System.out.println("==== 성적 총점, 평균 출력 시스템 ====");
		System.out.print("학생 수: ");
		int stu2 = sc.nextInt();
		for (int i=0 ; i<stu2 ; i++) {
			System.out.print("국어: ");
			int total = sc.nextInt();
			System.out.print("영어: ");
			total += sc.nextInt();
			System.out.print("수학: ");
			total += sc.nextInt();
			System.out.println("총점: "+total+" 평균: "+total/3.0);
		}
	}
	
	//계산기 프로그램 만들기
	//1. 한번만 실행되는 계산기 만들기
	//   입력받는 수: 2개의 수, 연산자 입력받아 처리
	//2. 내가 입력한 수만큼 계산할 수 있는 계산기 만들기
	//   1+추가적으로 계산할 수를 입력받음
	public void calculator1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 계산기 01 =====");
		System.out.print("수1: ");
		int su1 = sc.nextInt();
		System.out.print("연산자: ");
		char op = sc.next().charAt(0);
		System.out.print("수2: ");
		int su2 = sc.nextInt();
		switch (op) {
			case '+': System.out.println(su1+su2); break;
			case '-': System.out.println(su1-su2); break;
			case '*': System.out.println(su1*su2); break;
			case '/': System.out.println((double)su1/su2); break;
			default: System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void calculator2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 계산기 02 =====");
		System.out.println("몇 번의 계산을 수행하시겠습니까?");
		int count = sc.nextInt();
		for (int i=0 ; i<count ; i++) {
			System.out.print("수1: ");
			int su1 = sc.nextInt();
			System.out.print("연산자: ");
			char op = sc.next().charAt(0);
			System.out.print("수2: ");
			int su2 = sc.nextInt();
			switch (op) {
				case '+': System.out.println(su1+su2); break;
				case '-': System.out.println(su1-su2); break;
				case '*': System.out.println(su1*su2); break;
				case '/': System.out.println((double)su1/su2); break;
				default: System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	public void whileTest() {
		//while문
		
		//1~100까지 출력해보자
		int i = 1;
		while (i<=100) {
			System.out.print(i+" ");
			i++;
		}
		
		//무한반복
//		while (true) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("===== 계산기 02 =====");
//			System.out.println("몇 번의 계산을 수행하시겠습니까?");
//			int count = sc.nextInt();
//			for (int f=0 ; f<count ; f++) {
//				System.out.print("수1: ");
//				int su1 = sc.nextInt();
//				System.out.print("연산자: ");
//				char op = sc.next().charAt(0);
//				System.out.print("수2: ");
//				int su2 = sc.nextInt();
//				switch (op) {
//					case '+': System.out.println(su1+su2); break;
//					case '-': System.out.println(su1-su2); break;
//					case '*': System.out.println(su1*su2); break;
//					case '/': System.out.println((double)su1/su2); break;
//					default: System.out.println("잘못 입력하셨습니다.");
//				}
//			}
//			System.out.println("계산기를 종료하시겠습니까? (Y/N)");
//			char yesno = sc.next().charAt(0);
//			if (yesno == 'Y') {
//				break;
//			}
//		}
//		
//		int j=1;
//		while (j==1) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("===== 계산기 02 =====");
//			System.out.println("몇 번의 계산을 수행하시겠습니까?");
//			int count = sc.nextInt();
//			for (int f=0 ; f<count ; f++) {
//				System.out.print("수1: ");
//				int su1 = sc.nextInt();
//				System.out.print("연산자: ");
//				char op = sc.next().charAt(0);
//				System.out.print("수2: ");
//				int su2 = sc.nextInt();
//				switch (op) {
//					case '+': System.out.println(su1+su2); break;
//					case '-': System.out.println(su1-su2); break;
//					case '*': System.out.println(su1*su2); break;
//					case '/': System.out.println((double)su1/su2); break;
//					default: System.out.println("잘못 입력하셨습니다.");
//				}
//			}
//			System.out.println("계산기를 종료하시겠습니까? (Y/N)");
//			char yesno = sc.next().charAt(0);
//			if (yesno == 'Y') {
//				break;
//			}
//		}
		System.out.println();
		
		//do ~ while문
		int a = 10;
		while (a>10) {
			System.out.println(a);
		}//아무것도 출력되지 않음
		
		do {
			System.out.println(a);
		} while (a>10);
	}
	
	public void doubleForTest() {
		//중첩 반복문
		
		for (int i=0 ; i<10 ; i++) {
			System.out.println("외곽: "+i);
			for (int j=0 ; j<10 ; j++) {
				System.out.print("내곽: "+j+" ");
			}
			System.out.println();
		}
		
		//구구단 출력하기
		for (int i=2 ; i<10 ; i++) {
			System.out.println("===== "+i+"단 =====");
			for (int j=1 ; j<10 ; j++) {
				System.out.println(i+"x"+j+" = "+i*j);
			}
		}
		
		//입력받은 값의 각 문자별 중복개수 확인
//		Scanner sc = new Scanner(System.in);
//		System.out.println("문자열을 입력하시오.");
//		String voca = sc.next();
//		int count = 0;
//		for (int i=0 ; i<voca.length() ; i++) {
//			for (int j=0 ; j<voca.length() ; j++) {
//				if (voca.charAt(i)==voca.charAt(j) && i!=j) {
//					count++;
//				}
//			}
//			System.out.println(voca.charAt(i)+" 중복 횟수: "+count);
//		}
		
		//별 찍기
		//***
		//***
		//***
		for (int i=0 ; i<3 ; i++) {
			System.out.println("***");
		}
		System.out.println();
		
		//*
		//**
		//***
		for (int i=0 ; i<3 ; i++) {
			for (int j=0 ; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//***
		//**
		//*
		for (int i=0 ; i<3 ; i++) {
			for (int j=0 ; j<3-i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void breakContinueTest() {
		Scanner sc = new Scanner(System.in);
//		String orderMenu = "";
//		while (true) {
//			System.out.println("===== 점심주문 프로그램 ====");
//			System.out.println("1. 회\n2. 연어덮밥\n3. 감자탕\n4. 샌드위치");
//			System.out.print("입력 : ");
//			int cho = sc.nextInt();
//			switch (cho) {
//				case 1: orderMenu += "회\t"; break;
//				case 2: orderMenu += "연어덮밥\t"; break;
//				case 3: orderMenu += "감자탕\t"; break;
//				case 4: orderMenu += "샌드위치\t"; break;
//			}
//			System.out.println("계속 주문하시겠습니까? (Y/N)");
//			char yesno = sc.next().charAt(0);
//			if (yesno == 'N') {
//				System.out.println("===== 주문 내역 =====");
//				System.out.println(orderMenu);
//				break;
//			}
//		}
//		System.out.println("[주문 프로그램 종료]");
		
		for (int i=0 ; i<10 ; i++) {
			if (i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println();
		
		for (int i=2 ; i<10 ; i++) {
			System.out.println(i+"단 출력? (Y/N)");
			char cho = sc.next().charAt(0);
			if (cho == 'N') {
				break;
			} else {
				System.out.println("===== "+i+"단 =====");
				for (int j=1 ; j<10 ; j++) {
					System.out.println(i+"x"+j+" = "+i*j);
				}
			}
			System.out.println();
		}
		
		gugu:
		for (int i=2 ; i<10 ; i++) {
			for (int j=1 ; j<10 ; j++) {
				if (j>5) {
					break gugu;
				}
				System.out.println(i+"x"+j+" = "+i*j);
			}
		}
	}
	
	public void practice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하시오.");
		String str = sc.next();
		boolean flag = false;
		stop:
		for (int i=0 ; i<str.length() ; i++) {
			for(int j=0 ; j<str.length() ; j++) {
				if (i!=j && str.charAt(i)==str.charAt(j)){
					flag = true;
					System.out.println(str.charAt(i)+"중복!");
					break stop;
				}
			}
		}
		System.out.println(flag? "" : "중복값 없음");
	}
}