package net.tis.day03;

import java.util.Vector;

class GuestChatting{
  public static void main(String[] args) { 
	 //ä�� , �Խ���, ����, ���θ�
	 //�÷���Ŭ����<Ÿ��Element���>
	 Vector<GuestDTO> vt = new Vector<GuestDTO>();
	 int cnt=0;
	 String[] a = {"LA" ,"lee", "kim" };
	 int[] b = { 15, 31, 27 };
	 double[] c = { 7.1, 8.2, 9.3 };
	 
	 while(true) {
		 GuestDTO dto = new GuestDTO();
		 dto.setName(a[cnt]); //�迭�� �̿��� 
		 dto.setAge(b[cnt]);  //�迭�� �̿���  
		 dto.setPoint(c[cnt]);	 
		 
		 vt.add(dto);  //���� add����� dto=GuestDTOŬ������ dto������ ����(	���浥����)
		 cnt++;
		 if(cnt==3)break;
	 }//while end
	 
	 GuestDAO dao=new GuestDAO();
	 dao.dbDisplay(vt);
	 
  }//main end
}//GuestChatting class END


















