<%--
  Created by IntelliJ IDEA.
  User: walde
  Date: 29/09/2019
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="kalk" class="java6.jsp.Calc"/>
<jsp:setProperty name="kalk" property="pierwszySkladnik" param="pierwszySkladnik"/>
<jsp:setProperty name="kalk" property="drugiSkladnik" param="drugiSkladnik"/>

<jsp:setProperty name="kalk" property="operacja" param="operacja"/>

<html>
<head>
    <title>Calc</title>
</head>
<body>
<br/>
<form>
    <input name="pierwszySkladnik" value="${kalk.pierwszySkladnik}">
    <br/>
    <select name="operacja">
        <option>+</option>
        <option>-</option>
        <option>*</option>
        <option>/</option>
    </select>
    <br/>
    <input name="drugiSkladnik" value="${kalk.drugiSkladnik}">
    <br/>
    <input type="submit" value="Podaj wynik">
</form>
<h2><strong>Wynik operacji: ${kalk.wynik}</strong></h2>
</body>
</html>
