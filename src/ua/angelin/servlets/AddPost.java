package ua.angelin.servlets;

import ua.angelin.classes.DAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ������� on 25.10.2015.
 */

public class AddPost extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8"); // Изменение кодировки для нормального отображения
        String str = req.getParameter("txt");
        DAO.addPost(str);
        System.out.println(str);
        resp.sendRedirect("/post");
    }
}
