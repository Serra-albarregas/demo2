package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/hola"})
public class HolaServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head lang=\"es\">");
            out.println("    <meta charset=\"UTF-8\">");
            out.println("    <title>HOLA MUNDO</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Hola " + req.getParameter("nombre") + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
