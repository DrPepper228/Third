package com.clinic;
import java.util.ArrayList;

public class Doctor {
    public String doctorName;
    public String doctorSurname;
    private String doctorExpWork;
    private String doctorSpecial;

    public static ArrayList<String> doctorNameArray = new ArrayList<>();
    public static ArrayList<String> doctorSurArray = new ArrayList<>();
    public static ArrayList<String> doctorExpWorkArray = new ArrayList<>();
    public static ArrayList<String> doctorSpecialArray = new ArrayList<>();

    public String getDoctorName() {return doctorName;}
    public String getDoctorSurname() {return doctorSurname;}
    public String getDoctorExpWork() {return doctorExpWork;}
    public String getDoctorSpecial() {return doctorSpecial;}

    public static String getDoctorNamArray(int id) {return doctorNameArray.get(id);}
    public static String getDoctorSurArray(int id) {return doctorSurArray.get(id);}
    public static String getDoctorExpWorArray(int id) {return doctorExpWorkArray.get(id);}
    public static String getDoctorSpecialArray(int id) {return doctorSpecialArray.get(id);}

    public static int getDoctorSize() {return doctorNameArray.size();}
}
