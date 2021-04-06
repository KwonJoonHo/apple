<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="ssi.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style type="text/css">
* {font-weight: bold;}
</style><script type="text/javascript"></script>
</head>
<body>
<jsp:include page="test_header.jsp"></jsp:include>
	<h2>testDetail.jsp</h2>
	<%
	data = request.getParameter("idx");
    ArrayList<TestDTO> DT = tsql.dbDetail(Integer.parseInt(data));
    for(TestDTO dto : DT){

	%>
	<table border="1" width="900" cellspacing="0" cellpadding="20px">
		<tr>
			<td width="400" rowspan="5" align="center">
				<!-- <img src="images/remon.png" width="300">  --> <%-- <img src="./storage/<%= Gimage %>" width="300" height="120"> --%>
				<img src="./storage/<%=dto.getImg_file_name()%>"
				width="400" height="300">
			</td>
			<td>제목: <%=dto.getTitle()%>
			</td>
		</tr>
		<tr>
			<td>급여: <%=dto.getPay()%>
			</td>
		</tr>
		<tr>
			<td>날짜: <%=dto.getWdate()%>
			</td>
		</tr>
		<tr>
			<td>성별: <%=dto.getGender()%>
			</td>
		</tr>
		<tr>
			<td><a href="testWrite.jsp">[testWrite]</a> <a
				href="testList.jsp">[testList]</a> <a href="index.jsp">[index]</a> <a
				href="testDelete.jsp?idx=<%=dto.getCode()%>">[삭제]</a> <a
				href="testEdit.jsp?idx=<%=dto.getCode()%>">[수정]</a></td>
		</tr>
	<%
    }
	%>
	</table>
	<!--  한건상품보면서   장바구니/주문, 상품이미지확인, 상품정보 상세히 크기관심  칼라관심 가격관심 -->
	<!--  testDetail.jsp -->
	<!--  게시판 상세문서일때  로그인성공및 글쓴이 댓글, 글올린사람 삭제, 글올린사람 수정  -->
	<!--  글등록,삭제처리및 수정처리는 글쓴이 글올린사람만 글등록,삭제,수정처리 권한이 있습니다  session사용  -->
	<!--  session내장객체를 사용해야 합니다 아직은 세션처리 안함  -->
</body>
</html>






