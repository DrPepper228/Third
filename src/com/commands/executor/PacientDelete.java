package com.commands.executor;
import com.clinic.Pacient;
import com.commands.CommandsType;

public class PacientDelete {
    @Override
    public int execute(String command) {return deletePacient(command);}
    @Override
    public CommandsType getCommandsType() {return CommandsType.DELETE_PACIENT;}

    private int deletePacient(String command) {
        var wordsArray = command.split(" ");

        if (Pacient.pacNameArray.contains(wordsArray[0]) && Pacient.pacSurnameArray.contains(wordsArray[1])
        && Pacient.pacPatronymicArray.contains(wordsArray[2])) {
            Pacient.pacNameArray.remove(wordsArray[0]);
            Pacient.pacSurnameArray.remove(wordsArray[1]);
            Pacient.pacPatronymicArray.remove(wordsArray[2]);
            Pacient.pacDateRegistrArray.remove(wordsArray[3]);
        }

        System.out.println("Pacient delete");
        return 1;
    }
}
