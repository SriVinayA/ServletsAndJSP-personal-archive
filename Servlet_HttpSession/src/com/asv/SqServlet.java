package com.asv;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int k = Integer.parseInt(req.getParameter("k"));
        k = k*k;

        PrintWriter out = resp.getWriter();
        out.println("Result = " + k);
    }
}
