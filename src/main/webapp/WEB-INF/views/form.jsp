<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
<form action="/first/form" method="post"/>
Name:
<input type="text" name="paramName"/></br>
Date:
<input type="date" name="paramDate"/></br>
<input type="submit" name="submit"/>
</form>
</body>
</html>
