package net.tis.day03;

import java.util.StringTokenizer;

public class MyStringTokenizer4 {
	public static void main(String[] args) { 
	  //369������  StringTokenizerŬ����
	  String query="juso,,,,seoul,age,27";
	  StringTokenizer st = new StringTokenizer(query, ",");
	   
	  while(st.hasMoreElements()==true) {
		 System.out.print(st.nextToken() + "\t" );
	  }
	  
	  System.out.println("\n-----------------------------------");
	  //362������ 18���� split()
	  String msg="juso,,,seoul,age,27";  //�����ô�� ,�޸������� 
	  String[] s = msg.split(",");
	  for(int i=0; i<s.length; i++) {
		  System.out.print(s[i] + "\t");
	  }
	  
	}//main end
}//class END





