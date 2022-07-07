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
import java.util.List;
import java.util.Map;

public class AllUsersCommandImpl implements Command {
    @Override
    public CommandResult execute(HttpServletRequest req) {
        CommandResult commandResult = new CommandResult(PageManager.getPageURI(PageMappingConstant.PAGE_ALL_USERS.getKey()), NavigationType.FORWARD);
        HttpSession session = req.getSession();
        UserService userService = new UserServiceImpl();
        User user = (User) session.getAttribute("user");
        if (user != null) {
            Map<Long, User> allUsers = userService.findAll();
            List<User> subscribes = userService.findAllSubscribesById(user.getId());
            allUsers.remove(user.getId());
            session.setAttribute("usersMap", allUsers);
            session.setAttribute("users", allUsers.values());
            session.setAttribute("subscribes", subscribes);
        }
        return commandResult;
    }
}
