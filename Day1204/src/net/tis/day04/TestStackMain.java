package net.tis.day04;

import java.util.Stack;

public class TestStackMain{ //�ֿ�������  6.7.1 Stack	
	public static void main(String[] args) {
		//Vector,ArrayList �߰� add(), ���������� get(int), size()
		//HashMap   �߰� put(k,v), ���������� get(key)	
		//Stack ���� input ������ output
		Stack<String> st = new Stack<String>();
		System.out.println("empty���� Ȯ�� " + st.empty());
		st.push(new String("jabook"));
		st.push(new String("java"));
		st.push(new String("tis"));
		System.out.println("empty���� Ȯ�� " + st.empty());
		System.out.println();
		//String a = st.peek();
	    //System.out.println(a);
		String b = st.pop();
		System.out.println(b);
		String c= st.peek();
		System.out.println(st.peek());
		int find = st.search("jabook");
		System.out.println("jabook��ġ " + find);
	}//main end
}//class END
