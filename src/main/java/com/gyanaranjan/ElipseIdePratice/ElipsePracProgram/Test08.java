package com.gyanaranjan.ElipseIdePratice.ElipsePracProgram;

public class Test08 {
	 public static void main(String[]args) {
		 
		 
		 int no = 564734637;
		 int leng =0;
		 int temp= no;
		 while(temp!=0) {
			 leng=leng+1;
			 temp=temp/10;
			 
		 }
		 System.out.println("lenth of "+no+"  is    "+ leng);
	 }

}
