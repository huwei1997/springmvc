<%--
  Created by IntelliJ IDEA.
  User: 比你帅的Man
  Date: 2018/9/17
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <c:forEach items="${admins}" var="admin">
        <tr>
            <td><c:out value="${admin.id}"/></td>
            <td><c:out value="${admin.username}"/></td>
            <td><c:out value="${admin.password}"/></td>
            <td><a href="delete?id= <c:out value="${admin.id}"/>">del</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>