package net.tis.day01;

import java.util.Calendar;

public class TestJumin {

	public static void main(String[] args) {
		String jumin="891214-1793485";
		//����1 ���� 2020-1989 CalendarŬ����, substring(1,2)
		//���ϰ� String �޼ҵ�substring(int,int) non-static�޼ҵ�
		String a = jumin.substring(0,2); //String ���ϰ� substring(0��° ����, 2��° �ձ���)		
		int age = 120 - (Integer.parseInt(a));
		System.out.println("����� ���̴�"+(age+1)+"�� �Դϴ�");
		//����2 ���� char charAt(int)
		String msg="";
		char s = jumin.charAt(7);
		if(s=='1' || s=='3') {msg="����";}
		else if (s=='2' || s=='4') {msg="����";}
		else if (s=='5' || s=='6') {msg="�ܱ���";}
		else {msg="�߸��Է��� ���";}
		System.out.println("����� " +msg+" �Դϴ�.");
		//����3 ������� 12�� 30��
		//substring(��, ��+1) �޼ҵ� ��� ����� ������ 12�� 30�� �Դϴ�.
		String bm = jumin.substring(2,4);
		String bd = jumin.substring(4,6);
		System.out.println("����� ������ "+bm+"�� " + bd + "�� �Դϴ�.");
		
		//����4 6�ڸ��� - 7�ڸ���
		String jumin1="951230"; //6�ڸ���
		String jumin2="1793485"; //7�ڸ���
		int size1 = jumin1.length();
		int size2 = jumin2.length();
		if(size1==6 && size2==7) {
			System.out.println(jumin1+"-"+jumin2);
		} else {
			System.out.println("����� �ֹι�ȣ �ڸ����� �̻��մϴ�.");
			System.out.println(jumin1+"-"+jumin2);
		}
				
		//����5 Ű���忡�� �Է�	
	}//main end
}
