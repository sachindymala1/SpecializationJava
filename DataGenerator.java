package Exercises;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataGenerator {
   public static void main(String[] args){
        System.out.println(getDate());
    }

    public static String getDate(){
        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy:mm:ss");
        Date date=new Date();

        String strDate=format.format(date);
        return strDate;
    }
}
/*Class Name DataGenerator
Method Name getDate
Method Description Returns the current date
Argument String format
Return Type String date
Logic Return the current date in the specified format*/