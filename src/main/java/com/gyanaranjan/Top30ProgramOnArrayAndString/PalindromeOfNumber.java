package com.gyanaranjan.Top30ProgramOnArrayAndString;

public class PalindromeOfNumber {
    public static void main(String[] args) {
        int num = 121;
        int rev =0 ;
        while(num!=0){
            rev = rev*10 +num%10;
            num = num/10;
        }
        if(num==rev){
            System.out.println("Given Number is a Palindrom :-->");
        }else{
            System.out.println("Given Number is Not a Palindrome :-->");
        }
    }
}
