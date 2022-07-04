package com.commands;
import com.commands.executor.*;
import java.util.Map;
import java.util.Scanner;

public class CommandsReader {
    private static final Map<CommandsType, CommandsExecutor> COMMAND_EXECUTORS_GROUPED_BY_COMMAND =Map.of(
            CommandsType.CREATE_DOCTOR, new DoctorCreate(),
            CommandsType.CREATE_PACIENT, new PacientCreate(),
            CommandsType.CREATE_RECEPTION, new ReceptionCreate(),
            CommandsType.DELETE_PACIENT, new PacientDelete(),
            CommandsType.EDIT_PACIENT, new PacientEdit(),
            CommandsType.EDIT_RECEPTION, new ReceptionEdit(),
            CommandsType.PRINT_DOCTOR, new DoctorPrint(),
            CommandsType.PRINT_PACIENT, new PacientPrint(),
            CommandsType.PRINT_RECEPTION, new ReceptionPrint()
    );

    public static void executionOperations() {
        Scanner str = new Scanner(System.in);
        int i = 1;
        while (i != 0) {
            i = readingCommands(str);
        }
        str.close();
    }

    private static int readingCommands(Scanner str) {
        String readCommand = str.nextLine();
        CommandsType commandsType = getCommandsType(readCommand);
        if (COMMAND_EXECUTORS_GROUPED_BY_COMMAND.containsKey(commandsType)) {
            var commandsExecutor = COMMAND_EXECUTORS_GROUPED_BY_COMMAND.get(commandsType);
            return commandsExecutor.execute(readCommand);
        }
        if (commandsType == CommandsType.EXIT) {
            return 0;
        }
        System.out.println("command is not defined");
        return -1;
    }

    private static CommandsType getCommandsType(String readCommand) {
        if (readCommand.contains("create doctor")) {
            return CommandsType.CREATE_DOCTOR;
        }
        if (readCommand.contains("create pacient")) {
            return CommandsType.CREATE_PACIENT;
        }
        if (readCommand.contains("create reception")) {
            return CommandsType.CREATE_RECEPTION;
        }
        if (readCommand.contains("edit reception")) {
            return CommandsType.EDIT_RECEPTION;
        }
        if (readCommand.contains("print reception")) {
            return CommandsType.PRINT_RECEPTION;
        }
        if (readCommand.contains("edit pacient name")) {
            return CommandsType.EDIT_PACIENT;
        }
        if (readCommand.contains("print pacient")) {
            return CommandsType.PRINT_PACIENT;
        }
        if (readCommand.contains("delete pacient")) {
            return CommandsType.DELETE_PACIENT;
        }
        if (readCommand.contains("print doctor")) {
            return CommandsType.PRINT_DOCTOR;
        }
        if (readCommand.contains("exit")) {
            return CommandsType.EXIT;
        }
        return CommandsType.UNDEFINED;
    }
}
