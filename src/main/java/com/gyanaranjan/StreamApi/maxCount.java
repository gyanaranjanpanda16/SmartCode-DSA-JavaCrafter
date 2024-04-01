package com.gyanaranjan.StreamApi;

import java.util.Map;
import java.util.TreeMap;

public class maxCount {
    public static void main(String[] args) {
//                String inputString = "gyanaranjan";
        String [] arr = {"sira","sira","ram","gita","ram"};
                // Create a TreeMap to store character occurrences in order
//                Map<Character, Integer> charOccurrences = new TreeMap<>();
                Map<String, Integer> charOccurrences = new TreeMap<>();
                // Iterate through the string and count character occurrences
                for (String c : arr) {
                    charOccurrences.put(c, charOccurrences.getOrDefault(c, 0) + 1);
                }
                System.out.println(charOccurrences);

    }
}
