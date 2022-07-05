package by.chuyashkou.social.controller;

import by.chuyashkou.social.connection.JDBCConnector;
import by.chuyashkou.social.model.User;
import by.chuyashkou.social.model.UserBuilder;
import by.chuyashkou.social.service.UserService;
import by.chuyashkou.social.service.impl.UserServiceImpl;
import lombok.SneakyThrows;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@WebServlet("/user/*")
public class UserController extends HttpServlet {

    private UserService userService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        String path = req.getPathInfo();
        switch (path) {
            case "/userPage.jsp" -> this.getUserPage(req, resp);
            case "/user/logout" -> this.logout(req, resp);
            case "/updatePage.jsp" -> this.getUpdatePage(req, resp);
            case "/followers.jsp" -> this.getFollowersPage(req, resp);
            case "/usersPage.jsp" -> this.getAllUsersPage(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        String path = req.getPathInfo();
        switch (path) {
            case "/login" -> this.login(req, resp);
            case "/register" -> this.register(req, resp);
            case "/update" -> this.doPut(req, resp);
            case "/delete", "/deleteFollower" -> this.doDelete(req, resp);
            case "/subscribe" -> this.subscribe(req, resp);
            case "/subscriber/profile", "/followers/profile" -> this.getUserViewPage(req, resp);
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) {
        String path = req.getPathInfo();
        switch (path) {
            case "/delete" -> this.deleteUser(req, resp);
            case "/deleteFollower" -> this.deleteFollower(req, resp);
        }
    }

    @SneakyThrows
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session = req.getSession();
        User sessionUser = (User) session.getAttribute("user");
        User user = new UserBuilder().id(sessionUser.getId())
                .fullName(req.getParameter("name"))
                .age(Integer.parseInt(req.getParameter("age")))
                .login(req.getParameter("login"))
                .password(req.getParameter("password"))
                .phone(req.getParameter("phone"))
                .email(req.getParameter("email"))
                .address(req.getParameter("address"))
                .gender(User.Gender.valueOf(req.getParameter("gender")))
                .followers(sessionUser.getFollowers())
                .build();
        session.setAttribute("dbCon", new JDBCConnector());
        userService = new UserServiceImpl((JDBCConnector) session.getAttribute("dbCon"));
        boolean isUpdated = userService.update(user);
        if (isUpdated) {
            session.setAttribute("user", user);
            resp.sendRedirect("/social/user/userPage.jsp");
        }
    }

    @SneakyThrows
    private void deleteFollower(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session = req.getSession();
        session.setAttribute("dbCon", new JDBCConnector());
        User user = (User) session.getAttribute("user");
        user.getFollowers().remove(Long.parseLong(req.getParameter("id")));
        session.setAttribute("users", user.getFollowers().values());
        userService = new UserServiceImpl((JDBCConnector) session.getAttribute("dbCon"));
        boolean isDeleted = userService.deleteFollowerById(Long.parseLong(req.getParameter("id")), user.getId());
        if (isDeleted) {
            getServletContext().getRequestDispatcher("/followers.jsp").include(req, resp);
        }
    }

    @SneakyThrows
    private void deleteUser(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session = req.getSession();
        session.setAttribute("dbCon", new JDBCConnector());
        userService = new UserServiceImpl((JDBCConnector) session.getAttribute("dbCon"));
        User sessionUser = (User) session.getAttribute("user");
        boolean isDeleted = userService.deleteById(sessionUser.getId());
        if (isDeleted) {
            this.logout(req, resp);
        }
    }

    @SneakyThrows
    private void login(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session = req.getSession();
        session.setAttribute("dbCon", new JDBCConnector());
        userService = new UserServiceImpl((JDBCConnector) session.getAttribute("dbCon"));
        User user = userService.findUserByLoginAndPassword(req.getParameter("login"), req.getParameter("password"));
        if (user.getLogin() != null) {
            session.setAttribute("user", user);
            getServletContext().getRequestDispatcher("/userPage.jsp").include(req, resp);
        } else {
            session.setAttribute("dbCon", new JDBCConnector());
            resp.sendRedirect("/social/registration.jsp");
        }
    }

    @SneakyThrows
    private void register(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session = req.getSession();
        session.setAttribute("dbCon", new JDBCConnector());
        userService = new UserServiceImpl((JDBCConnector) session.getAttribute("dbCon"));
        boolean isCreated = userService.create(new UserBuilder().fullName(req.getParameter("name"))
                .age(Integer.parseInt(req.getParameter("age")))
                .login(req.getParameter("login"))
                .password(req.getParameter("password"))
                .phone(req.getParameter("phone"))
                .email(req.getParameter("email"))
                .address(req.getParameter("address"))
                .gender(User.Gender.valueOf(req.getParameter("gender")))
                .build());
        if (isCreated) {
            session.setAttribute("dbCon", new JDBCConnector());
            resp.sendRedirect("/social/login.jsp");
        }
    }

    @SneakyThrows
    private void logout(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session = req.getSession();
        session.invalidate();
        resp.sendRedirect("/social/mainPage.jsp");
    }

    @SneakyThrows
    private void subscribe(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session = req.getSession();
        session.setAttribute("dbCon", new JDBCConnector());
        userService = new UserServiceImpl((JDBCConnector) session.getAttribute("dbCon"));
        User user = (User) session.getAttribute("user");
        long id = Long.parseLong(req.getParameter("id"));
        boolean isSubscribed = userService.subscribe(id, user.getId());
        Map<Long, User> allUsers = (Map<Long, User>) session.getAttribute("usersMap");
        List<User> subscribes = (List<User>) session.getAttribute("subscribes");
        User subscriber = allUsers.get(id);
        subscribes.add(subscriber);
        session.setAttribute("users", allUsers.values());
        session.setAttribute("subscribes", subscribes);
        if (isSubscribed) {
            getServletContext().getRequestDispatcher("/usersPage.jsp").include(req, resp);
        }
    }

    @SneakyThrows
    private void getUserPage(HttpServletRequest req, HttpServletResponse resp) {
        getServletContext().getRequestDispatcher("/userPage.jsp").include(req, resp);
    }

    @SneakyThrows
    private void getUpdatePage(HttpServletRequest req, HttpServletResponse resp) {
        getServletContext().getRequestDispatcher("/updatePage.jsp").include(req, resp);
    }

    @SneakyThrows
    private void getFollowersPage(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        if (user != null) {
            session.setAttribute("users", user.getFollowers().values());
            getServletContext().getRequestDispatcher("/followers.jsp").include(req, resp);
        }
    }

    @SneakyThrows
    private void getAllUsersPage(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session = req.getSession();
        session.setAttribute("dbCon", new JDBCConnector());
        userService = new UserServiceImpl((JDBCConnector) session.getAttribute("dbCon"));
        User user = (User) session.getAttribute("user");
        if (user != null) {
            Map<Long, User> allUsers = userService.findAll();
            List<User> subscribes = this.getAllSubscribes(session);
            allUsers.remove(user.getId());
            session.setAttribute("usersMap", allUsers);
            session.setAttribute("users", allUsers.values());
            session.setAttribute("subscribes", subscribes);
            getServletContext().getRequestDispatcher("/usersPage.jsp").include(req, resp);
        }
    }

    private List<User> getAllSubscribes(HttpSession session) {
        session.setAttribute("dbCon", new JDBCConnector());
        userService = new UserServiceImpl((JDBCConnector) session.getAttribute("dbCon"));
        User user = (User) session.getAttribute("user");
        return userService.findAllSubscribesById(user.getId());
    }

    @SneakyThrows
    private void getUserViewPage(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session = req.getSession();
        session.setAttribute("dbCon", new JDBCConnector());
        userService = new UserServiceImpl((JDBCConnector) session.getAttribute("dbCon"));
        long id = Long.parseLong(req.getParameter("userId"));
        User user = userService.findByID(id);
        if (user != null) {
            req.setAttribute("viewUser", user);
            getServletContext().getRequestDispatcher("/userView.jsp").include(req, resp);
        }
    }
}
