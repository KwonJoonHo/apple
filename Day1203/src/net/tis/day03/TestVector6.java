package net.tis.day03;

import java.util.Vector;

public class TestVector6 {
	public static void main(String[] args) {		
		Vector<String> vt = new Vector<String>();  //제네릭<표준형X> 적용
		vt.addElement("red"); //벡터에서만 addElement()사용
		vt.addElement("27");
		vt.add("true");
		vt.add("B");
		vt.add("5.21");
		vt.addElement("yellow"); 
		for(int i=0; i<vt.size() ; i++) {
			System.out.print( vt.get(i) + " ");
		}
	    System.out.println();
	    System.out.println("vt용량=" + vt.capacity()); //capacity()사용거의안함 
	    System.out.println("vt크기=" + vt.size());
	}//main end
}//class END



