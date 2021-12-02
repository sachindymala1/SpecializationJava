package Exercises;

import java.util.ArrayList;
import java.util.List;

public class ListManager {

    public static void main(String[] args){
        List<String> list1 =new ArrayList<String>();
        List<String> list2 =new ArrayList<String>();
        list1.add("apple");
        list1.add("orenge");
        list1.add("grape");
        list1.add("watermelon");
        list2.add("apple");
        list2.add("grape");

        System.out.println(removeElements(list1,list2));
    }



    public static List removeElements(List list1,List list2){


        list1.removeAll(list2);


        return list1;
    }
}

