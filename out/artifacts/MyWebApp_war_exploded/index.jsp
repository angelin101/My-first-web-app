<%--
  Created by IntelliJ IDEA.
  User: Ангелин
  Date: 17.10.2015
  Time: 9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
        <table>
          <tr>
            <td>Посещений: </td>
            <td><%=(request.getAttribute("current_count"))%></td>
          </tr>
        </table>
  </body>
</html>
