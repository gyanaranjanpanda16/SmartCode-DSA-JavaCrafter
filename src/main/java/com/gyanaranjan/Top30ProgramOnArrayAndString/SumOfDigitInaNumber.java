package com.gyanaranjan.Top30ProgramOnArrayAndString;

import java.util.stream.Stream;

public class SumOfDigitInaNumber {
    public static void main(String[] args) {
        int number = 173843; //o/p will be 26 .
        // in java 8 wqays :-->
//        int sum = String.valueOf(number).chars().map(Character::getNumericValue).sum();
//        System.out.println(sum);
        // in data-structure way :-
        int sum =0;
        while(number>0){
            sum=sum+number%10;
            number=number/10;
        }
        System.out.println("Sum of digit of number :-  "+sum);
    }
}
