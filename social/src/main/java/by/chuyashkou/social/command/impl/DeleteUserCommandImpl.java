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

public class DeleteUserCommandImpl implements Command {
    @Override
    public CommandResult execute(HttpServletRequest req) {
        CommandResult commandResult;
        HttpSession session = req.getSession();
        UserService userService = new UserServiceImpl();
        User user = (User) session.getAttribute("user");
        boolean isDeleted = userService.deleteById(user.getId());
        if (isDeleted) {
            session.invalidate();
            commandResult = new CommandResult(req.getContextPath() + PageManager.getPageURI(PageMappingConstant.PAGE_MAIN.getKey())
                    , NavigationType.REDIRECT);
        } else {
            commandResult = new CommandResult();
        }
        return commandResult;
    }
}
