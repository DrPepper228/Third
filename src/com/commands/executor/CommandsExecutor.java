package com.commands.executor;
import com.commands.CommandsType;

public interface CommandsExecutor {
    int execute(String command);
    CommandsType getCommandsType();
}
