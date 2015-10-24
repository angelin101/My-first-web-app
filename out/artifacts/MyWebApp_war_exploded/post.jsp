<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Ангелин
  Date: 24.10.2015
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
  <table border="1">
   <c:forEach items="${post}" var="post">
      <tr>
        <td>${post.id}</td>
        <td>${post.txt}</td>
        <td><a href="/delete?id=${post.id}">
          <img src="delete.png">
        </a>
        </td>
      </tr>
   </c:forEach>
  </table>
</body>
</html>
