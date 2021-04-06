<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ page import="net.tis.test.TestSQL" %>
<%@ page import="net.tis.test.TestDTO" %>

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
 <h2> testList.jsp=모든데이터출력 </h2>
 <table border="1" width="900"  cellspacing="0">
  	<tr align="center">
  		<td colspan="5"> <img src="images/bar.gif">  </td> 
  	</tr>
  	<tr align="right">
        <td colspan="5"> 레코드갯수: <%= tsql.dbCount() %> &nbsp;  </td> 
  	</tr>
  	
  	<tr bgcolor="yellow">
  		<td>제목데이터</td>  <td>급여</td>   <td>성별</td>  <td>날짜</td>  <td>이미지</td> 
  	</tr>
<%

  ArrayList<TestDTO> LG = tsql.dbList();
for(int i=0; i<LG.size(); i++){
	TestDTO dto = LG.get(i);
}

%> 	
  <tr>
  	   <td>  <a href="testDetail.jsp?idx=<%=dto.getCode()%>"> <%=dto.getTitle()%> </a>  </td>   
  	   <td> <%= dto.getPay() %> </td>  
  	   <td> <%= dto.getGender() %> </td> 
  	   <td> <%= dto.getWdate() %> </td>
  	   <td align="center">
  	     <img src="<%=request.getContextPath()%>/storage/<%=dto.getImg_file_name()%>" width="100"  height="35"> 
  	   </td>
  </tr>	 
	
 </table>
  

  <p>
  <a href="testWrite.jsp">[testWrite]</a>
  <a href="testList.jsp">[testList]</a>
  <a href="testListImage.jsp">[이미지게시판]</a>
  <a href="index.jsp">[index]</a>
  <a href="login.jsp">[로그인]</a>
</body>


</html>






