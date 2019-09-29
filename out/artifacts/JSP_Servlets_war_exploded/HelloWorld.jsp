<%--
  Created by IntelliJ IDEA.
  User: walde
  Date: 29/09/2019
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello JSP</title>
</head>
<body>

<%-- definiujemy zmienna (deklaracja <%!)JAVA na stronie JSP --%>
<%! private long  login_counter = 0;%>
<%-- Komentarz JSP nie widoczny po stronie klienta --%>
<%-- Wyrazenie w formacie JSP--%>
<h2> Obliczamy w JSP 10+4=<%= 10 + 4 %></h2>

<h2> <% out.print("Hello JSP | function call "); %></h2>

<br />
<h2>Ilosc odwiedzin: <%= ++login_counter %></h2>

<!-- Komentarz w stylu HTML, widoczny po stronie klienta -->
</body>
</html>
