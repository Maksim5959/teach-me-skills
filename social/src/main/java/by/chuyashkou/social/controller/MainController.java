package by.chuyashkou.social.controller;

import by.chuyashkou.social.connection.ConnectionPool;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/main")
public class MainController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect("/social/mainPage.jsp");
    }

    @Override
    public void init() {
        ConnectionPool.getInstance();
    }

    @Override
    public void destroy() {
        ConnectionPool.getInstance().closePool();
    }
}
