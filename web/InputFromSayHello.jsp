<%--
  Created by IntelliJ IDEA.
  User: walde
  Date: 29/09/2019
  Time: 12:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User input form</title>
</head>
<body>

    <form action="${pageContext.request.contextPath}/sayHello" method="post">
        <label for="name">Imie: </label>
        <input type="text" name="name" id="name">
        <label for="surname">Imie: </label>
        <input type="text" name="surname" id="surname">
        <br /><br />
        <input type="submit" value="Wyslij"/>

    </form>

</body>
</html>
