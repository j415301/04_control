package com.repeat.controller;

import java.util.Scanner;

public class RepeatControllerPractice {
	
	public void basicFor() {
		//�ȳ��ϼ��� ������ 5�� ����ϼ���
		for(int i=0 ; i<5 ; i++) {
			System.out.println("�ȳ��ϼ���");
		}
		
		//������ �������並 100�� ����ϼ���
		for(int i=0 ; i<100 ; i++) {
			System.out.println("������ ��������");
		}
		
		//1���� 50���� ����ϴ� �ݺ���
		for(int i=1 ; i<=50 ; i++) {
			System.out.println(i);
		}
		
		//1~100���� ������ ¦���� ����ϱ�
		for(int i=0 ; i<=100 ; i+=2) {
			System.out.println(i);
		}
		
		//1~100���� ������ Ȧ���� ����ϱ�
		for(int i=1 ; i<100 ; i+=2) {
			System.out.println(i);
		}
		
		//�л������� �Է¹޾� ����ϴ� ���α׷��� 5���� �л��� �Է¹޾� ����ϰ� �� ��(�̸�, ����, �г�)
		Scanner sc = new Scanner(System.in);
//		System.out.println("===== �л� ���� �ý��� =====");
//		for(int i=1 ; i<=5 ; i++) {
//			System.out.println("[�л����� �Է�]");
//			System.out.print("�̸�: ");
//			String name = sc.next();
//			System.out.print("����: ");
//			int age = sc.nextInt();
//			System.out.print("�г�: ");
//			int grade = sc.nextInt();
//			System.out.printf("�̸�: %s, ����: %d, �г�: %d\n\n", name, age, grade);
//		}
		
		//1���� 50���� �� �߿��� ¦���� ¦, Ȧ���� Ȧ ����ϱ�
		for (int i=1 ; i<=50 ; i++) {
			if (i%2==0) {
				System.out.println("¦");
			} else {
				System.out.println("Ȧ");
			}
		}
		
		//100���� 1���� ����ϴ� ���� �����ϱ�
		for(int i=100 ; i>0 ; i--) {
			System.out.println(i);
		}
		
		//for���� �ʱ��, ���ǽ�, �������� �� Ȱ���ؾ� �ϳ�??
		String msg = "";
		for (; !msg.equals("0") ;) {
			System.out.println("�Ǵ�?");
			msg = sc.next();
		}
		
		for (;;) {
			System.out.println("�� ��������~~");
		}
	}
	
	public void extraFor() {
		//����ڰ� �Է��� ����ŭ �ݺ��ϴ� for�� �����Ͽ� �������� �Ҽ��ִ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int su = sc.nextInt();
		for(int i=0 ; i<su ; i++) {
			System.out.println("�������� �Ҽ��ִ�");
		}
		
		//�л������� �Է¹޾� ����ϴ� ���α׷�
		//�Է��� �л��� ���� �Է¹ް� �� ����ŭ �л������� ����� �ϴ� ���α׷�
		System.out.println("===== �л� ���� ����� �ý��� =====");
		System.out.print("�Է��� �л� ��: ");
		int stu = sc.nextInt();
		String print = "";
		for (int i=0 ; i<stu ; i++) {
			System.out.print("�̸�: ");
			String name = sc.next();
			System.out.print("����: ");
			int age = sc.nextInt();
			System.out.print("�г�: ");
			int grade = sc.nextInt();
			print += name+" "+age+" "+grade+"\n";
		}
		System.out.println(print);
		
		//������ �հ�, ����� �����ִ� ���α׷� �ۼ�
		//�л� ���� �Է� �ް�, �л��� ���� ����, ����, ���� ������ �Է� �޾�
		//�л����� �հ�� ����� ���ϴ� ���α׷� �ۼ�
		System.out.println("==== ���� ����, ��� ��� �ý��� ====");
		System.out.print("�л� ��: ");
		int stu2 = sc.nextInt();
		for (int i=0 ; i<stu2 ; i++) {
			System.out.print("����: ");
			int total = sc.nextInt();
			System.out.print("����: ");
			total += sc.nextInt();
			System.out.print("����: ");
			total += sc.nextInt();
			System.out.println("����: "+total+" ���: "+total/3.0);
		}
	}
	
	//���� ���α׷� �����
	//1. �ѹ��� ����Ǵ� ���� �����
	//   �Է¹޴� ��: 2���� ��, ������ �Է¹޾� ó��
	//2. ���� �Է��� ����ŭ ����� �� �ִ� ���� �����
	//   1+�߰������� ����� ���� �Է¹���
	public void calculator1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== ���� 01 =====");
		System.out.print("��1: ");
		int su1 = sc.nextInt();
		System.out.print("������: ");
		char op = sc.next().charAt(0);
		System.out.print("��2: ");
		int su2 = sc.nextInt();
		switch (op) {
			case '+': System.out.println(su1+su2); break;
			case '-': System.out.println(su1-su2); break;
			case '*': System.out.println(su1*su2); break;
			case '/': System.out.println((double)su1/su2); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void calculator2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== ���� 02 =====");
		System.out.println("�� ���� ����� �����Ͻðڽ��ϱ�?");
		int count = sc.nextInt();
		for (int i=0 ; i<count ; i++) {
			System.out.print("��1: ");
			int su1 = sc.nextInt();
			System.out.print("������: ");
			char op = sc.next().charAt(0);
			System.out.print("��2: ");
			int su2 = sc.nextInt();
			switch (op) {
				case '+': System.out.println(su1+su2); break;
				case '-': System.out.println(su1-su2); break;
				case '*': System.out.println(su1*su2); break;
				case '/': System.out.println((double)su1/su2); break;
				default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}

}
