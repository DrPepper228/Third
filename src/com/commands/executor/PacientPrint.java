package com.commands.executor;
import com.clinic.Pacient;
import com.commands.CommandsType;

public class PacientPrint {
    @Override
    public int execute(String command) {return printPacient(command);}
    @Override
    public CommandsType getCommandsType() {return CommandsType.PRINT_PACIENT;}

    public int printPacient(String command) {
        System.out.println("Print pacient");

        for (int id = 0; id < Pacient.getPacientSize(); id++) {
            System.out.printf("Id: \"%d\" name: \"%s\" surname: \"%s\" patronymic: \"%s\" registration: \"%s\"%n",
                    id, Pacient.getPacNameArray(id), Pacient.getPacSurArray(id), Pacient.getPacPatArray(id),
                    Pacient.getPacDatRegArray(id));
        }

        return 1;
    }
}
