package java6.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SayHelloByPost",
            urlPatterns = {"/sayHello","/SAYHELLO", "/sayhello"},
            initParams = {
                @WebInitParam(name = "name", value = "name"),
                @WebInitParam(name= "surname", value = "surname")
            }
)
public class SayHelloByPost extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("name", request.getParameter(getInitParameter("name")));
        request.setAttribute("surname", request.getParameter(getInitParameter("surname")));

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<h1>User info:<h1>");
        printWriter.println("<h2>configured with annotations<h2>");
        printWriter.println("Imie: " + request.getAttribute("name"));
        printWriter.println("Nazwisko: " + request.getAttribute("surname"));

        request.getRequestDispatcher("HelloUser.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
