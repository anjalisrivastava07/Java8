package com.bct.java8features.methodreferences;

import java.util.function.BiFunction;

interface MyInterfa{
	public void display();
}

class Subtraction{
	static int sub(int numberOne, int numberTwo) {
		return numberOne - numberTwo;
	}
}

public class JavaMethodInterfaces {

	public void myMethod() {}
	
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> subtraction = Subtraction::sub;
		int subtract = subtraction.apply(80, 6);
		System.out.println("Subtraction of given number is : "+subtract);
	}

}
