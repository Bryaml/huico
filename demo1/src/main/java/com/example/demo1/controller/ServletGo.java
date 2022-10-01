package com.example.demo1.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletGo", value = "/ServletGo")
public class ServletGo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String to = request.getParameter("to") != null ? request.getParameter("to"):"index.jsp";
        request.getRequestDispatcher("WEB-INF/"+to).forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        doGet(request,response);

    }
}
