package by.chuyashkou.social.command.impl;

import by.chuyashkou.social.command.Command;
import by.chuyashkou.social.command.CommandResult;
import by.chuyashkou.social.command.NavigationType;
import by.chuyashkou.social.model.User;
import by.chuyashkou.social.util.PageManager;
import by.chuyashkou.social.util.PageMappingConstant;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class FollowersCommandImpl implements Command {
    @Override
    public CommandResult execute(HttpServletRequest req) {
        CommandResult commandResult = new CommandResult(PageManager.getPageURI(PageMappingConstant.PAGE_FOLLOWERS.getKey()),
                NavigationType.FORWARD);
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        if (user != null) {
            session.setAttribute("users", user.getFollowers().values());
        }
        return commandResult;
    }
}
