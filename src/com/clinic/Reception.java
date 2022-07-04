package com.clinic;
import java.util.ArrayList;
import java.util.Arrays;

class IdOutOfBoundException extends Exception {
    @Override
    public String getMessage() {
        return "There is no patient with this id";
    }
}

public class Reception {
    private String receptionTime;
    private String receptionDay;
    private String receptionStatus;
    private String recPacName;
    private String recPacSurname;
    private String recDocName;
    private String recDocSurname;

    public static ArrayList<String> receptionTimeArray = new ArrayList<>();
    public static ArrayList<String> receptionDayArray = new ArrayList<>();
    public static ArrayList<String> receptionStatusArray = new ArrayList<>();
    public static ArrayList<String> allStatus = new ArrayList<>(Arrays.asList("new", "in progress", "cancelled",
            "awaiting payment", "completed"));
    public static ArrayList<String> recPacNameArray = new ArrayList<>();
    public static ArrayList<String> recPacSurnameArray = new ArrayList<>();
    public static ArrayList<String> recDocNameArray = new ArrayList<>();
    public static ArrayList<String> recDocSurnameArray = new ArrayList<>();

    public String getReceptionTime() {return receptionTime;}
    public String getReceptionDay() {return receptionDay;}

    public String getRecPacName() {return recPacName;}
    public String getRecPacSurname() {return recPacSurname;}
    public String getRecDocName() {return recDocName;}
    public String getRecDocSurname() {return recDocSurname;}

    public static void setStatusReception(int id, String status) {
        try {
            if (id > getStatusSize()) {
                throw (new IdOutOfBoundException());
            }
        } catch (IdOutOfBoundException e) {
            System.out.println(e.getMessage());
        } finally {
            receptionStatusArray.set(id, status);
        }
    }

    public static String getRecDocNameArray(int id) {return recDocNameArray.get(id);}
    public static String getRecDocSurArray(int id) {return recDocSurnameArray.get(id);}

    public static int getRecSize() {return recPacNameArray.size();}
    public static int getStatusSize() {return allStatus.size();}
    public static String getStatus(int id) {return allStatus.get(id);}
}
