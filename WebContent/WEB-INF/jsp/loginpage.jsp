
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="/menu.jsp"></jsp:include>
<h1>login</h1>

<form action="login.do" method="post">

<p>Name:<input type="text" name="login"></p>

<p>Password:<input type="password" name="password"></p>

<p><input type="submit" value="next"></p>

<p style="color:red">${error}</p>
</form>
</body>
</html>