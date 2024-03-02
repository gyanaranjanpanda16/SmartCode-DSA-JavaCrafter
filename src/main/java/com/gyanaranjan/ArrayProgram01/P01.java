package com.gyanaranjan.ArrayProgram01;

import java.util.Arrays;

public class P01 {
    String arrResult(int[] arr, int target,int setValue){

       for(int i=0;i<arr.length;i++){
           boolean b = false;
           if(arr[i]==target){
              arr[i] = setValue;
              System.out.println("Set Data successfully :- ");
              break;
           }
       }
       return "Target Value Not found  :- ";

    }

    public static void main(String[] args) {
        int [] array = {8,9,7,9,0,10};  // condition :- 0 replace by  5;
        P01 p01 = new P01();
        System.out.println(p01.arrResult(array,0,5));
        System.out.println(Arrays.toString(array));
    }
}
