package net.tis.test;

import java.sql.DriverManager;
import java.util.ArrayList;

import net.tis.common.DB;
import net.tis.common.Global;
import oracle.net.aso.r;
import sun.security.krb5.internal.crypto.RsaMd5CksumType;

public class TestSQL extends Global {
	
	 public TestSQL() {
	   CN = DB.getConnection(); //�ּ�Ǯ��� db���������ؾ� ������ó������
	   //Context initContext = new InitialContext();
	 	 //Context envContext = (Context)initContext.lookup("java:comp/env/");
	 	 //DataSource ds = (DataSource)envContext.lookup("jdbc/snow");
	 	 //CN  = ds.getConnection(); 
	 }//end
	 
	 //TestInsertController.java������������ ȣ��
	 public void dbInsert(String a, int b, String gen, String img) { //����,�޿�,����,�̹���
		 try {
		   msg =" insert into test values(?, ?, ?, sysdate, test_seq.nextVal, ?) " ;
		   PST = CN.prepareStatement(msg);
		   			PST.setString(1, a);
		   			PST.setInt(2, b);
		   			PST.setString(3, gen);
		   			PST.setString(4, img);
		   PST.executeUpdate();
		   System.out.println("1-18-������ TestSQL.java���� dbInsert(1,2,3,4) ���强��");
		 }catch(Exception e){System.out.println("dbInsert�޼ҵ� ������� " + e.toString());}
	 }//end
	 
	 
	 
	 public void dbInsert(TestDTO dto) { //����
		 try {
		   msg =" insert into test values(?, ?, ?, sysdate, test_seq.nextVal, ?) " ;
		 }catch(Exception e){System.out.println("�űԿ��� " + e.toString());}
	 }//end
	 
	 public void dbDelete(int data) {
		try {
			ST = CN.createStatement();
			msg = "delete from test where code = " + data ;
			ST.executeUpdate(msg);
		}catch(Exception e){System.out.println("�������� " + e.toString());}
	 }//end
	 
	 public void dbEdit(String a, int b, String gen,  int code) { //����,�޿�,����,��¥,�׸�����������,code
		 try {
			 msg = "update test set title=?, pay=?, gender=?, wdate=sysdate where code=? ";
			 PST = CN.prepareStatement(msg);
			 			 PST.setString(1, a);
			 			 PST.setInt(2, b);
			 			 PST.setString(3, gen);
			 			 PST.setInt(4, code);
			 PST.executeUpdate();
			 System.out.println("TestSQL.java ����ó������");
		 }catch(Exception e){System.out.println("dbEdit�޼ҵ� �������� " + e.toString());}
	 }//end
	 
	 public int dbCount() {
		try {
			msg = "select count(*) as cnt from test";
			ST = CN.createStatement();
			RS = ST.executeQuery(msg);
			RS.next(); Gtotal = RS.getInt("cnt");
		} catch (Exception e) { System.out.println("dbConut()����"+e.toString());}
			return Gtotal;
	}//dbCount() end
	
	 public ArrayList<TestDTO> dbList( ) { //testList.jsp�������� ��������
		 		ArrayList<TestDTO> gList = new ArrayList<TestDTO>();
		 try{
			ST = CN.createStatement();
			msg = "select * from test  order by title asc" ;  //asc���������ؿ�
			RS = ST.executeQuery( msg ); //RS=~~~(); ����ϸ� �츮�� RS.next()�ʼ���� 
				while(RS.next()==true){
					TestDTO dto = new TestDTO();
					dto.setTitle(RS.getString("title"));
					dto.setPay(RS.getInt("pay"));
					dto.setGender(RS.getString("gender"));
					dto.setWdate(RS.getDate("wdate"));  
					dto.setCode(RS.getInt("code"));   
					dto.setImg_file_name( RS.getString("img_file_name"));
					
					gList.add(dto);
				}//while end
		 }catch(Exception ex){ System.out.println("dbList()���� " + ex.toString());}
		 return gList;
	}//dbList( ) end
	 
	 
	 
	 
	 public ArrayList<TestDTO> dbDetail( int data ) { //testDetail.jsp�������� ��������
		 		ArrayList<TestDTO> dList = new ArrayList<TestDTO>(); 
		 		// �Ѱ� ����� ArrayList�� �����ʴ´�.
		 		// ����õ! �ٽ� ����� ����.
		 try {
			ST = CN.createStatement();
			msg = "select * from test where code = "+ data ;  //asc���������ؿ�
			RS = ST.executeQuery( msg );
			while (RS.next()==true) {
				TestDTO dto = new TestDTO();
				dto.setTitle(RS.getString("title"));
				dto.setPay(RS.getInt("pay"));
				dto.setWdate(RS.getDate("wdate"));  
				dto.setGender(RS.getString("gender"));
				dto.setImg_file_name( RS.getString("img_file_name"));
				dList.add(dto);
			}//while end			
		 }catch(Exception e){System.out.println("dbDetail()���� " + e.toString());}
		 return dList;
	 }//end
	 
	 
	 
	 
	 
	 
//////////////////////////////////////////////////////////////////////////////////////	 
	 public void test( ) {
		 try {
			 
		 }catch(Exception e){System.out.println("���� " + e.toString());}
	}//end
	 
}//TestSQL class END








