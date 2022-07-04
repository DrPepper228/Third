package com.clinic;
import java.util.ArrayList;

class IdOutOfBoundsException extends Exception {
    @Override
    public String getMessage() {
        return "There is no patient with this id";
    }
}

public class Pacient {
    public String pacientName;
    public String pacientSurname;
    private String pacientPatronymic;
    private String dateRegistration;

    public static ArrayList<String> pacNameArray = new ArrayList<>();
    public static ArrayList<String> pacSurnameArray = new ArrayList<>();
    public static ArrayList<String> pacPatronymicArray = new ArrayList<>();
    public static ArrayList<String> pacDateRegistrArray = new ArrayList<>();

    public String getPacientName() {return pacientName;}
    public String getPacientSurname() {return pacientSurname;}
    public String getPacientPatronymic() {return pacientPatronymic;}
    public String getDateRegistration() {return dateRegistration;}

    public static String getPacNameArray(int id) {return pacNameArray.get(id);}
    public static String getPacSurArray(int id) {return pacSurnameArray.get(id);}
    public static String getPacPatArray(int id) {return pacPatronymicArray.get(id);}
    public static String getPacDatRegArray(int id) {return pacDateRegistrArray.get(id);}

    public static void setNSPPacient(int id, String pacientName, String pacientSurname, String pacientPatronymic) {
        try{
            if (id > getPacientSize()) {
                throw(new IdOutOfBoundsException());
            }
        } catch (IdOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            pacNameArray.set(id, pacientName);
            pacSurnameArray.set(id, pacientSurname);
            pacPatronymicArray.set(id, pacientPatronymic);
        }
    }

    public static int getPacientSize() {return pacNameArray.size();}
}
