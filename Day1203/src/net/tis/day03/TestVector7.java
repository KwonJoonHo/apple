package net.tis.day03;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class TestVector7 {
	public static void main(String[] args) {		
		Vector<String> vt = new Vector<String>(); 
		vt.add("kim"); //벡터에서만 addElement()사용
		vt.add("24");
		vt.add("false");
		vt.add("B");
		vt.add("5.21");
		
		System.out.println("벡터 for반복문출력");
		for(int i=0; i<vt.size() ; i++) {
		   System.out.print( vt.get(i) + " ");
		}
	    
		System.out.println("\n");//엔터기능=라인개행
		System.out.println("벡터 Iterator출력");
		//410페이지 Iterator인터페이스 타입으로 선언
		Iterator<String> it =  vt.iterator();
		while(it.hasNext() == true) {
			System.out.print(it.next() + " " );
		}
		
		System.out.println("\n");//엔터기능=라인개행
		System.out.println("벡터 Eumeration출력"); //비권장
		Enumeration<String> et = vt.elements();
		while(et.hasMoreElements()==true) {
			System.out.print(et.nextElement() + " " );
		}
	}//main end
}//class END







