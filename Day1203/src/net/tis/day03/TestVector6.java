package net.tis.day03;

import java.util.Vector;

public class TestVector6 {
	public static void main(String[] args) {		
		Vector<String> vt = new Vector<String>();  //���׸�<ǥ����X> ����
		vt.addElement("red"); //���Ϳ����� addElement()���
		vt.addElement("27");
		vt.add("true");
		vt.add("B");
		vt.add("5.21");
		vt.addElement("yellow"); 
		for(int i=0; i<vt.size() ; i++) {
			System.out.print( vt.get(i) + " ");
		}
	    System.out.println();
	    System.out.println("vt�뷮=" + vt.capacity()); //capacity()�����Ǿ��� 
	    System.out.println("vtũ��=" + vt.size());
	}//main end
}//class END



