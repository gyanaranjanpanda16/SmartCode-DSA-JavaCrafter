package com.gyanaranjan.NewJava8ProgramCollection;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
public class LongestStringInListOfStrings {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("Apple", "Banana", "Orange", "Grape", "Mango");

            // Find the longest word in the list
            Optional<String> longestWord = words.stream()
                    .max(Comparator.comparingInt(String::length));

            // Print the longest word if present
            longestWord.ifPresent(word -> System.out.println("Longest word: " + word));
        }
    }


