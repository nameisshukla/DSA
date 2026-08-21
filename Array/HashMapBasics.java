package Array;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {
    public static void main(String[] args) {
        Map<String,String> mapping = new HashMap<>();

        // Insertion
        mapping.put("in","India");
       // mapping.put("in","India2");the value will be updated to India2.
        mapping.put("en","England");
        mapping.put("us", "United states");

        System.out.println(mapping);

        Map<String,String> table = new HashMap<>();
        table.put("UK","United Kingdom");
        System.out.println("Before:"  + table);
        table.putAll(mapping);
        System.out.println("After:"  + table);

        //Deletion

    }
}
