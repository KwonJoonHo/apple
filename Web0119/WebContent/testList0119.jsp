<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ include file="ssi.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>  </title>

 <style type="text/css">
   *{ font-size: 16pt; font-weight: bold; }
   a{ font-size: 16pt; text-decoration: none;  font-family: Comic Sans MS; }
   a:hover{ font-size: 20pt; text-decoration: underline; }
 </style>
 
 <script type="text/javascript">
 </script>
 
</head>
<body>


<%
 msg="select count(*) as cnt from test "; 
 RS=ST.executeQuery(msg); 
 if(RS.next()==true){ Gtotal = RS.getInt("cnt"); }
%>

 <h2> testList.jsp=모든데이터출력 </h2>
 <table border="1" width="900"  cellspacing="0">
  	<tr align="center">
  		<td colspan="5"> <img src="images/bar.gif">  </td> 
  	</tr>
  	<tr align="right">
  		<td colspan="5"> 레코드갯수: <%= Gtotal %> &nbsp;  </td> 
  	</tr>
  	
  	<tr bgcolor="yellow">
  		<td>제목데이터</td>  <td>급여</td>   <td>성별</td>  <td>날짜</td>  <td>이미지</td> 
  	</tr>
  	
 <%
 try{
   //ST = CN.createStatement();
   msg = "select * from test  order by title asc" ;  //asc생략가능해요
   RS = ST.executeQuery( msg ); //RS=~~~(); 기술하면 우리는 RS.next()필수기술 
   while(RS.next()==true){
  	 Gtitle = RS.getString("title");
  	 Gpay = RS.getInt("pay");
  	 Ggender = RS.getString("gender");
  	 Gwdate = RS.getDate("wdate");
  	 Gcode = RS.getInt("code");  // 8일 금요일 1교시 추가
  	 Gimage = RS.getString("img_file_name"); // 12일 월요일 5교시  이미지출력
 %>
 
  <tr>
  	   <td>  <a href="testDetail.jsp?idx=<%=Gcode%>"> <%= Gtitle %> </a>  </td>   
  	   <td> <%= Gpay %> </td>  
  	   <td> <%= RS.getString("gender") %> </td> 
  	   <td> <%= RS.getDate("wdate") %> </td>
  	   <td align="center">
  	     <img src="<%=request.getContextPath()%>/storage/<%=Gimage%>" width="100"  height="35"> 
  	   </td>
  </tr>	 
 <%  	 
   }//while end
 }catch(Exception ex){ System.out.println("조회에러 " + ex.toString());}
 %> 	
 </table>
  

  <p>
  <a href="testWrite.jsp">[testWrite]</a>
  <a href="testList.jsp">[testList]</a>
  <a href="testListImage.jsp">[이미지게시판]</a>
  <a href="index.jsp">[index]</a>
  <a href="login.jsp">[로그인]</a>
</body>


</html>






