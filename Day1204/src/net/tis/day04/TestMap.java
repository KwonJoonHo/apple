package net.tis.day04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		//413페이지
		HashMap<String,String> h = new HashMap<String,String>();
		h.put("baby", "귀여운조카아이");
		h.put("tis", "자바및스프링파이썬교육");
		h.put("apple", "맥북 아이패드 아이폰");
		//읽어올때 get(키값)
		System.out.println((h.get("baby")));
		System.out.println(h.get("tis"));
		System.out.println(h.get("apple"));
		System.out.println();
		
		//414페이지 Iterator출력
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()==true) {
			String key = it.next(); //키값
			String value = h.get(key);
			System.out.println(key+" : " + value);
		}
				
	}

}
