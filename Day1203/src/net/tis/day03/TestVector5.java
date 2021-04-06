package net.tis.day03;

import java.util.Vector;

public class TestVector5 {
	public static void main(String[] args) {		
		Vector vt = new Vector(); 
		vt.addElement(new String("blue")); //벡터에서만 addElement()사용
		vt.addElement(new Integer(31));
		vt.add(new Boolean(true));
		vt.add(new String("선유도"));
		vt.add(new Double(43.21));
		vt.addElement(new String("red")); //벡터에서만 addElement()사용
		vt.addElement(new Integer(27));
		vt.add(new Boolean(true));
		vt.add(new String("제주도"));
		vt.add(new Double(5.21));
		vt.addElement(new String("yellow")); //벡터에서만 addElement()사용
		vt.add(new String("여의도"));
		vt.add(new Double(9.21));
			
	    System.out.println(vt);
	    System.out.println("vt용량=" + vt.capacity()); //capacity()사용거의안함 
	    System.out.println("vt크기=" + vt.size());
	}//main end
}//class END



