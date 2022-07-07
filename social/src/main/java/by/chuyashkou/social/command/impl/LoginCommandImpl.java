package by.chuyashkou.social.command.impl;

import by.chuyashkou.social.command.Command;
import by.chuyashkou.social.command.CommandResult;
import by.chuyashkou.social.command.NavigationType;
import by.chuyashkou.social.model.User;
import by.chuyashkou.social.service.UserService;
import by.chuyashkou.social.service.impl.UserServiceImpl;
import by.chuyashkou.social.util.PageManager;
import by.chuyashkou.social.util.PageMappingConstant;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginCommandImpl implements Command {
    @Override
    public CommandResult execute(HttpServletRequest req) {
        CommandResult commandResult;
        HttpSession session = req.getSession();
        UserService userService = new UserServiceImpl();
        User user = userService.findUserByLoginAndPassword(req.getParameter("login"), req.getParameter("password"));
        if (user.getLogin() != null) {
            session.setAttribute("user", user);
            commandResult = new CommandResult(PageManager.getPageURI(PageMappingConstant.PAGE_USER.getKey()),
                    NavigationType.FORWARD);
        } else {
            commandResult = new CommandResult(req.getContextPath() + PageManager.getPageURI(PageMappingConstant.PAGE_REGISTRATION.getKey())
                    , NavigationType.REDIRECT);
        }
        return commandResult;
    }
}
