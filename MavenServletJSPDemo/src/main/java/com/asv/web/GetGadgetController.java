package com.asv.web;

import com.asv.web.dao.GadgetDao;
import com.asv.web.model.Gadget;

import javax.servlet.RequestDispatcher;
import java.io.IOException;

public class GetGadgetController extends javax.servlet.http.HttpServlet {
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        int gid = Integer.parseInt(request.getParameter("gid"));

        GadgetDao dao = new GadgetDao();
        Gadget g1 = dao.getGadget(gid);

        RequestDispatcher rd = request.getRequestDispatcher("showGadget.jsp");
        rd.forward(request, response);
    }
}
