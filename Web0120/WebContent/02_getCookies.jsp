<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookie &amp; Seesion</title>
</head>
<body>
    <h2> 쿠키 확인 : 02_getCookies.jsp</h2>
    <%
    Cookie[] cookies = request.getCookies(); 
    //클라이이언트에 설정된 모든쿠키 객체를 얻어오기
    //  getCookies()로 얻어온 쿠키들을 배열에 저장
    for(Cookie c : cookies ){                
    	out.println(c.getName()+" : "+c.getValue()+"<br");
    //getValue()로 쿠키에 설정된 값 문자열 형태로 출력
    }
    %>
</body>
</html>