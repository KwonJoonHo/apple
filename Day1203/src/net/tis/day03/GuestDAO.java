package net.tis.day03;

import java.util.Vector;

public class GuestDAO { //DAO�ٿ�=data access object,�ܵ�����ȵ�
	
	public void dbDisplay(Vector<GuestDTO> vt) { 
		 //ä�� , �Խ���, ����, ���θ�  //�÷���Ŭ����<Ÿ��Element���>
		System.out.println("�ݺ�������");
	     for(int i=0; i<vt.size(); i++) {
	    	 GuestDTO dt2 = (GuestDTO)vt.get(i);
	    	 System.out.print(dt2.getName() + "  ");
	    	 System.out.print(dt2.getAge() + "  ");
	    	 System.out.println(dt2.getPoint());
	     }
	     
	     System.out.println("\n�ݺ����ع�");
	     for( GuestDTO dt3: vt ) { 
	    	 System.out.print(dt3.getName() + "  ");
	    	 System.out.print(dt3.getAge()  + "  ");
	    	 System.out.println(dt3.getPoint());
	     }
	  }//dbDisplay end	
}//GuestDAO class END










