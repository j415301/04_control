package com.repeat.controller;

import java.util.Scanner;

public class RepeatController {
	
	//기본 for문 활용하기
	public void basicFor() {
		//for문: for(초기식; 조건식; 증감식) {반복할 코드 작성}
		//초기식: 변수에 선언 -> 반복할 때 기준이 되는 값(횟수를 세는 값)
		//조건식: 반복문을 중단할 수 있는 조건 -> true면 반복문 실행, false면 반복문 중단
		// **조건식 대부분 초기식에서 선언한 변수를 사용
		//증감식: 초기식에서 선언한 변수를 증감시키는 연산
		
		//안녕하세요 문구를 5번 출력하세요
		System.out.println("안녕하세요");//1
		System.out.println("안녕하세요");//2
		System.out.println("안녕하세요");//3
		System.out.println("안녕하세요");//4
		System.out.println("안녕하세요");//5
		
		//for문 사용해서 안녕하세요 문구를 5번 출력하세요
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("안녕하세요");
		}
		
		//여러분 힘내세요를 100번 출력하세요
		for(int i=1 ; i<=100 ; i++) {
			System.out.println("여러분 힘내세요");
		}
		
		//1부터 50까지 출력하는 반복문
		for(int i=1 ; i<=50 ; i++) {
			System.out.println(i);
		}
		
		//1. 1~100까지 수에서 짝수만 출력하기
		for(int i=1 ; i<=100 ; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
		//2. 1~100까지 수에서 짝수만 출력하기//1번보다 더 효율적임
		for(int i=2 ; i<=100 ; i+=2) {
			System.out.println(i);
		}
		
		//1. 1~100까지 수에서 홀수만 출력하기
		for(int i=1 ; i<=100 ; i++) {
			if (i%2==1) {
				System.out.println(i);
			}
		}
		
		//2. 1~100까지 수에서 홀수만 출력하기//1번보다 더 효율적임
		for(int i=1 ; i<=100 ; i+=2) {
			System.out.println(i);
		}
		
		//학생정보를 입력받아 출력하는 프로그램이 5명의 학생을 입력받아 출력하게 할 것(이름, 나이, 학년)
		Scanner sc = new Scanner(System.in);
		System.out.println("=========== 학생 정보 시스템 ===========");
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("[학생정보 입력]");
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("나이: ");
			int age = sc.nextInt();
			System.out.print("학년: ");
			int grade = sc.nextInt();
			System.out.printf("이름: %s, 나이: %d, 학년: %d\n\n", name, age, grade);
		}
		
		//String을 nextLine으로 받았을 때 버퍼 비우는 방법
		//1. 학년까지 입력받은 후 버퍼 비우기
		//2. 이름 입력받기 이전에 if(i!=1) {sc.nextLine();} 코드 사용하기
		
		//1부터 50까지 수 중에서 짝수면 짝, 홀수면 홀 출력하기
		for(int i=1 ; i<=50 ; i++) {
			if(i%2==0) {
				System.out.println("짝");
			} else {
				System.out.println("홀");
			}
		}
		
		//100부터 1까지 출력하는 로직 구현하기
		for(int i=100 ; i>=1 ; i--) {
			System.out.println(i);
		}
		
		//for문 활용하기
		//for문의 초기식, 조건식, 증감식을 다 활용해야 하나??
		String msg = "";
		for(;!msg.equals("0");) {
			System.out.println("되니?");//무한 for문: 조건식을 false로 만들 수 없기 때문에 무한 출력됨
			msg = sc.next();//0을 입력하면 출력이 멈춤
		}
		
		for(;;) {
			System.out.println("세계관 최강자의 무한 for문");
		}
		//하지만 이 2개의 무한for문 같은 거는 for문보다 while문을 더 많이 씀!!
		
	}
	
	//응용for문
	public void extraFor() {
		
		//사용자가 입력한 수만큼 반복하는 for문 구성하여 여러분은 할수있다 출력!
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int su = sc.nextInt();
		for (int num=1 ; num<=su ; num++) {
			System.out.println("여러분은 할 수 있다!");
		}
		
		//학생정보를 입력받아 출력하는 프로그램
		//입력할 학생의 수를 입력받고 그 수만큼 학생정보를 입출력 하는 프로그램
		System.out.println("=== 학생정보 입출력 프로그램 ===");
		System.out.print("입력할 학생 수: ");
		int num = sc.nextInt();
		String print = "";//지역변수를 선언하고 바로 사용하지 않을 때는 공값을 입력해줘야 함
		for (int i=1 ; i<=num ; i++) {
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("나이: ");
			int age = sc.nextInt();
			System.out.print("학년: ");
			int grade = sc.nextInt();
			print += name+" "+age+" "+grade+"\n";
			//print = name+" "+age+" "+grade+"\n";//값을 누적하지 않고 마지막에 입력된 것만 출력됨
		}
		System.out.println(print);
		
		//성적의 합계, 평균을 구해주는 프로그램 작성
		//학생 수를 입력 받고, 학생에 대한 국어, 영어, 수학 성적을 입력 받아
		//학생수별 합계와 평균을 구하는 프로그램 작성
		System.out.println("==== 성적 총점, 평균 출력 시스템 ====");
		System.out.print("학생 수: ");
		int num2 = sc.nextInt();
		int sum = 0;
		for (int i=0 ; i<num2 ; i++) {
			System.out.print("국어: ");
			sum += sc.nextInt();
			System.out.print("영어: ");
			sum += sc.nextInt();
			System.out.print("수학: ");
			sum += sc.nextInt();
			System.out.println("총점: "+sum+" 평균: "+sum/3.0);
			sum = 0; //why? sum값 초기화
		}
		
		//변수 선언 시 for문의 i값을 활용할 수 있을까?
		//불가능 -> 변수명은 동적으로 사용할 수 없다
		//for (int i=0 ; i<5 ; i++) {
		//	int 변수+i = 0;
		
		//for(int i) i값은 다른 곳에서 사용할 수 있을까?
		//: 있다. for문 안에서 쓴 i는 for문이 끝나면 사라짐.
		//  따라서 같은 클래스 안에서 두개의 for문에서 각각 i를 변수 지정해도 에러나지 않음
		
		//for문 내부에서 선언한 변수는 외부에서 사용할 수 있을까?
		//: 없다. (if문과 마찬가지)
		
	}
	
	//계산기 프로그램 만들기
	//1. 한번만 실행되는 계산기 만들기
	//2. 내가 입력한 수만큼 계산할 수 있는 계산기 만들기
	
	//1. 입력받는 수: 2개의 수, 연산자 입력받아 처리
	//2. 1+추가적으로 계산할 수를 입력받음
	
	public void calculator1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== 계산기1 ========");
		System.out.println("1. 덧셈 2. 뺄셈 3. 곱셈 4. 나눗셈");
		int cal = sc.nextInt();
		System.out.println("계산할 숫자를 입력해주세요.");
		System.out.print("숫자1: ");
		double num1 = sc.nextDouble();
		System.out.print("숫자2: ");
		double num2 = sc.nextDouble();
		switch (cal) {
			case 1: System.out.println(num1+num2); break;
			case 2: System.out.println(num1-num2); break;
			case 3: System.out.println(num1*num2); break;
			case 4: System.out.println(num1/num2); break;
			default: System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	 public void calculator2() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("======== 계산기2 ========");
		 System.out.println("원하시는 계산 횟수를 입력하시오.");
		 int num = sc.nextInt();
		 for(int i=0 ; i<num ; i++) {
			 System.out.println("1. 덧셈 2. 뺄셈 3. 곱셈 4. 나눗셈");
			 int cal = sc.nextInt();
			 System.out.println("계산할 숫자를 입력해주세요.");
			 System.out.print("숫자1: ");
			 double num1 = sc.nextDouble();
			 System.out.print("숫자2: ");
			 double num2 = sc.nextDouble();
			 switch (cal) {
			 	case 1: System.out.println(num1+num2); break;
				case 2: System.out.println(num1-num2); break;
				case 3: System.out.println(num1*num2); break;
				case 4: System.out.println(num1/num2); break;
				default: System.out.println("잘못 입력하셨습니다.");
			}
			 
		 }
		 System.out.println("계산기가 종료되었습니다.");
		 
	 }
	
}
