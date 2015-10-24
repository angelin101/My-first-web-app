package ua.angelin.servlets;

import ua.angelin.classes.DAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Ангелин on 24.10.2015.
 */
//@WebServlet(name = "DeletePost")
public class DeletePost extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        DAO.deleteByID(id);
        response.sendRedirect("/post");// Возвращает на прежнюю страницу
    }
}
