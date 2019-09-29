package java6.servlets;

import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "Servlet")
public class SayHiByGet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request,
                          javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request,
                         javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {

        request.setAttribute("name", request.getParameter(getInitParameter("name")));
        request.setAttribute("surname", request.getParameter(getInitParameter("surname")));

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<h1>User info:<h1><h2>configured with XML<h2>");
        printWriter.println("name: " + request.getAttribute("name"));
        printWriter.println("surname: " + request.getAttribute("surname"));

    }
}
