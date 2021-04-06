package net.tis.day03;

import java.util.Vector;

public class TestVector1 {
	public static void main(String[] args) {
		String id = new String("sky");
		Integer age = new Integer(27);
		Boolean gender = new Boolean(true);

		Vector vt = new Vector(); //제네릭타입지정안하면 모든타입이 add대상
		vt.addElement("홍길동"); //벡터만 add(), addElement() 사용가능
		vt.addElement(36);
		vt.add(false);
		vt.add("선유도");
		//켈렉션의 길이 size(), 배열의길이 length, 문자열길이 length()
		for( int i=0; i<vt.size(); i++) {
		  //System.out.print(vt.get(i) +" "); //추출메소드 get(위치)
		  System.out.print(vt.elementAt(i) +" "); //벡터는 elementAt(위치)
		}
	}//main end
}//class END



