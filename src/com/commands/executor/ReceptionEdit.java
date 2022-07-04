package com.commands.executor;
import com.clinic.Pacient;
import com.clinic.Reception;
import com.commands.CommandsType;

import java.util.Scanner;

public class ReceptionEdit {
    @Override
    public int execute(String command) {return editReception(command);}
    @Override
    public CommandsType getCommandsType() {return CommandsType.EDIT_RECEPTION;}

    private int editReception(String command) {
        for (int i = 0; i < Reception.getStatusSize(); i++) {
            System.out.println(Reception.getStatus(i));
        }
        System.out.println("Write status");
        var wordsArray = command;
        Scanner s = new Scanner(System.in);
        System.out.println("Choose reception id to change status");
        var id = s.nextInt();

        Reception.setStatusReception(id, wordsArray);

        System.out.println("Reception edited");
        return 1;
    }
}
