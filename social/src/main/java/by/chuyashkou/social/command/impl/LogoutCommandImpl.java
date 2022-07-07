package by.chuyashkou.social.command.impl;

import by.chuyashkou.social.command.Command;
import by.chuyashkou.social.command.CommandResult;
import by.chuyashkou.social.command.NavigationType;
import by.chuyashkou.social.util.PageManager;
import by.chuyashkou.social.util.PageMappingConstant;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LogoutCommandImpl implements Command {
    @Override
    public CommandResult execute(HttpServletRequest req) {
        CommandResult commandResult = new CommandResult(req.getContextPath() + PageManager.getPageURI(PageMappingConstant.PAGE_MAIN.getKey())
                , NavigationType.REDIRECT);
        HttpSession session = req.getSession();
        session.invalidate();
        return commandResult;
    }
}
