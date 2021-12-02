package Exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListManager1 {

    public static void main(String[] args){
        String[] arr={"Apple","Mango","Chiku"};

        List<String> list2 =new ArrayList<String>();
        System.out.println(getArrayList(arr));
    }



    public static List getArrayList(String[] array){
        List list1 = Arrays.asList(array);
        Collections.sort(list1);

        return list1;
    }
}
