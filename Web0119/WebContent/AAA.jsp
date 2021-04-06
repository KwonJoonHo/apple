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
  <h2> AAA.jsp </h2>
  <img src="images/a1.png">
  
  <div style="border: 5px solid Grey; padding: 10px; width: 600px; ">
    
    <% String fruit = "orange mango"; %>
    <%
    int dan = 7;
    for(int i=0; i<10; i++){
        out.println(dan+"*"+i+"="+(dan*i)+"<br>");
    }
    %>
    
    <jsp:include page="BBB.jsp">
        <jsp:param value="<%=fruit%>" name="Gindex"/>
    </jsp:include>
    
<%--     <jsp:forward page="CCC.jsp">//AAA.jsp문서내용을 포함하지 않고 넘어감
        <jsp:param value="<%=fruit%>" name="Gindex"/>
    </jsp:forward> --%>
  
  </div>
  
</body>
</html>