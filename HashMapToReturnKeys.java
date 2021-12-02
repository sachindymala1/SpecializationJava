package Exercises;

import java.util.HashMap;
import java.util.Set;

public class HashMapToReturnKeys {
    public static void main(String[] args) {
        HashMap<String, String> demo = new HashMap<>();
        demo.put("lang", "java");
        demo.put("book", "animalLove");
        demo.put("colD", "Ice");
        Set<String> getKeys = demo.keySet();
        System.out.println("Keys are:" + getKeys);


    }
}
