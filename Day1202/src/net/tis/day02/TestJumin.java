package net.tis.day02;

import java.util.Calendar;

public class TestJumin {
		public static void main(String[] args) {
			String msg=""; //���������� ���� �ʱ�ȭ ����
			int age=0; //���������� ���� �ʱ�ȭ ����			
			String jumin1="891214-1793485";
			//String jumin2="030730-3693485";
			Calendar cc = Calendar.getInstance(); 
			int year = cc.get(Calendar.YEAR);//2020
			//���� ���� ���ϰ� char charAt(int�Ű�����)
			char gender = jumin1.charAt(7);
			int my =Integer.parseInt(jumin1.substring(0,2));
//			if(gender=='1' || gender=='2') {
//				System.out.println(year-1899-Integer.parseInt(jumin1.substring(0,2)));
//			} //2020-1900+89
//			else if(gender=='3' || gender=='4') {
//				System.out.println(year-1999-Integer.parseInt(jumin1.substring(0,2)));
//			} //2020-2000+03
//			else if(gender=='5' || gender=='6') {
//				System.out.println("�ܱ����Դϴ�.");
//			} //�ܱ��� ���̰�� X
//			else {System.out.println("������ �߸� ����Ǿ����ϴ�."); }//������ �߸������ ���
			
			switch(gender) {
			case '1' :
			case '2' : 
				age=year-1899-my; break;
			case '3' :
			case '4' : 
				age=year-1999-my; break;
			case '5' :
			case '6' : System.out.println("�ܱ����Դϴ�."); break;
			default : msg="������ȣ�� �ٽ� Ȯ�����ּ���"; break;
			}
			System.out.print("\n" +msg);
			System.out.println("���糪�̴� " + age + "�� �Դϴ�");
			
			String jumin="891214-1793485";
			
	}

}
