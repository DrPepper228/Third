package com.commands.executor;
import com.clinic.Doctor;
import com.commands.CommandsType;

public class DoctorPrint {
    @Override
    public int execute(String command) {return printDoctor(command);}
    @Override
    public CommandsType getCommandsType() {return CommandsType.PRINT_DOCTOR;}

    private int printDoctor(String command) {
        System.out.println("Print doctor");
        for (int i = 0; i < Doctor.getDoctorSize(); i++) {
            System.out.printf("Surname: \"%s\" surname: \"%s\" work experience: \"%s\" specialization: \"%s\"%n",
                    Doctor.getDoctorNamArray(i), Doctor.getDoctorSurArray(i), Doctor.getDoctorExpWorArray(i),
                    Doctor.getDoctorSpecialArray(i));
        }

        return 1;
    }
}
