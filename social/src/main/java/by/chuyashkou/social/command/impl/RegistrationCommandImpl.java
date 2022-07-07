package by.chuyashkou.social.command.impl;

import by.chuyashkou.social.command.Command;
import by.chuyashkou.social.command.CommandResult;
import by.chuyashkou.social.command.NavigationType;
import by.chuyashkou.social.model.User;
import by.chuyashkou.social.model.UserBuilder;
import by.chuyashkou.social.service.UserService;
import by.chuyashkou.social.service.impl.UserServiceImpl;
import by.chuyashkou.social.util.PageManager;
import by.chuyashkou.social.util.PageMappingConstant;

import javax.servlet.http.HttpServletRequest;

public class RegistrationCommandImpl implements Command {

    @Override
    public CommandResult execute(HttpServletRequest req) {
        CommandResult commandResult;
        UserService userService = new UserServiceImpl();
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
            commandResult = new CommandResult(req.getContextPath() + PageManager.getPageURI(PageMappingConstant.PAGE_LOGIN.getKey())
                    , NavigationType.REDIRECT);
        } else {
            commandResult = new CommandResult();
        }
        return commandResult;
    }
}
