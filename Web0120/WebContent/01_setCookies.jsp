<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookie &amp; Seesion</title>
</head>
<body>
    <h2> 쿠키 설정 : 01_setCookies.jsp</h2>
    <% 
    //1. Cookie 객체 생성
    Cookie c = new Cookie("id","cookievalue"); // "쿠키의이름", "쿠키에 설정한 값"
    //2. 유효기간 설정
    c.setMaxAge(365*24*60*60);
    //3. 클라이언트에 쿠키전송 -> ( id , id_value )와 유효기간
    response.addCookie(c);
    //4. 쿠키를 생성하여 클라이언트에 전송 -> pwd, age
    response.addCookie(new Cookie("pwd","test1234")); 
    response.addCookie(new Cookie("age","20"));
    %>
    <hr>
    <jsp:include page="02_getCookies.jsp"></jsp:include>
    <hr>
    <jsp:include page="03_removeCookies.jsp"></jsp:include>
    
</body>
</html>