<%@page import="net.tis.test.TestSQL"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>  </title>
 	<script type="text/javascript">
 	</script>
</head>
<body>
    //testDelete.jsp
<%		
	TestSQL ts = new TestSQL();
	ts.dbDelete(Integer.parseInt(request.getParameter("idx")));
	response.sendRedirect("testList.jsp");
 %> 
</body>
</html>






