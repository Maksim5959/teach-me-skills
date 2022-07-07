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

public class UserProfileCommandImpl implements Command {
    @Override
    public CommandResult execute(HttpServletRequest req) {
        CommandResult commandResult;
        UserService userService = new UserServiceImpl();
        long id = Long.parseLong(req.getParameter("userId"));
        User user = userService.findByID(id);
        if (user != null) {
            req.setAttribute("viewUser", user);
            req.setAttribute("navigation", req.getParameter("navigation"));
            commandResult = new CommandResult(PageManager.getPageURI(PageMappingConstant.PAGE_USER_PROFILE.getKey())
                    , NavigationType.FORWARD);
        } else {
            commandResult = new CommandResult();
        }
        return commandResult;
    }
}
