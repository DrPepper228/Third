package com.commands.executor;
import com.clinic.Pacient;
import com.commands.CommandsType;

public class PacientCreate {
    @Override
    public int execute(String command) {return createPacient(command);}
    @Override
    public CommandsType getCommandsType() {return CommandsType.CREATE_PACIENT;}

    private int createPacient(String command) {
        var wordsArray = command.split(" ");

        Pacient.pacNameArray.add(wordsArray[0]);
        Pacient.pacSurnameArray.add(wordsArray[1]);
        Pacient.pacPatronymicArray.add(wordsArray[2]);
        Pacient.pacDateRegistrArray.add(wordsArray[3]);

        System.out.println("Pacient created");
        return 1;
    }
}
