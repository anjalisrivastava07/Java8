package com.bct.java8features.functional.interfaces;

import java.util.function.IntBinaryOperator;
//default interfaces
interface Myinterface{
	 default void newMethod() {
		System.out.println("Newly added default method.");
	}
	 //abstract method
	 public void exsistingMethod(String str);
}
//Inheritance concept
class Example implements Myinterface{

	@Override
	public void exsistingMethod(String str) {
		System.out.println("String is : "+str);
		
	}	
}

//Creating our own functional interface

interface MyFunctionalInterface{
	//single abstract method.
	public int addMethod(int a ,int b);
}
public class FunctionalInterface {

	public static void main(String[] args) {
		// Lambda operation
		MyFunctionalInterface sum=(a,b) -> a+b;
		System.out.println("Result = "+sum.addMethod(12,100));
		
		//predefined functions interface
		//lambda expression
		System.out.println("---Printed by predefined interface---");
		IntBinaryOperator add =(a,b) -> a+b;
		System.out.println("Result = "+add.applyAsInt(12,100));
		
		//creating an object to the class Example
		Example instan = new Example();
		//calling the default method of interface
		instan.newMethod();
		//calling the abstract method of interface
		instan.exsistingMethod("Java 8 is easy to learn");

	}

}
