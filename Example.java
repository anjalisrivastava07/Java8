package com.bct.java8features.methodreferences;

import java.util.Arrays;

// Method reference to an instance method of an arbitrary object of a particular type.

public class Example {

	public static void main(String[] args) {
		String[] stringArray= {
				"Sachin","Anil","Java","Programming"," Method","reference"
		};
		/*
		 * Method reference to an instance method of an arbitrary object of a particilar 
		 * type
		 */
		Arrays.sort(stringArray,String::compareTo);
		for(String data:stringArray) {
			System.out.println(data);
		}
		}

}
