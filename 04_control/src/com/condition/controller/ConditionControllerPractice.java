package com.condition.controller;

import java.util.Scanner;

public class ConditionControllerPractice {
	
	public void ifTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		//���׿�����
		System.out.println(num>0? "����Դϴ�." : "");
		//if��
		if (num>0) {
			System.out.println("����Դϴ�.");
			String name = "�Ǵ�?";
			System.out.println(name);
			//String email = sc.next();
			//int num = 0;
		}
		
		//System.out.println(name);
		System.out.println("======================");
		
		//�̸��� �Է¹ް� �ڽ��� �̸��� ������ �̸��� �ԷµǸ�
		//���� �ڵ��� �� �� �� �ִ�.�� ���, �ƴϸ� �ƹ� �͵� ���� �ʴ� ���� �����ϱ�
		System.out.print("�̸�: ");
		String name = sc.next();
		if (name.equals("������")) {
			System.out.println("���� �ڵ��� �� �� �� �ִ�.");
		}
		System.out.println("========================");
		
		//����, ����, ������ �Է¹ް� ����� 60�� �̻��̸� �հ��Դϴ� ����ϱ�
		System.out.print("����: ");
		int total = sc.nextInt();
		System.out.print("����: ");
		total += sc.nextInt();
		System.out.print("����: ");
		total += sc.nextInt();
		if (total/3>=60) {
			System.out.println("�հ��Դϴ�.");
		}
		System.out.println("=======================");
		
		//���� �� ���� �Է¹޾� ������ ¦���� ¦���ٸ� ����ϴ� ���
		System.out.print("���� �Է�: ");
		int num2 = sc.nextInt();
		if (num2%2==0) {
			System.out.println("¦����.");
		}
		System.out.println("======================");
		
		//���̵�� �н����带 �Է¹޾� ���̵� admin, �н����尡 admin�� �� �α��� ���� ����ϱ�
		System.out.print("���̵�: ");
		String id = sc.next();
		System.out.print("��й�ȣ: ");
		String pw = sc.next();
		if (id.equals("admin") && pw.equals("admin")) {
			System.out.println("�α��� ����");
		}
		System.out.println("=====================");
		
	}
	
	public void ifelseTest() {
		//if ~ else
		
		//�Է¹��� ���� ����� ����Դϴ� ���, ������ �����Դϴ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		if (num>0) {
			System.out.println("����Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
		System.out.println("======================");
		
		//�̼����ڴ� ������ �Ұ����� ������ ����
		//������ ���� ���� ���, �̼����ڴ� �Ұ��� ���
		System.out.println("���̸� �Է��Ͻÿ�.");
		int age = sc.nextInt();
		if (age>=20) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� �Ұ���");
		}
		System.out.println("======================");
		
	}
	
	public void ifelseifTest() {
		//if ~ else if ~ else
		
		//������ �Է¹޾� ������ ���� ����̾簡 ������� ������ (10���� �ڸ�)
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�.");
		int result = sc.nextInt();
		if (result>=90) {
			System.out.println("��");
		} else if (result>=80) {
			System.out.println("��");
		} else if (result>=70) {
			System.out.println("��");
		} else if (result>=60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
		System.out.println("==========================");
		
		//���ɺ� �޼��� ����ϱ�
		System.out.println("���̸� �Է��Ͻÿ�.");
		int age = sc.nextInt();
		if(age>=10 && age<20) {
			System.out.println("������ �����ؾ��� -> ���� ���� ����");
		} else if (age<30) {
			System.out.println("������ �����ؾ��� -> �������");
		} else if (age<40) {
			System.out.println("������ ���ؾ��� -> ��ȥ����");
		} else if (age<50) {
			System.out.println("������ ���ؾ��� -> �ڽĵ� ������");
		} else {
			System.out.println("������ ���ؾ��� -> ����, �ճ� ����");
		}
		
		//id�ϰ� pw �Է� �ް�
		//id�� user01�̰� pw�� user01�̸� �α��� ����
		//id�� user01�̰� pw�� user01�� �ƴϸ� �н����尡 Ʋ���ϴ�
		//id�� user01�� �ƴϰ� pw�� user01�̸� ���̵� Ʋ���ϴ�
		//id, pw�� user01�� �ƴϸ� ��� Ʋ���ϴ�
		System.out.print("���̵�: ");
		String id = sc.next();
		System.out.print("��й�ȣ: ");
		String pw = sc.next();
		if (id.equals("user01") && pw.equals("user01")) {
			System.out.println("�α��� ����");
		} else if (id.equals("user01") && !pw.equals("user01")) {
			System.out.println("�н����尡 Ʋ���ϴ�");
		} else if (!id.equals("user01") && pw.equals("user01")) {
			System.out.println("���̵� Ʋ���ϴ�");
		} else {
			System.out.println("��� Ʋ���ϴ�");
		}
		
	}
	
	public void doubleifTest() {
		
		//���̰� �����̸鼭 �������� ���� ȸ������, �ܱ����� �ܱ��ε�Ϲ�ȣ ���� Ȯ�� �� ������ �Է�, ������ ���� �Ұ�
		//������ �ƴ϶�� ������ �� �����ϴ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���.");
		int age = sc.nextInt();
		if (age>=20) {
			System.out.println("�������̽Ű���? (Y/N)");
			char nation = sc.next().charAt(0);
			if (nation == 'Y') {
				System.out.println("[������ ȸ������]");
				System.out.print("�̸�: ");
				String name = sc.next();
			} else {
				System.out.println("�ܱ��ε�Ϲ�ȣ ���� (Y/N)");
				char foreigner = sc.next().charAt(0);
				if (foreigner == 'Y') {
					System.out.println("[�ܱ��� ȸ������]");
					System.out.print("�̸�: ");
					String name = sc.next();
				} else {
					System.out.println("ȸ������ �Ұ�");
				}
			}
			
		} else {
			System.out.println("������ �� �����ϴ�.");
		}
		
	}
	
	public void switchTest() {
		
		//����
		Scanner sc = new Scanner(System.in);
		System.out.println("==== ������ ���ɸ޴���? ====");
		System.out.println("1. �Ľ�Ÿ 2. ����Ұ�� 3. ������ġ 4. �ø�");
		int choice = sc.nextInt();
		switch (choice) {
			case 1: System.out.println("�Ľ�Ÿ"); break;
			case 2: System.out.println("����Ұ��"); break;
			case 3: System.out.println("������ġ"); break;
			case 4: System.out.println("�ø�"); break;
			default: System.out.println("�ƹ��ų� �Ծ�!");
		}
		
		//���ڿ�
		System.out.println("�Ľ�Ÿ / ����Ұ��?");
		String name = sc.next();
		switch (name) {
			case "�Ľ�Ÿ": System.out.println("����"); break;
			case "����Ұ��": System.out.println("���ٿ� �μ� �Ա�"); break;
			default: System.out.println("�ƹ��ų� �Ծ�!");
		}
		
		//char
		System.out.println("��. �ڹ�, ��. ����Ŭ, ��. html/css");
		char choice2 = sc.next().charAt(0);
		switch (choice2) {
			case '��': System.out.println("�ڹٴ� ����!�� ���ϰ� �ʹ�!"); break;
			case '��': System.out.println("����Ŭ�� DB"); break;
			case '��': System.out.println("html/css ȭ�鱸��"); break;
		}
		
	}

}
