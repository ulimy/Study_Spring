<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- 앞에 /가 없다면 상대경로를 사용한 것임. 현재경로+/save로 자동으로 들어감.-->
<form action="save" method="post">
    username : <input type="text" name="username">
    age : <input type="text" name="age">
    <button type="submit"> 전송</button>
</form>
</body>
</html>
