package net.tis.day03;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class TestVector7 {
	public static void main(String[] args) {		
		Vector<String> vt = new Vector<String>(); 
		vt.add("kim"); //���Ϳ����� addElement()���
		vt.add("24");
		vt.add("false");
		vt.add("B");
		vt.add("5.21");
		
		System.out.println("���� for�ݺ������");
		for(int i=0; i<vt.size() ; i++) {
		   System.out.print( vt.get(i) + " ");
		}
	    
		System.out.println("\n");//���ͱ��=���ΰ���
		System.out.println("���� Iterator���");
		//410������ Iterator�������̽� Ÿ������ ����
		Iterator<String> it =  vt.iterator();
		while(it.hasNext() == true) {
			System.out.print(it.next() + " " );
		}
		
		System.out.println("\n");//���ͱ��=���ΰ���
		System.out.println("���� Eumeration���"); //�����
		Enumeration<String> et = vt.elements();
		while(et.hasMoreElements()==true) {
			System.out.print(et.nextElement() + " " );
		}
	}//main end
}//class END







