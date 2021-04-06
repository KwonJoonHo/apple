<%@page import="com.sun.xml.internal.bind.v2.runtime.Name"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookie &amp; Seesion</title>
</head>
<body>
    <h2> 세션 값 확인 : 05_getSession.jsp</h2>
    <%
 // 세션의 value는 object형으로 반환된다.
    // 변수저장 -> 자료형에 맞춰 형변환 해주기
    String id = (String) session.getAttribute("id");
    String pwd = (String) session.getAttribute("pwd");
    Integer age = (Integer) session.getAttribute("age");
    %>
    
    i d : <%= id %><br> 
    pwd : <%= pwd %><br>
    age : <%= age %>
    
</body>
</html>