<%@page import="java.util.Enumeration"%>
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
    <h2> 세션의 모든 값 출력 : 06_getSession.jsp</h2>
    <h4>Enumeration객체</h4>
    <h4><pre>
    Enumeration은 제너릭 클래스로 
    Enumeration< Stirng >과 같이 표현해야 하지만
    프로그램 실행에 직접적인 영향을 끼치지 않기 때문에 
    기재하지 않아도 무방하다.
    </pre></h4>
    <%
    Enumeration names = session.getAttributeNames();
    out.print("<div style='width:300px; border:3px solid grey; text-align: center; padding: 10px; margin:0px auto;'>");
    while(names.hasMoreElements()){ //현재 뽑아올 데이터가 있는지를 검사 기본: true -> 없으면 false로변환
    	String name = names.nextElement().toString();
    	String value = session.getAttribute(name).toString();
    	out.print(name + " : "+value + "<br>");
    }
    out.print("</div>");
    %>
   
</body>
</html>