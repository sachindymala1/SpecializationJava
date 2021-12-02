package Exercises;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class UniqueCollection {
    public static void main(String[] args){
        ArrayList<String> list1=new ArrayList<>();
        list1.add("Shukil");
        list1.add("Shivu");
        list1.add("Basvaraj");
        list1.add("Sayesh");
        list1.add("Manoj");
        list1.add("Sachin");
        Set<String> list2=new TreeSet<>(list1);
        System.out.println("ArrayList UNIQUE ELEMENTS");
        for (String str:list2){
            System.out.println(str);
        }




    }
}
/*ASccepts a String array and load the elements into a
collection that can hold only unique element in a
sorted order.
Argument String []elements
Return Type Interface type of the Collection used
Logic Accept a String array, convert it to a collection of
unique elements stored in sorted order and return
the results*/