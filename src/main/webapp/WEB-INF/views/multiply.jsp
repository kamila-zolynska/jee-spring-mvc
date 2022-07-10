<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Multiply</title>
</head>
<body>
<table action="/multiply" method="get">
        <c:forEach var = "size" items = "${sizeTab}">
            <tr>
            <c:forEach var = "number" items = "${numbers[size]}">
                <td>
                    <c:out value="${number}"/>
                </td>
            </c:forEach>
            </tr>
        </c:forEach>
</table>
</body>
</html>