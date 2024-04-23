package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCountOnString {
    public static void main(String[] args) {
        String str = "hello its my sad story its my java story";
        String[] s = str.split(" ");
       Map<String , Integer> wordCount = new HashMap<>();
       for(String word:s){
           wordCount.put(word,wordCount.getOrDefault(word,0)+1);
       }
        System.out.println(wordCount);

    }
}
