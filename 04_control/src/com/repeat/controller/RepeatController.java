package com.repeat.controller;

import java.util.Scanner;

public class RepeatController {
	
	//�⺻ for�� Ȱ���ϱ�
	public void basicFor() {
		//for��: for(�ʱ��; ���ǽ�; ������) {�ݺ��� �ڵ� �ۼ�}
		//�ʱ��: ������ ���� -> �ݺ��� �� ������ �Ǵ� ��(Ƚ���� ���� ��)
		//���ǽ�: �ݺ����� �ߴ��� �� �ִ� ���� -> true�� �ݺ��� ����, false�� �ݺ��� �ߴ�
		// **���ǽ� ��κ� �ʱ�Ŀ��� ������ ������ ���
		//������: �ʱ�Ŀ��� ������ ������ ������Ű�� ����
		
		//�ȳ��ϼ��� ������ 5�� ����ϼ���
		System.out.println("�ȳ��ϼ���");//1
		System.out.println("�ȳ��ϼ���");//2
		System.out.println("�ȳ��ϼ���");//3
		System.out.println("�ȳ��ϼ���");//4
		System.out.println("�ȳ��ϼ���");//5
		
		//for�� ����ؼ� �ȳ��ϼ��� ������ 5�� ����ϼ���
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("�ȳ��ϼ���");
		}
		
		//������ �������並 100�� ����ϼ���
		for(int i=1 ; i<=100 ; i++) {
			System.out.println("������ ��������");
		}
		
		//1���� 50���� ����ϴ� �ݺ���
		for(int i=1 ; i<=50 ; i++) {
			System.out.println(i);
		}
		
		//1. 1~100���� ������ ¦���� ����ϱ�
		for(int i=1 ; i<=100 ; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
		//2. 1~100���� ������ ¦���� ����ϱ�//1������ �� ȿ������
		for(int i=2 ; i<=100 ; i+=2) {
			System.out.println(i);
		}
		
		//1. 1~100���� ������ Ȧ���� ����ϱ�
		for(int i=1 ; i<=100 ; i++) {
			if (i%2==1) {
				System.out.println(i);
			}
		}
		
		//2. 1~100���� ������ Ȧ���� ����ϱ�//1������ �� ȿ������
		for(int i=1 ; i<=100 ; i+=2) {
			System.out.println(i);
		}
		
		//�л������� �Է¹޾� ����ϴ� ���α׷��� 5���� �л��� �Է¹޾� ����ϰ� �� ��(�̸�, ����, �г�)
		Scanner sc = new Scanner(System.in);
		System.out.println("=========== �л� ���� �ý��� ===========");
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("[�л����� �Է�]");
			System.out.print("�̸�: ");
			String name = sc.next();
			System.out.print("����: ");
			int age = sc.nextInt();
			System.out.print("�г�: ");
			int grade = sc.nextInt();
			System.out.printf("�̸�: %s, ����: %d, �г�: %d\n\n", name, age, grade);
		}
		
		//String�� nextLine���� �޾��� �� ���� ���� ���
		//1. �г���� �Է¹��� �� ���� ����
		//2. �̸� �Է¹ޱ� ������ if(i!=1) {sc.nextLine();} �ڵ� ����ϱ�
		
		//1���� 50���� �� �߿��� ¦���� ¦, Ȧ���� Ȧ ����ϱ�
		for(int i=1 ; i<=50 ; i++) {
			if(i%2==0) {
				System.out.println("¦");
			} else {
				System.out.println("Ȧ");
			}
		}
		
		//100���� 1���� ����ϴ� ���� �����ϱ�
		for(int i=100 ; i>=1 ; i--) {
			System.out.println(i);
		}
		
		//for�� Ȱ���ϱ�
		//for���� �ʱ��, ���ǽ�, �������� �� Ȱ���ؾ� �ϳ�??
		String msg = "";
		for(;!msg.equals("0");) {
			System.out.println("�Ǵ�?");//���� for��: ���ǽ��� false�� ���� �� ���� ������ ���� ��µ�
			msg = sc.next();//0�� �Է��ϸ� ����� ����
		}
		
		for(;;) {
			System.out.println("����� �ְ����� ���� for��");
		}
		//������ �� 2���� ����for�� ���� �Ŵ� for������ while���� �� ���� ��!!
		
	}
	
	//����for��
	public void extraFor() {
		
		//����ڰ� �Է��� ����ŭ �ݺ��ϴ� for�� �����Ͽ� �������� �Ҽ��ִ� ���!
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int su = sc.nextInt();
		for (int num=1 ; num<=su ; num++) {
			System.out.println("�������� �� �� �ִ�!");
		}
		
		//�л������� �Է¹޾� ����ϴ� ���α׷�
		//�Է��� �л��� ���� �Է¹ް� �� ����ŭ �л������� ����� �ϴ� ���α׷�
		System.out.println("=== �л����� ����� ���α׷� ===");
		System.out.print("�Է��� �л� ��: ");
		int num = sc.nextInt();
		String print = "";//���������� �����ϰ� �ٷ� ������� ���� ���� ������ �Է������ ��
		for (int i=1 ; i<=num ; i++) {
			System.out.print("�̸�: ");
			String name = sc.next();
			System.out.print("����: ");
			int age = sc.nextInt();
			System.out.print("�г�: ");
			int grade = sc.nextInt();
			print += name+" "+age+" "+grade+"\n";
			//print = name+" "+age+" "+grade+"\n";//���� �������� �ʰ� �������� �Էµ� �͸� ��µ�
		}
		System.out.println(print);
		
		//������ �հ�, ����� �����ִ� ���α׷� �ۼ�
		//�л� ���� �Է� �ް�, �л��� ���� ����, ����, ���� ������ �Է� �޾�
		//�л����� �հ�� ����� ���ϴ� ���α׷� �ۼ�
		System.out.println("==== ���� ����, ��� ��� �ý��� ====");
		System.out.print("�л� ��: ");
		int num2 = sc.nextInt();
		int sum = 0;
		for (int i=0 ; i<num2 ; i++) {
			System.out.print("����: ");
			sum += sc.nextInt();
			System.out.print("����: ");
			sum += sc.nextInt();
			System.out.print("����: ");
			sum += sc.nextInt();
			System.out.println("����: "+sum+" ���: "+sum/3.0);
			sum = 0; //why? sum�� �ʱ�ȭ
		}
		
		//���� ���� �� for���� i���� Ȱ���� �� ������?
		//�Ұ��� -> �������� �������� ����� �� ����
		//for (int i=0 ; i<5 ; i++) {
		//	int ����+i = 0;
		
		//for(int i) i���� �ٸ� ������ ����� �� ������?
		//: �ִ�. for�� �ȿ��� �� i�� for���� ������ �����.
		//  ���� ���� Ŭ���� �ȿ��� �ΰ��� for������ ���� i�� ���� �����ص� �������� ����
		
		//for�� ���ο��� ������ ������ �ܺο��� ����� �� ������?
		//: ����. (if���� ��������)
		
	}
	
	//���� ���α׷� �����
	//1. �ѹ��� ����Ǵ� ���� �����
	//2. ���� �Է��� ����ŭ ����� �� �ִ� ���� �����
	
	//1. �Է¹޴� ��: 2���� ��, ������ �Է¹޾� ó��
	//2. 1+�߰������� ����� ���� �Է¹���
	
	public void calculator1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== ����1 ========");
		System.out.println("1. ���� 2. ���� 3. ���� 4. ������");
		int cal = sc.nextInt();
		System.out.println("����� ���ڸ� �Է����ּ���.");
		System.out.print("����1: ");
		double num1 = sc.nextDouble();
		System.out.print("����2: ");
		double num2 = sc.nextDouble();
		switch (cal) {
			case 1: System.out.println(num1+num2); break;
			case 2: System.out.println(num1-num2); break;
			case 3: System.out.println(num1*num2); break;
			case 4: System.out.println(num1/num2); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
	}
	
	 public void calculator2() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("======== ����2 ========");
		 System.out.println("���Ͻô� ��� Ƚ���� �Է��Ͻÿ�.");
		 int num = sc.nextInt();
		 for(int i=0 ; i<num ; i++) {
			 System.out.println("1. ���� 2. ���� 3. ���� 4. ������");
			 int cal = sc.nextInt();
			 System.out.println("����� ���ڸ� �Է����ּ���.");
			 System.out.print("����1: ");
			 double num1 = sc.nextDouble();
			 System.out.print("����2: ");
			 double num2 = sc.nextDouble();
			 switch (cal) {
			 	case 1: System.out.println(num1+num2); break;
				case 2: System.out.println(num1-num2); break;
				case 3: System.out.println(num1*num2); break;
				case 4: System.out.println(num1/num2); break;
				default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			 
		 }
		 System.out.println("���Ⱑ ����Ǿ����ϴ�.");
		 
	 }
	
}
