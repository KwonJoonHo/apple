package net.tis.day03;

import java.util.Vector;

public class TestVector4 {
	public static void main(String[] args) {
		String id = new String("blue");
		Integer age = new Integer(27);
		Boolean gender = new Boolean(true);
		String juso = new String("������");
		Double save = new Double(43.21);
		
		Vector vt = new Vector(); 
		vt.addElement(id); //���Ϳ����� addElement()���
		vt.addElement(age);
		vt.add(gender);
		vt.add(juso);
		vt.add(save);
	    System.out.println(vt); 
	}//main end
}//class END



