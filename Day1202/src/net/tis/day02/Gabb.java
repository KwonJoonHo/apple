package net.tis.day02;

import java.util.Scanner;

public class Gabb {
	public static void main(String[] args) {
		int com=0,my=0,cnt=0,win=0,mu=0,lose=0,total=0,Gtotal=0;
		String msg="�ȳ�", my_msg="", com_msg="";
		Scanner sc = new Scanner(System.in);
		boolean flag=true;
		int sel=0;
		
		while(flag) {
			try {
			com = (int)(Math.random()*3)+1 ;
			System.out.println("com�ĳ���= " + com); //�ּ�ó������			
			System.out.println("�� : " + win + ", �� : " + mu + ", �� : " + lose + ", �� Ƚ�� : " + cnt + " �Դϴ�." );
			System.out.print("1.���� 2.���� 3.���ڱ� 9.���� ��ȣ�Է� >>> ");			
			sel = Integer.parseInt(sc.nextLine());
			if(sel==9) {
				System.out.println("\n���������� ������ �����մϴ�.");
				System.exit(1);
				flag=false;
				break;
			}
			switch(sel) {
			case 1 : 
				if(com==1) {
					mu =mu+1; cnt = cnt+1;
					my_msg="����"; com_msg="����";
					System.out.println("���� ������ : " + my_msg + "\t���� ������ : " + com_msg);
					System.out.println("�� " + cnt + "ȸ�� ����� �����ϴ�."); break;
				}
				else if(com==2) {
					lose =lose+1; cnt = cnt+1;
					my_msg="����"; com_msg="����";
					System.out.println("���� ������ : " + my_msg + "\t���� ������ : " + com_msg);
					System.out.println("�� " + cnt + "ȸ�� ����� �����ϴ�."); break;
				}
				else if(com==3) {
					win =win+1; cnt = cnt+1;
					my_msg="����"; com_msg="��";
					System.out.println("���� ������ : " + my_msg + "\t���� ������ : " + com_msg);
					System.out.println("�� " + cnt + "ȸ�� ����� �̰���ϴ�."); break;
				}
			case 2 : 
				if(com==2) {
					mu =mu+1; cnt = cnt+1;
					my_msg="����"; com_msg="����";
					System.out.println("���� ������ : " + my_msg + "\t���� ������ : " + com_msg);
					System.out.println("�� " + cnt + "ȸ�� ����� �����ϴ�."); break;
				}
				else if(com==3) {
					lose =lose+1; cnt = cnt+1;
					my_msg="����"; com_msg="��";
					System.out.println("���� ������ : " + my_msg + "\t���� ������ : " + com_msg);
					System.out.println("�� " + cnt + "ȸ�� ����� �����ϴ�."); break;
				}
				else if(com==1) {
					win =win+1; cnt = cnt+1;
					my_msg="����"; com_msg="����";
					System.out.println("���� ������ : " + my_msg + "\t���� ������ : " + com_msg);
					System.out.println("�� " + cnt + "ȸ�� ����� �̰���ϴ�."); break;
				}
			case 3 : 
				if(com==3) {
					mu =mu+1; cnt = cnt+1;
					my_msg="��"; com_msg="��";
					System.out.println("���� ������ : " + my_msg + "\t���� ������ : " + com_msg);
					System.out.println("�� " + cnt + "ȸ�� ����� �����ϴ�."); break;
				}
				else if(com==1) {
					lose =lose+1; cnt = cnt+1; 
					my_msg="��"; com_msg="����";
					System.out.println("���� ������ : " + my_msg + "\t���� ������ : " + com_msg);
					System.out.println("�� " + cnt + "ȸ�� ����� �����ϴ�."); break;
				}
				else if(com==2) {
					win =win+1; cnt = cnt+1;
					my_msg="��"; com_msg="����";
					System.out.println("���� ������ : " + my_msg + "\t���� ������ : " + com_msg);
					System.out.println("�� " + cnt + "ȸ�� ����� �̰���ϴ�."); break;
				}
			default : System.out.println("1~3�� �ϳ��� �Է��� �ּ���."); break;
			}
			} catch (Exception e) {System.out.println("���ڸ� �Է��� �ּ���.");}
		}//while end		
		
		sc.close();
	}//main end
}//Gabb class END
