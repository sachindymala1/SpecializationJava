package Exercises;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;


public class AgeCalculator {
    public static void main(String[] args) throws ParseException {

        String DOB = "1999/08/31";
        System.out.println("Age is "+calculateAge(DOB)+"Years");

    }


    private static int calculateAge(String dob) throws ParseException {
        int age;
        SimpleDateFormat s= new SimpleDateFormat("yyyy/MM/dd");
        Date d=s.parse(dob);
        Calendar c= Calendar.getInstance();
        c.setTime(d);
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH);
        int date=c.get(Calendar.DATE);
        LocalDate d1=LocalDate.of(year,month,date);
        LocalDate d2=LocalDate.now();
        Period dif= Period.between(d1,d2);
        age = dif.getYears();

        return age;

    }
}
/*
Method Name calculateAge
Method Description Returns the age of the person
Argument String dob,String format
Return Type int age
Logic Returns the age of the person based on his date of
birth
 */