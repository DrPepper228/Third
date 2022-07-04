package com.commands.executor;
import com.clinic.Doctor;
import com.clinic.Pacient;
import com.clinic.Reception;
import com.commands.CommandsType;

public class ReceptionCreate {
    @Override
    public int execute(String command) {return createReception(command);}
    @Override
    public CommandsType getCommandsType() {return CommandsType.CREATE_RECEPTION;}

    private int createReception(String command) {
        System.out.println("Pacients");
        for (int id = 0; id < Pacient.getPacientSize(); id++) {
            System.out.println("Name: " + Pacient.getPacNameArray(id) + "surname: " + Pacient.getPacSurArray(id));
        }
        System.out.print("Write pacient: ");
        var wordsArray0 = command.split(" ");
        Reception.recPacNameArray.add(wordsArray0[0]);
        Reception.recPacSurnameArray.add(wordsArray0[1]);

        System.out.println("Doctors");
        for (int id = 0; id < Doctor.getDoctorSize(); id++) {
            System.out.println("Name: " + Doctor.getDoctorNamArray(id) + "surname: " + Doctor.getDoctorSurArray(id));
        }
        System.out.print("Write doctor: ");
        var wordsArray1 = command.split(" ");
        Reception.recDocNameArray.add(wordsArray1[0]);
        Reception.recDocSurnameArray.add(wordsArray1[1]);

        System.out.print("Write time, day and status: ");
        var wordsArray = command.split(" ");

        Reception.receptionTimeArray.add(wordsArray[0]); //time, example, 9:30
        Reception.receptionDayArray.add(wordsArray[1]); //day, (month-day), example, 12.24
        Reception.receptionStatusArray.add(wordsArray[2]); //status, example, new

        System.out.println("Reception created");
        return 1;
    }
}
