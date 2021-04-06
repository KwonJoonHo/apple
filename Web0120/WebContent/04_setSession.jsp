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
    <h2> 세션 설정 : 04_setSession.jsp</h2>
    <% 
    // session에 값 저장하기. 
    // setAttribute("String형태의 name", "Object 형태의 value" );
    // Object형태의 값 => 어떠한 자료 형태라도 저장 가능
    session.setAttribute("id", "nick");
    session.setAttribute("pwd", "tis12345");
    session.setAttribute("age", 20);
    %>
    <hr>
    <jsp:include page="05_getSession.jsp"></jsp:include>
    <hr>
    <jsp:include page="06_getSession.jsp"></jsp:include>
</body>
</html>