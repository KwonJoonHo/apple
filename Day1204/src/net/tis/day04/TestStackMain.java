package net.tis.day04;

import java.util.Stack;

public class TestStackMain{ //최영관저자  6.7.1 Stack	
	public static void main(String[] args) {
		//Vector,ArrayList 추가 add(), 값가져오기 get(int), size()
		//HashMap   추가 put(k,v), 값가져오기 get(key)	
		//Stack 먼저 input 마지막 output
		Stack<String> st = new Stack<String>();
		System.out.println("empty상태 확인 " + st.empty());
		st.push(new String("jabook"));
		st.push(new String("java"));
		st.push(new String("tis"));
		System.out.println("empty상태 확인 " + st.empty());
		System.out.println();
		//String a = st.peek();
	    //System.out.println(a);
		String b = st.pop();
		System.out.println(b);
		String c= st.peek();
		System.out.println(st.peek());
		int find = st.search("jabook");
		System.out.println("jabook위치 " + find);
	}//main end
}//class END
