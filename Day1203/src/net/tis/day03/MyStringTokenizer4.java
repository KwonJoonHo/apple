package net.tis.day03;

import java.util.StringTokenizer;

public class MyStringTokenizer4 {
	public static void main(String[] args) { 
	  //369페이지  StringTokenizer클래스
	  String query="juso,,,,seoul,age,27";
	  StringTokenizer st = new StringTokenizer(query, ",");
	   
	  while(st.hasMoreElements()==true) {
		 System.out.print(st.nextToken() + "\t" );
	  }
	  
	  System.out.println("\n-----------------------------------");
	  //362페이지 18라인 split()
	  String msg="juso,,,seoul,age,27";  //슬래시대신 ,콤마변경함 
	  String[] s = msg.split(",");
	  for(int i=0; i<s.length; i++) {
		  System.out.print(s[i] + "\t");
	  }
	  
	}//main end
}//class END





