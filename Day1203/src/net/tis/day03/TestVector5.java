package net.tis.day03;

import java.util.Vector;

public class TestVector5 {
	public static void main(String[] args) {		
		Vector vt = new Vector(); 
		vt.addElement(new String("blue")); //���Ϳ����� addElement()���
		vt.addElement(new Integer(31));
		vt.add(new Boolean(true));
		vt.add(new String("������"));
		vt.add(new Double(43.21));
		vt.addElement(new String("red")); //���Ϳ����� addElement()���
		vt.addElement(new Integer(27));
		vt.add(new Boolean(true));
		vt.add(new String("���ֵ�"));
		vt.add(new Double(5.21));
		vt.addElement(new String("yellow")); //���Ϳ����� addElement()���
		vt.add(new String("���ǵ�"));
		vt.add(new Double(9.21));
			
	    System.out.println(vt);
	    System.out.println("vt�뷮=" + vt.capacity()); //capacity()�����Ǿ��� 
	    System.out.println("vtũ��=" + vt.size());
	}//main end
}//class END



