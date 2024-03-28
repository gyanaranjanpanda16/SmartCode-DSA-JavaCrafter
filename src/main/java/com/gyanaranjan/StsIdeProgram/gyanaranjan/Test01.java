package com.gyanaranjan.StsIdeProgram.gyanaranjan;//package com.gyanaranjan;
//

//abstract
//final
//strictfp --> for strict calculation of floating value
//Default -->  canot write also private and protected also can't write
//abstract class Test01 {
//	public static void main(String[] args) {
//		Test01 test = new Test01();
//		System.out.println(test);              -----> [ in abstract class we can't create object]
//	  System.out.println("hii");
//	}
//
//}
// class Test01 {
//	 abstract void absk();
//	 public static void main(String[] args) {   ----> Either you can  declare class as abstract 
//        System.out.println("hii");		          if one abstract method is present or u can 
//	}                                                 still declare a class abstract without having
// }                                                  abstract method(). Ex - HttpService class.
//abstract class Test01{
//	abstract void add();
//	
//}
//class A extends Test01{
//                                            --------> if a normal class extends abstract class
//	@Override                                           then tht class should provide a implement 
//	void add() {                                        of tht class.
//		// TODO Auto-generated method stub
//		
//	}
//abstract class Test01 {
//	abstract void print();
//}
//abstract class A extends Test01{
//	abstract void add();
//	
//	public String exp() {
//		return null;
//	}
//}                               -------> Either a class can be abstract or if a normal class
//class B extends A{                      then  he should must be provide implement of body the method
//
//	@Override
//	void print() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	void add() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
//class Test01 {
//   public void run() {
//	   System.out.println("hii");
//   }
//}
//abstract class B extends Test01{
//	abstract public void play();
//	
//}
//abstract class c extends B{
//	abstract void size();
//	
//}
//class D extends c{
//
//	@Override
//	void size() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void play() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}









