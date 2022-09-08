package com.bct.java8features.methodreferences;

import java.util.function.BiFunction;

interface MyInterface{
	// A method -- abstract method
	public void display();
}
 // --> make reference to the abstract method and instance method -->
// Method reference to an instance method of an object -Object::instanceMethod


/* 
 * Method reference to static method of the class.
 * 
 */
class Addition{
	static int add(int numberOne, int numberTwo) {
		return numberOne + numberTwo;
	}
}
public class Student {
	/*
	 * Method references is a short hand notation of lambda expression to call a method.
	 * str -> System.out.println(str);
	 * System.out :: println(str);
	 */
	

	public void myMethod() {
		System.out.println("Instance Method");
		System.out.println("------------- I have been referenced by the abstract----------");
	}
	public static void main(String[] args) {
		// Create an object to class - Student 
		Student object = new Student();
		//method reference using the object of the class.
		MyInterface ref = object::myMethod;
		
		//calling the method of functional interface
		ref.display();
		
		//If I wanted to call the instance method directly...!!!
		object.myMethod();
		
		// create an object to class -Addition
		BiFunction<Integer,Integer,Integer> addition = Addition::add;
		int sum = addition.apply(5, 6);
		System.out.println("Addition of given number is : "+sum);
	}

}
