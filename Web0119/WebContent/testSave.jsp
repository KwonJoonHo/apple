<%@page import="sun.security.krb5.internal.crypto.dk.DkCrypto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>

<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<!-- ssi.jsp문서 include fiel문장없어요  -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>  </title>
 
 <script type="text/javascript">
 </script>
 
</head>
<body>
    <jsp:useBean id="sk" class="net.tis.test.TestSQL"></jsp:useBean>

  <h2> testSave.jsp </h2>
  <img src="images/a3.png"><br>
  <%
     //application내장개체로 storage폴더에 접근 
     String path  = application.getRealPath("storage");  
     int size = 1024*1024*7; 
     //MultipartRequest mr = new MultipartRequest(request,path,size,"UTF-8",new DefaultzFileRenamePolicy());
     MultipartRequest mr = new MultipartRequest(request,path,size,"UTF-8");
     
    String a = mr.getParameter("title");
    int b = Integer.parseInt(mr.getParameter("pay"));
    String c = mr.getParameter("gender");
    String d= mr.getFilesystemName("file1"); 

  try{ 
     //TestSQL ts = new TestSQL(); //mvc1모델=서블릿중간거치지않고 바로 자바문서접근 
     //ts.dbInsert(a, b, c, d); //저장처리
	  sk.dbInsert(a, b, c, d) 
  }catch(Exception ex){  }
   response.sendRedirect("testList.jsp"); //저장성공이든실패이든 전체화면문서로 이동 
  %>
  <p>
  <a href="testWrite.jsp">[testWrite]</a>
  <a href="testList.jsp">[testList]</a>
  <a href="index.jsp">[index]</a>
  
</body>
</html>




