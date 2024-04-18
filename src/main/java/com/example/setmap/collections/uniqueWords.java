package com.example.setmap.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class uniqueWords {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("Подснежник", "Роза","Роза",
                "Ирис", "Ирис", "Ирис"));
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            if (map.containsKey(string)) {
                Integer quantity = map.get(string);
                map.put(string, quantity + 1);
            }else {
                map.put(string, 1);
            }
        }
        for (Map.Entry< String, Integer> entry: map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }

        }
    }

}
