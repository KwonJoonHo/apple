<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookie &amp; Seesion</title>
</head>
<body>
    <h2> 쿠키 삭제 : 03_removeCookies.jsp</h2>
    <%
    Cookie cookie = new Cookie("id","");
    cookie.setMaxAge(0); //쿠키의 유효기간을 만료시킴 ->더이상 사용할 수 없음.
    response.addCookie(cookie);
    %>
    <h4> id쿠키가 삭제 되었습니다.</h4>
    <a href=" 02_getCookies.jsp">쿠키 삭제를 확인하려면 클릭하세요</a>
</body>
</html>