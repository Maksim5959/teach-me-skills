package by.chuyashkou.social.command;

import lombok.experimental.UtilityClass;

import java.util.Locale;

@UtilityClass
public class CommandFactory {

    public Command defineCommand(String commandName) {
        return CommandType.valueOf(commandName.toUpperCase(Locale.ROOT)).getCommand();
    }
}
