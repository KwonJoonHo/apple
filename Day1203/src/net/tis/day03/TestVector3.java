package net.tis.day03;

import java.util.Vector;

public class TestVector3 {
	public static void main(String[] args) {
		String id = new String("sky");
		Integer age = new Integer(27);
		Boolean gender = new Boolean(true);
		String juso = new String("������");
		//���� double save = new double(43.21);
		Double save = new Double(43.21);
		//ǥ��Ÿ��=primitiveŸ���� new��üȭ �ȵ�, �迭�� ���� 
		//�迭 double[] avg = new double[5]; //��ü�� �ƴ϶� �迭�Դϴ� 

		Vector vt = new Vector(); //���׸�Ÿ���������ϸ� ���Ÿ���� add���
		vt.addElement("sky"); //���͸� add(), addElement() ��밡��
		vt.addElement(27);
		vt.add(true);
		vt.add("������");
		vt.add(43.21);
	    System.out.println(vt); //vt��ü�̸���� 
	}//main end
}//class END



