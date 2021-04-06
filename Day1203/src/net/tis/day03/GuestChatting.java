package net.tis.day03;

import java.util.Vector;

class GuestChatting{
  public static void main(String[] args) { 
	 //채팅 , 게시판, 방명록, 쇼핑몰
	 //컬렉션클래스<타입Element요소>
	 Vector<GuestDTO> vt = new Vector<GuestDTO>();
	 int cnt=0;
	 String[] a = {"LA" ,"lee", "kim" };
	 int[] b = { 15, 31, 27 };
	 double[] c = { 7.1, 8.2, 9.3 };
	 
	 while(true) {
		 GuestDTO dto = new GuestDTO();
		 dto.setName(a[cnt]); //배열을 이용함 
		 dto.setAge(b[cnt]);  //배열을 이용함  
		 dto.setPoint(c[cnt]);	 
		 
		 vt.add(dto);  //벡터 add대상이 dto=GuestDTO클래스껏 dto에먼저 세터(	변경데이터)
		 cnt++;
		 if(cnt==3)break;
	 }//while end
	 
	 GuestDAO dao=new GuestDAO();
	 dao.dbDisplay(vt);
	 
  }//main end
}//GuestChatting class END


















