package net.tis.day03;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class IteratorEx2 { //411������  Vector��� ArrayList���
	public static void main(String[] args) {		
		ArrayList<Integer> v = new ArrayList<Integer>(); 
		v.add(59);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		System.out.println("���� for�ݺ������");
		for(int i=0; i<v.size() ; i++) {
		   System.out.print( v.get(i) + " ");
		}
	    
		System.out.println("\n");//���ͱ��=���ΰ���
		System.out.println("���� Iterator���");
		Iterator<Integer> it =  v.iterator();
		while(it.hasNext() == true) {
			System.out.print(it.next() + " " );
		}
		
		/*
		  System.out.println("���� Eumeration���"); //�����
		  Enumeration<Integer> et = v.elements(); //���͸� Enumeration��밡��
		  while(et.hasMoreElements()==true) {
			System.out.print(et.nextElement() + " " );
		  }
		*/
	}//main end
}//class END











