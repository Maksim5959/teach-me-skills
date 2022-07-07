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

public class SubscribeCommandImpl implements Command {

    @Override
    public CommandResult execute(HttpServletRequest req) {
        CommandResult commandResult;
        HttpSession session = req.getSession();
        UserService userService = new UserServiceImpl();
        User user = (User) session.getAttribute("user");
        long id = Long.parseLong(req.getParameter("id"));
        boolean isSubscribed = userService.subscribe(id, user.getId());
        if (isSubscribed) {
            Map<Long, User> allUsers = (Map<Long, User>) session.getAttribute("usersMap");
            List<User> subscribes = (List<User>) session.getAttribute("subscribes");
            User subscriber = allUsers.get(id);
            subscribes.add(subscriber);
            session.setAttribute("users", allUsers.values());
            session.setAttribute("subscribes", subscribes);
            commandResult = new CommandResult(PageManager.getPageURI(PageMappingConstant.PAGE_ALL_USERS.getKey())
                    , NavigationType.FORWARD);
        } else {
            commandResult = new CommandResult();
        }
        return commandResult;
    }
}
