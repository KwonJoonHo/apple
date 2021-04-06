package net.tis.day03;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class IteratorEx2 { //411페이지  Vector대신 ArrayList기술
	public static void main(String[] args) {		
		ArrayList<Integer> v = new ArrayList<Integer>(); 
		v.add(59);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		System.out.println("벡터 for반복문출력");
		for(int i=0; i<v.size() ; i++) {
		   System.out.print( v.get(i) + " ");
		}
	    
		System.out.println("\n");//엔터기능=라인개행
		System.out.println("벡터 Iterator출력");
		Iterator<Integer> it =  v.iterator();
		while(it.hasNext() == true) {
			System.out.print(it.next() + " " );
		}
		
		/*
		  System.out.println("벡터 Eumeration출력"); //비권장
		  Enumeration<Integer> et = v.elements(); //벡터만 Enumeration사용가능
		  while(et.hasMoreElements()==true) {
			System.out.print(et.nextElement() + " " );
		  }
		*/
	}//main end
}//class END











