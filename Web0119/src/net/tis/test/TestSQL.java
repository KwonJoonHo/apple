package net.tis.test;

import java.sql.DriverManager;
import java.util.ArrayList;

import net.tis.common.DB;
import net.tis.common.Global;
import oracle.net.aso.r;
import sun.security.krb5.internal.crypto.RsaMd5CksumType;

public class TestSQL extends Global {
	
	 public TestSQL() {
	   CN = DB.getConnection(); //주석풀어야 db서버연결해야 데이터처리가능
	   //Context initContext = new InitialContext();
	 	 //Context envContext = (Context)initContext.lookup("java:comp/env/");
	 	 //DataSource ds = (DataSource)envContext.lookup("jdbc/snow");
	 	 //CN  = ds.getConnection(); 
	 }//end
	 
	 //TestInsertController.java서블릿문서에서 호출
	 public void dbInsert(String a, int b, String gen, String img) { //제목,급여,성별,이미지
		 try {
		   msg =" insert into test values(?, ?, ?, sysdate, test_seq.nextVal, ?) " ;
		   PST = CN.prepareStatement(msg);
		   			PST.setString(1, a);
		   			PST.setInt(2, b);
		   			PST.setString(3, gen);
		   			PST.setString(4, img);
		   PST.executeUpdate();
		   System.out.println("1-18-월요일 TestSQL.java문서 dbInsert(1,2,3,4) 저장성공");
		 }catch(Exception e){System.out.println("dbInsert메소드 저장실패 " + e.toString());}
	 }//end
	 
	 
	 
	 public void dbInsert(TestDTO dto) { //권장
		 try {
		   msg =" insert into test values(?, ?, ?, sysdate, test_seq.nextVal, ?) " ;
		 }catch(Exception e){System.out.println("신규에러 " + e.toString());}
	 }//end
	 
	 public void dbDelete(int data) {
		try {
			ST = CN.createStatement();
			msg = "delete from test where code = " + data ;
			ST.executeUpdate(msg);
		}catch(Exception e){System.out.println("삭제에러 " + e.toString());}
	 }//end
	 
	 public void dbEdit(String a, int b, String gen,  int code) { //제목,급여,성별,날짜,그림은수정안함,code
		 try {
			 msg = "update test set title=?, pay=?, gender=?, wdate=sysdate where code=? ";
			 PST = CN.prepareStatement(msg);
			 			 PST.setString(1, a);
			 			 PST.setInt(2, b);
			 			 PST.setString(3, gen);
			 			 PST.setInt(4, code);
			 PST.executeUpdate();
			 System.out.println("TestSQL.java 수정처리성공");
		 }catch(Exception e){System.out.println("dbEdit메소드 수정에러 " + e.toString());}
	 }//end
	 
	 public int dbCount() {
		try {
			msg = "select count(*) as cnt from test";
			ST = CN.createStatement();
			RS = ST.executeQuery(msg);
			RS.next(); Gtotal = RS.getInt("cnt");
		} catch (Exception e) { System.out.println("dbConut()에러"+e.toString());}
			return Gtotal;
	}//dbCount() end
	
	 public ArrayList<TestDTO> dbList( ) { //testList.jsp문서에서 직접접근
		 		ArrayList<TestDTO> gList = new ArrayList<TestDTO>();
		 try{
			ST = CN.createStatement();
			msg = "select * from test  order by title asc" ;  //asc생략가능해요
			RS = ST.executeQuery( msg ); //RS=~~~(); 기술하면 우리는 RS.next()필수기술 
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
		 }catch(Exception ex){ System.out.println("dbList()에러 " + ex.toString());}
		 return gList;
	}//dbList( ) end
	 
	 
	 
	 
	 public ArrayList<TestDTO> dbDetail( int data ) { //testDetail.jsp문서에서 직접접근
		 		ArrayList<TestDTO> dList = new ArrayList<TestDTO>(); 
		 		// 한건 출력은 ArrayList를 쓰지않는다.
		 		// 비추천! 다시 만들어 보기.
		 try {
			ST = CN.createStatement();
			msg = "select * from test where code = "+ data ;  //asc생략가능해요
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
		 }catch(Exception e){System.out.println("dbDetail()에러 " + e.toString());}
		 return dList;
	 }//end
	 
	 
	 
	 
	 
	 
//////////////////////////////////////////////////////////////////////////////////////	 
	 public void test( ) {
		 try {
			 
		 }catch(Exception e){System.out.println("에러 " + e.toString());}
	}//end
	 
}//TestSQL class END








