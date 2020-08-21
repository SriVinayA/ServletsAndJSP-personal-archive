package com.example.web;

import com.example.web.dao.AlienDao;
import com.example.web.model.Alien;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GetAlienController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int aid = Integer.parseInt(request.getParameter("aid"));
        AlienDao dao = new AlienDao();
        Alien a1 = dao.getAlien(aid);

        request.setAttribute("alien", a1);
        RequestDispatcher rd = request.getRequestDispatcher("showAlien.jsp");
        rd.forward(request, response);
    }
}