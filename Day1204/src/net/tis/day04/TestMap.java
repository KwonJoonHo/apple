package net.tis.day04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		//413������
		HashMap<String,String> h = new HashMap<String,String>();
		h.put("baby", "�Ϳ�����ī����");
		h.put("tis", "�ڹٹ׽��������̽㱳��");
		h.put("apple", "�ƺ� �����е� ������");
		//�о�ö� get(Ű��)
		System.out.println((h.get("baby")));
		System.out.println(h.get("tis"));
		System.out.println(h.get("apple"));
		System.out.println();
		
		//414������ Iterator���
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()==true) {
			String key = it.next(); //Ű��
			String value = h.get(key);
			System.out.println(key+" : " + value);
		}
				
	}

}
