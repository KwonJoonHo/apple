<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>  </title>

 <style type="text/css">
   *{ font-size: 16pt; font-weight: bold; }
   a{ font-size: 16pt; text-decoration: none; }
   a:hover{ font-size: 20pt; text-decoration: underline; }
 </style>
 
 <script type="text/javascript">
 </script>
 
</head>
<body>
  <h2> CCC.jsp </h2>
  <%
  ///CCC.jspan문서 jsp액션태그 : forward이동 문서 포함여부
  String data = request.getParameter("Gindex");
  out.println("넘어온 과일 = " +data+"<br>");
  %>
  <img src="images/a3.png">
  <img src="images/a3.png">
  <img src="images/a3.png">
  
  <hr>
  <a href="testList.jsp">[testList]</a>
  <a href="index.jsp">[index]</a>
  <a href="AAA.jsp">[AAA]</a>

</body>
</html>