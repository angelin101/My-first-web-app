package ua.angelin.servlets;

import ua.angelin.classes.DAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Ангелин on 24.10.2015.
 */
public class PostServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("post", DAO.getPost()); // Устанавливаем атрибуты для запроса
        request.getRequestDispatcher("post.jsp").forward(request, response); // Опрокидываем запрос и ответ дальше на стартовую страницу
    }
}
