package com.asv;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int k = 0;
        Cookie[] cookie = req.getCookies();

        for (Cookie c : cookie) {
            if (c.getName().equals("k"))
                k = Integer.parseInt(c.getValue());
        }

        k = k*k;

        PrintWriter out = resp.getWriter();
        out.println("Result = " + k);
    }
}
