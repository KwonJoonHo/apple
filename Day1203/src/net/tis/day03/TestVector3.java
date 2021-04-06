package net.tis.day03;

import java.util.Vector;

public class TestVector3 {
	public static void main(String[] args) {
		String id = new String("sky");
		Integer age = new Integer(27);
		Boolean gender = new Boolean(true);
		String juso = new String("선유도");
		//에러 double save = new double(43.21);
		Double save = new Double(43.21);
		//표준타입=primitive타입은 new개체화 안됨, 배열은 가능 
		//배열 double[] avg = new double[5]; //객체가 아니라 배열입니다 

		Vector vt = new Vector(); //제네릭타입지정안하면 모든타입이 add대상
		vt.addElement("sky"); //벡터만 add(), addElement() 사용가능
		vt.addElement(27);
		vt.add(true);
		vt.add("선유도");
		vt.add(43.21);
	    System.out.println(vt); //vt개체이름출력 
	}//main end
}//class END



