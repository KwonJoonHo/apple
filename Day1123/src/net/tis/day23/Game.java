package net.tis.day23;

import java.util.Scanner;
import java.lang.Math;

public class Game { //372������ �ڵ� ���
	public static void main(String[] args) {
		System.out.println("5ȸ�ȿ� ���� ���߱� ����");
		System.out.println("1���� 100������ ���ڸ� �Է����ּ���");
		int com = (int)(Math.random()*100)+1;
		//System.out.println("com���� = " + com);
		int i =0, my=0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
			i=i+1;
			System.out.print(i+"ȸ �����Է�>> ");
			my = Integer.parseInt(sc.nextLine());
			if(my == com) {
				System.out.println("\n �����մϴ�. �����Դϴ�!"); break;
				}
			if(my<=0 || my > 100) {
				System.out.println("���ڹ����� 1~100������ ���ڿ��� �մϴ�."); i=i-1; continue;
				}
			/////�������� �ڵ带 ���
			if(i==5) {System.out.println("\n5ȸ�� �ʰ��߽��ϴ� \n���� ��ȸ�� �̿��ϼ���"); break;}
			if(my>com) {
				System.out.println(my + "���� ���� �� �Դϴ�.");
				} else if(my<com) {
				System.out.println(my+"���� ū �� �Դϴ�.");
				}			
			//else {System.out.println("Ʋ�Ƚ��ϴ�.");}
				}catch (Exception e) {
				 System.out.println("����ε� ���ڸ� �Է����ּ���"); i=i-1;
				}
			
			}//for end
		sc.close();	
	}//main end
}//class END
