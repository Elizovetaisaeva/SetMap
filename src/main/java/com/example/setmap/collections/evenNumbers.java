package com.example.setmap.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class evenNumbers {
        public static void main(String[] args) {
            List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4,
                    4, 5, 5, 6, 7));
            Set<Integer> set = new TreeSet<>(nums);
            for (Integer num : set) {
              if (num % 2 == 0) {
                  System.out.println(num);
              }
            }


            }
        }


