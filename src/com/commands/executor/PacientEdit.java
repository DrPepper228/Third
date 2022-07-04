package com.commands.executor;
import com.clinic.Pacient;
import com.commands.CommandsType;
import java.util.Scanner;

public class PacientEdit {
    @Override
    public int execute(String command) {return editPacient(command);}
    @Override
    public CommandsType getCommandsType() {return CommandsType.DELETE_PACIENT;}

    private int editPacient(String command) {
        System.out.println("Write new pacient full name");
        var wordsArray = command.split(" ");

        Scanner s = new Scanner(System.in);
        System.out.print("Choose pacinet id: ");
        var id = s.nextInt();

        Pacient.setNSPPacient(id, wordsArray[0], wordsArray[1], wordsArray[2]);

        System.out.println("Pacient edited");
        return 1;
    }
}
