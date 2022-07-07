package by.chuyashkou.social.command;

import by.chuyashkou.social.command.impl.*;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum CommandType {

    REGISTRATION(new RegistrationCommandImpl()),
    LOGIN(new LoginCommandImpl()),
    LOGOUT(new LogoutCommandImpl()),
    FOLLOWERS(new FollowersCommandImpl()),
    ALL_USERS(new AllUsersCommandImpl()),
    DELETE_USER(new DeleteUserCommandImpl()),
    UPDATE_USER(new UpdateUserCommandImpl()),
    USER_PROFILE(new UserProfileCommandImpl()),
    DELETE_FOLLOWER(new DeleteFollowerCommandImpl()),
    SUBSCRIBE(new SubscribeCommandImpl());

    private final Command command;

    public Command getCommand() {
        return command;
    }
}
