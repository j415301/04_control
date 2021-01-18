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
	
	public void whileTest() {
		//while��
		
		//1~100���� ����غ���
		int i = 1;
		while (i<=100) {
			System.out.print(i+" ");
			i++;
		}
		
		//���ѹݺ�
//		while (true) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("===== ���� 02 =====");
//			System.out.println("�� ���� ����� �����Ͻðڽ��ϱ�?");
//			int count = sc.nextInt();
//			for (int f=0 ; f<count ; f++) {
//				System.out.print("��1: ");
//				int su1 = sc.nextInt();
//				System.out.print("������: ");
//				char op = sc.next().charAt(0);
//				System.out.print("��2: ");
//				int su2 = sc.nextInt();
//				switch (op) {
//					case '+': System.out.println(su1+su2); break;
//					case '-': System.out.println(su1-su2); break;
//					case '*': System.out.println(su1*su2); break;
//					case '/': System.out.println((double)su1/su2); break;
//					default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//				}
//			}
//			System.out.println("���⸦ �����Ͻðڽ��ϱ�? (Y/N)");
//			char yesno = sc.next().charAt(0);
//			if (yesno == 'Y') {
//				break;
//			}
//		}
//		
//		int j=1;
//		while (j==1) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("===== ���� 02 =====");
//			System.out.println("�� ���� ����� �����Ͻðڽ��ϱ�?");
//			int count = sc.nextInt();
//			for (int f=0 ; f<count ; f++) {
//				System.out.print("��1: ");
//				int su1 = sc.nextInt();
//				System.out.print("������: ");
//				char op = sc.next().charAt(0);
//				System.out.print("��2: ");
//				int su2 = sc.nextInt();
//				switch (op) {
//					case '+': System.out.println(su1+su2); break;
//					case '-': System.out.println(su1-su2); break;
//					case '*': System.out.println(su1*su2); break;
//					case '/': System.out.println((double)su1/su2); break;
//					default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//				}
//			}
//			System.out.println("���⸦ �����Ͻðڽ��ϱ�? (Y/N)");
//			char yesno = sc.next().charAt(0);
//			if (yesno == 'Y') {
//				break;
//			}
//		}
		System.out.println();
		
		//do ~ while��
		int a = 10;
		while (a>10) {
			System.out.println(a);
		}//�ƹ��͵� ��µ��� ����
		
		do {
			System.out.println(a);
		} while (a>10);
	}
	
	public void doubleForTest() {
		//��ø �ݺ���
		
		for (int i=0 ; i<10 ; i++) {
			System.out.println("�ܰ�: "+i);
			for (int j=0 ; j<10 ; j++) {
				System.out.print("����: "+j+" ");
			}
			System.out.println();
		}
		
		//������ ����ϱ�
		for (int i=2 ; i<10 ; i++) {
			System.out.println("===== "+i+"�� =====");
			for (int j=1 ; j<10 ; j++) {
				System.out.println(i+"x"+j+" = "+i*j);
			}
		}
		
		//�Է¹��� ���� �� ���ں� �ߺ����� Ȯ��
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���ڿ��� �Է��Ͻÿ�.");
//		String voca = sc.next();
//		int count = 0;
//		for (int i=0 ; i<voca.length() ; i++) {
//			for (int j=0 ; j<voca.length() ; j++) {
//				if (voca.charAt(i)==voca.charAt(j) && i!=j) {
//					count++;
//				}
//			}
//			System.out.println(voca.charAt(i)+" �ߺ� Ƚ��: "+count);
//		}
		
		//�� ���
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
//			System.out.println("===== �����ֹ� ���α׷� ====");
//			System.out.println("1. ȸ\n2. �����\n3. ������\n4. ������ġ");
//			System.out.print("�Է� : ");
//			int cho = sc.nextInt();
//			switch (cho) {
//				case 1: orderMenu += "ȸ\t"; break;
//				case 2: orderMenu += "�����\t"; break;
//				case 3: orderMenu += "������\t"; break;
//				case 4: orderMenu += "������ġ\t"; break;
//			}
//			System.out.println("��� �ֹ��Ͻðڽ��ϱ�? (Y/N)");
//			char yesno = sc.next().charAt(0);
//			if (yesno == 'N') {
//				System.out.println("===== �ֹ� ���� =====");
//				System.out.println(orderMenu);
//				break;
//			}
//		}
//		System.out.println("[�ֹ� ���α׷� ����]");
		
		for (int i=0 ; i<10 ; i++) {
			if (i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println();
		
		for (int i=2 ; i<10 ; i++) {
			System.out.println(i+"�� ���? (Y/N)");
			char cho = sc.next().charAt(0);
			if (cho == 'N') {
				break;
			} else {
				System.out.println("===== "+i+"�� =====");
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
		System.out.println("���ڿ��� �Է��Ͻÿ�.");
		String str = sc.next();
		boolean flag = false;
		stop:
		for (int i=0 ; i<str.length() ; i++) {
			for(int j=0 ; j<str.length() ; j++) {
				if (i!=j && str.charAt(i)==str.charAt(j)){
					flag = true;
					System.out.println(str.charAt(i)+"�ߺ�!");
					break stop;
				}
			}
		}
		System.out.println(flag? "" : "�ߺ��� ����");
	}
}