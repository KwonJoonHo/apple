package net.tis.day03;

import java.util.Vector;

public class GuestDAO { //DAO다오=data access object,단독실행안됨
	
	public void dbDisplay(Vector<GuestDTO> vt) { 
		 //채팅 , 게시판, 방명록, 쇼핑몰  //컬렉션클래스<타입Element요소>
		System.out.println("반복문정석");
	     for(int i=0; i<vt.size(); i++) {
	    	 GuestDTO dt2 = (GuestDTO)vt.get(i);
	    	 System.out.print(dt2.getName() + "  ");
	    	 System.out.print(dt2.getAge() + "  ");
	    	 System.out.println(dt2.getPoint());
	     }
	     
	     System.out.println("\n반복문해법");
	     for( GuestDTO dt3: vt ) { 
	    	 System.out.print(dt3.getName() + "  ");
	    	 System.out.print(dt3.getAge()  + "  ");
	    	 System.out.println(dt3.getPoint());
	     }
	  }//dbDisplay end	
}//GuestDAO class END










