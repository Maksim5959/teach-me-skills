package by.chuyashkou.social.command;

import javax.servlet.http.HttpServletRequest;

public interface Command {

    CommandResult execute(HttpServletRequest request);
}
