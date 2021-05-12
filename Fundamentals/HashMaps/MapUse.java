package hashMaps;

import java.util.HashMap;
import java.util.Set;

public class MapsUse {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //insert
        map.put("abc", 2);
        map.put("bcd", 10);

        // size
        System.out.println(map.size());

        //check presence
        if (map.containsKey("abc")) {
            System.out.println("Comatains the abc key");
        } else {
            System.out.print("Not present");
        }

        //get value
        int v = 0;
        if (map.containsKey("abc")) {
            v = map.get("abc");
        }
        System.out.println(v);


        // iterate
        Set<String> key = map.keySet();
        for (String str : key) {
            System.out.println(str);
        }

        //remove
        int r = map.remove("abc");
        System.out.println(r);

        // contains value --> time complexity will be 0(n)
        if (map.containsValue(100)) {
            System.out.print("True");
        }


    }

}
