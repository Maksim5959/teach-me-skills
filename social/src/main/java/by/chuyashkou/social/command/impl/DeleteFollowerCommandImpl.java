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

public class DeleteFollowerCommandImpl implements Command {

    @Override
    public CommandResult execute(HttpServletRequest req) {
        CommandResult commandResult;
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        user.getFollowers().remove(Long.parseLong(req.getParameter("id")));
        session.setAttribute("users", user.getFollowers().values());
        UserService userService = new UserServiceImpl();
        boolean isDeleted = userService.deleteFollowerById(Long.parseLong(req.getParameter("id")), user.getId());
        if (isDeleted) {
            commandResult = new CommandResult(PageManager.getPageURI(PageMappingConstant.PAGE_FOLLOWERS.getKey())
                    , NavigationType.FORWARD);
        } else {
            commandResult = new CommandResult();
        }
        return commandResult;
    }
}
