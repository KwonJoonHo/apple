<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>  </title>
</head>
<body>
  <h2> upload538.jsp </h2>
  <form action="upload.do" method="post" enctype="multipart/form-data">
  1. 파일 지정하기 : <input type="file" name="uploadFile01"><br>
  2. 파일 지정하기 : <input type="file" name="uploadFile02"><br>
  3. 파일 지정하기 : <input type="file" name="uploadFile03"><br>
  <input type="submit" value="submit전송">
  </form>
</body>
</html>