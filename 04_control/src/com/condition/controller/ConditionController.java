package com.condition.controller;

import java.util.Scanner;

public class ConditionController {
	
	public void ifTest() {
		//�⺻ if Ȱ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		//�Է¹��� ���� ����� ����Դϴ� ���, �ƴϸ� �ƹ� �͵� ���� ����.
		int num = sc.nextInt();
		//���׿�����
		System.out.println(num>0? "����Դϴ�" : "");
		//if������ �����Ϸ���?
		if (num>0) {
			System.out.println("����Դϴ�.");
			//���� ���� ����
//			String name = "�Ǵ�?";
//			System.out.println(name);
			//�ۿ��� ������ Ŭ���� ��� ����
//			String email = sc.next();
			//int num = 0;//error, if���� ����Ǵ� Ŭ�������� ��Ʋ�� ���� �ߺ� �Ұ�
		}//���ǹ��� true��� ��ȣ �� ��� ������ ��������� false��� ��� ���õ�(else�� �����Ƿ�)
		//System.out.println(name);//error, if���� ������ ������ �ܺο��� ����� �� ����
		System.out.println("=====�޼ҵ� ��!====");
		
		//�̸��� �Է¹ް� �ڽ��� �̸��� ������ �̸��� �ԷµǸ�
		//���� �ڵ��� �� �� �� �ִ�.�� ���, �ƴϸ� �ƹ� �͵� ���� �ʴ� ���� �����ϱ�
		System.out.println("����� �̸���?");
		String name = sc.next();
		if (name.equals("������")) {
			System.out.println("���� �ڵ��� �� �� �� �ִ�.");
		}
		System.out.println("===============================");
		
		//����, ����, ������ �Է¹ް� ����� 60�� �̻��̸� �հ��Դϴ� ����ϱ�
		System.out.print("����: ");
		int kor = sc.nextInt();
		System.out.print("����: ");
		int eng = sc.nextInt();
		System.out.print("����: ");
		int math = sc.nextInt();
		if ((kor+eng+math)/3>=60) {
			System.out.println("�հ��Դϴ�.");
		}
//			//���� ������ �ٸ� �ڵ�� ǥ���ϱ�
//			System.out.println("����: ");
//			int total = sc.nextInt();
//			System.out.println("����: ");
//			total += sc.nextInt();
//			System.out.println("����: ");
//			total += sc.nextInt();
//			if (total/3>=60) {
//				System.out.println("�հ��Դϴ�.");
//			}
		System.out.println("===============================");
		
		//���� �� ���� �Է¹޾� ������ ¦���� ¦���ٸ� ����ϴ� ���
		System.out.print("���� �Է�:");
		int num2 = sc.nextInt();
		if (num2%2==0) {
			System.out.println("¦����");
		}
		System.out.println("===============================");
		
		//���̵�� �н����带 �Է¹޾� ���̵� admin, �н����尡 admin�� �� �α��� ���� ����ϱ�
		System.out.print("���̵�: ");
		String id = sc.next();
		System.out.print("�н�����: ");
		String pw = sc.next();
		if (id.equals("admin") && pw.equals("admin")) {
			System.out.println("�α��� ����");
		}
		
	}
	
	public void ifelseTest() {
		//if ~ else�� Ȱ���ϱ�
		//if ~ else���� �� ���� �׷��̹Ƿ� else ���� ����� �� ����.
		//���ǿ� ���� �ݵ�� �� �� �ϳ��� ����ȴ�.
		
		//�Է¹��� ���� ����� ����Դϴ� ���, ������ �����Դϴ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int su = sc.nextInt();
		if (su>0) {
			System.out.println("����Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
		
		//�̼����ڴ� ������ �Ұ����� ������ ����
		//������ ���� ���� ���, �̼����ڴ� �Ұ��� ���
		System.out.print("����: ");
		int age = sc.nextInt();
		if (age>=20) {
			System.out.println("���� ����");
			System.out.println("====== ȸ�� ���� ======");
			System.out.print("���̵�: ");
			String id = sc.next();
			System.out.print("�н�����: ");
			String pw = sc.next();
			sc.nextLine();
			System.out.print("�г���: ");
			String nickname = sc.nextLine();
		} else {
			System.out.println("���� �Ұ���");
		}
		
		//if�� �� �� ����� �Ͱ� if ~ else�� ����ϴ� ���� ����
		//�� ���� if���� ������ ����� -> ���� if�� ���� if�� ������ ��ġ�� ���� �� ����
		
	}
	
	public void ifelseifTest() {
		//if ~ else if ~ else
		//������ ��� ���� ���������� ��� ���(�� ���ǿ� �ش���� �����鼭 �ٸ� ������ ������ ��)
				
		//������ �Է¹޾� ������ ���� ����̾簡 ������� ������ (10���� �ڸ�)
		Scanner sc = new Scanner(System.in);
		System.out.print("����Է�: ");
		double avg = sc.nextDouble();
		if (avg<=100 && avg>=90) {
			System.out.println("���: ��");
		} else if (avg>=80) {//else if���� �� �ڵ尡 ���ԵǾ� ���� -> !(avg<=100 && avg>=90) && avg>=80
			System.out.println("���: ��");
		} else if (avg>=70) {
			System.out.println("���: ��");
		} else if (avg>=60) {
			System.out.println("���: ��");
		} else {
			System.out.println("���: ��");
		}
		
		//���ɺ� �޼��� ����ϱ�
		//10��: ������ �����ؾ��� -> ���� ���� ����
		//20��: ������ �����ؾ��� -> �������
		//30��: ������ ���ؾ��� -> ��ȥ����
		//40��: ������ ���ؾ��� -> �ڽĵ� ������
		//50��: ������ ���ؾ��� -> ����, �ճ� ����
		System.out.println("���̴�?");
		int age = sc.nextInt();
		if (age>=10 && age<20) {
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
		System.out.print("ID: ");
		String id = sc.next();
		System.out.print("PASSWORD: ");
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
		//��ø if��: ������ �Ǵ� ���ǿ� ���� �����ϰ� �� �ȿ��� �ٽ� if���� ����ϴ� ��
		//���̰� �����̸鼭 �������� ���� ȸ������, �ܱ����� �ܱ��ε�Ϲ�ȣ ���� Ȯ�� �� ������ �Է�, ������ ���� �Ұ�
		//������ �ƴ϶�� ������ �� �����ϴ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("==== khŬ�� ȸ������ ====");
		System.out.println("����� ���̴�?");
		int age = sc.nextInt();
		System.out.println("����� ������?");
		String nation = sc.next();
		if (age>=20) {
			if (nation.equals("���ѹα�")) {
				System.out.println("== ������ ȸ������ ==");
				System.out.print("�̸�: ");
				String name = sc.next();
			} else {
				System.out.println("�ܱ��ε�Ϲ�ȣ ���� (1: �ִ� / 2: ����)");
				int choice = sc.nextInt();
				if (choice == 1) {
					System.out.println("== �ܱ��� ȸ������ ==");
					System.out.print("�̸�: ");
					String name = sc.next();//������ ȸ�������� �ϴ� ���๮�� �ߺ������� ���� �ʴ� ������
					                        //�� ������ true�̸� �� ������ ������� �ʰ�,
					                        //�� ������ false�� �� ���Ǹ� �����
					                        //���� ����Ǵ� ���� �ߺ����� �ʱ� ������ �ߺ������� ���� ����
				} else {
					System.out.println("������ �� �����ϴ�.");
				}
			}
		} else {
			System.out.println("������ �� �����ϴ�.");
		}
		
	}
	
	public void switchTest() {
		//switch��: ���ǹ����� ����Ǵ� ���� ���� �б�ó�� �ϴ� ���
		//���� �񱳸� ������
		
		//���ǹ��� ���� �� �ִ� ������ ����
		//���� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("====== ������ ���ɸ޴���? ======");
		System.out.println("1. �Ľ�Ÿ 2. ����Ұ�� 3. ������ġ 4. �ø�");
		int choice = sc.nextInt();
		switch(choice) {
			case 1: System.out.println("���� �ϳ�~"); break;
			case 2: System.out.println("15�Դϴ�~"); break;
			case 3: System.out.println("�������~"); break;
			case 4: System.out.println("����ø�"); break;
			default: System.out.println("���� ��!"); break;
		}
		
		//���ڿ� ����
		System.out.println("�Ľ�Ÿ / ����Ұ��?");
		String name = sc.next();
		switch(name) {
			case "�Ľ�Ÿ": System.out.println("�Ľ�Ÿ ���ִ�"); break;
			case "����Ұ��": System.out.println("����Ұ�� ���ִ�"); break;
		}
		
		//char ����
		System.out.println("��. �ڹ�, ��. ����Ŭ, ��. html/css");
		char choice2 = sc.next().charAt(0);
		switch(choice2) {
			case '��': System.out.println("�ڹٴ� ����!�� ���ϰ� �ʹ�!"); break;
			case '��': System.out.println("����Ŭ�� DB"); break;
			case '��': System.out.println("html/css ȭ�鱸��"); break;
		}
		
		//boolean��, �Ǽ���: �Ұ���
//		int su = 100;
//		switch(su>50) {
//		}
//		double dnum = 3.14;
//		switch(dnum) {
//		}
		
		//break���� ����ϴ� ����
		System.out.println("������ ���ɸ޴�?");
		System.out.println("1. ������ 2. ���� 3. «�� 4.���");
		int choice3 = sc.nextInt();
		switch (choice3) {
			case 1:
				System.out.println("�������� �ſ�!");
				ifTest();//���� Ŭ���� �߰�ȣ�� �ִ� �żҵ� ȣ�� 
				break;//switch������ �� ������ �� �� ������, �̷����� ���� if���� ���� �� ȿ����..����
			case 2: System.out.println("���� �԰� �� ����!");
			case 3: System.out.println("�� «��!");
			case 4: System.out.println("�ٻ��� ���!");
		}//break�� ������ ������ case �̿ܿ� �� �ؿ� �ִ� case�� ��� �����
	}

}