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
    <cha
</head>
<body>
  <table border="1">
   <c:forEach items="${post}" var="post"> <%-- Делаем цикл с помошью библиотеки JSTL --%>
      <tr>
        <td>${post.id}</td>
        <td><c:out value="${post.txt}"></c:out></td> <%-- Для предотвращения взлома HTMLя (Экранирует теги)--%>
        <td><a href="/delete?id=${post.id}">
          <img src="delete.png">
        </a>
        </td>
      </tr>
   </c:forEach>
    <form action="/add" method="post">
      <tr>
        <td colspan="2">
          <input name="txt" type="text">
        </td>
        <td>
          <input type="submit">
        </td>
      </tr>
    </form>
  </table>
</body>
</html>
