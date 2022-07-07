package by.chuyashkou.social.controller;

import by.chuyashkou.social.command.Command;
import by.chuyashkou.social.command.CommandFactory;
import by.chuyashkou.social.command.CommandResult;
import lombok.SneakyThrows;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/frontController")
public class FrontController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        this.processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        this.processRequest(req, resp);
    }

    @SneakyThrows
    private void processRequest(HttpServletRequest req, HttpServletResponse resp) {
        String commandName = req.getParameter("command");
        Command command = CommandFactory.defineCommand(commandName);
        CommandResult result = command.execute(req);
        switch (result.getNavigationType()) {
            case FORWARD -> getServletContext().getRequestDispatcher(result.getPage()).forward(req, resp);
            case REDIRECT -> resp.sendRedirect(result.getPage());
            default -> throw new RuntimeException();
        }
    }
}
