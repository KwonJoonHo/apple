package net.tis.day03;

import java.util.Vector;

public class TestVector2 {
	public static void main(String[] args) {
		String id = new String("sky");
		Integer age = new Integer(27);
		Boolean gender = new Boolean(true);

		Vector vt = new Vector(); //제네릭타입지정안하면 모든타입이 add대상
		vt.addElement("블루"); //벡터만 add(), addElement() 사용가능
		vt.addElement(36);
		vt.add(false);
		vt.add("선유도");
		vt.add(43.21);
	    System.out.println(vt); //vt개체이름출력
	    
	    int[] su = new int[4]; //배열의장점은 같은타입, 크기고정
	    su[0]=32; su[1]=36;
	    //su[2]=43.21; 문법에러 
	    //su[3]= "블루"; 문법에러
	    //su[5]= 1200; 실행중에러
	    System.out.println(su); //배열명출력
	    System.out.println("배고파요"); //벡터,배열 상관없어요
	    System.out.println("점심시간"); //벡터,배열 상관없는 안내문
	}//main end
}//class END



