package net.tis.day20;
import java.util.Scanner;
public class AutoSellMachine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sel=9, money=1000;//�⺻��
		System.out.print("������ �ݾ��� �Է����ּ��� >> ");
		money=Integer.parseInt(sc.nextLine());
		while(true) {
			
		try {
			System.out.println("�ڵ��Ǹű� �Դϴ�. (���� �ݾ� "+money+"��)");		
			System.out.println("1.�ݶ�(500��) 2.������(150��) 3.Ŀ��(300��) 9.�ܵ���ȯ");	
			System.out.print("���Ͻô� ���Ḧ ����ּ��� >>");
			sel=Integer.parseInt(sc.nextLine());
			if(sel==9) {
				System.out.println("�ܵ� " + money + "���� ��ȯ�˴ϴ�.");
				break;}
			switch(sel) {
			case 1:
				money=money-500;
				System.out.println("�ݶ� ���̽��ϴ�.");
				System.out.println("���� �ݾ��� "+money+"��");
				break;
			case 2:
				money=money-150;
				System.out.println("�������� ���̽��ϴ�.");
				System.out.println("���� �ݾ��� "+money+"��");
				break;
			case 3:
				money=money-300;
				System.out.println("Ŀ�Ǹ� ���̽��ϴ�.");
				System.out.println("���� �ݾ��� "+money+"��");
				break;
			default:
				System.out.println("1~3�޴��� �����ϼž� �մϴ�.");
				break;
			}//switch end
		}catch (Exception e) { }
		
		}//while end
		
		sc.close();
	}//for end
}

