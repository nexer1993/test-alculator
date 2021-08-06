package by.nexer.calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RomaNum {
    static final Map<String,Integer > romeNumbers = new HashMap<>() {{
        put("I",1);
        put("II",2);
        put("III",3);
        put("IV",4);
        put("V",5);
        put("VI",6);
        put("VII",7);
        put("VIII",8);
        put("IX",9);
        put("X",10);

    }};

    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    public final static String toRoman(int number) {
        int l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);
    }
}
