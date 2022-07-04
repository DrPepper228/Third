package com.commands.executor;
import com.clinic.Pacient;
import com.clinic.Reception;
import com.commands.CommandsType;
import java.util.Scanner;

public class ReceptionPrint {
    @Override
    public int execute(String command) {return printReception(command);}
    @Override
    public CommandsType getCommandsType() {return CommandsType.PRINT_RECEPTION;}

    private int printReception(String command) {
        System.out.println("Print reception");
        System.out.println("Pacients");
        for (int id = 0; id < Pacient.getPacientSize(); id++) {
            System.out.println("Name: " + Pacient.getPacNameArray(id) + "surname: " + Pacient.getPacSurArray(id));
        }
        System.out.print("Write pacient full name: ");
        var wordsArray = command.split(" ");

        System.out.printf("Pacient, name: \"%s\" surname: \"%s\"%n", wordsArray[0], wordsArray[1]);
        System.out.println("Doctors");
        for (int id = 0; id < Reception.getRecSize(); id++) {
            if (Reception.recPacNameArray.get(id) == wordsArray[0]
                    && Reception.recPacSurnameArray.get(id) == wordsArray[1]) {
                System.out.printf("Name: \"%s\" surname: \"%s\"%n", Reception.getRecDocNameArray(id),
                        Reception.getRecDocSurArray(id));
            }
        }
        return 1;
    }
}
