package net.tis.day03;

import java.util.Vector;

public class TestVector2 {
	public static void main(String[] args) {
		String id = new String("sky");
		Integer age = new Integer(27);
		Boolean gender = new Boolean(true);

		Vector vt = new Vector(); //���׸�Ÿ���������ϸ� ���Ÿ���� add���
		vt.addElement("���"); //���͸� add(), addElement() ��밡��
		vt.addElement(36);
		vt.add(false);
		vt.add("������");
		vt.add(43.21);
	    System.out.println(vt); //vt��ü�̸����
	    
	    int[] su = new int[4]; //�迭�������� ����Ÿ��, ũ�����
	    su[0]=32; su[1]=36;
	    //su[2]=43.21; �������� 
	    //su[3]= "���"; ��������
	    //su[5]= 1200; �����߿���
	    System.out.println(su); //�迭�����
	    System.out.println("����Ŀ�"); //����,�迭 ��������
	    System.out.println("���ɽð�"); //����,�迭 ������� �ȳ���
	}//main end
}//class END



