package com.commands.executor;

import com.clinic.Doctor;
import com.commands.CommandsType;

public class DoctorCreate {
    @Override
    public int execute(String command) {return createDoctor(command);}
    @Override
    public CommandsType getCommandsType() {return CommandsType.CREATE_DOCTOR;}

    private int createDoctor(String command) {
        var wordsArray = command.split(" ");

        Doctor.doctorNameArray.add(wordsArray[0]);
        Doctor.doctorSurArray.add(wordsArray[1]);
        Doctor.doctorExpWorkArray.add(wordsArray[2]);
        Doctor.doctorSpecialArray.add(wordsArray[3]);

        System.out.println("Doctor created");
        return 1;
    }
}
