package net.tis.day03;

import java.util.Vector;

public class TestVector1 {
	public static void main(String[] args) {
		String id = new String("sky");
		Integer age = new Integer(27);
		Boolean gender = new Boolean(true);

		Vector vt = new Vector(); //���׸�Ÿ���������ϸ� ���Ÿ���� add���
		vt.addElement("ȫ�浿"); //���͸� add(), addElement() ��밡��
		vt.addElement(36);
		vt.add(false);
		vt.add("������");
		//�̷����� ���� size(), �迭�Ǳ��� length, ���ڿ����� length()
		for( int i=0; i<vt.size(); i++) {
		  //System.out.print(vt.get(i) +" "); //����޼ҵ� get(��ġ)
		  System.out.print(vt.elementAt(i) +" "); //���ʹ� elementAt(��ġ)
		}
	}//main end
}//class END



