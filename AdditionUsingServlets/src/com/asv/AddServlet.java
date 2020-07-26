package com.asv;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws IOException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));
        int k = i+j;

        PrintWriter out = res.getWriter();
        out.println("result = " + k);
    }
}
