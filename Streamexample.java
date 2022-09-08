package com.bct.java8features.streamsAPI;

import java.util.ArrayList;
import java.util.List;

public class Streamexample {

	public static void main(String[] args) {
		// create a collection
		List<String> names = new ArrayList<>();
		
		// add the elements to the list
		names.add("Abc");
		names.add("Def");
		names.add("Ghi");
		names.add("Jkl");
		names.add("Mno");
		
				
		// I would like to count the number of elements present in the list
		// without stream implementation 
		int count = 0;
		for(String ele : names) {
			if(ele.length()<=6)
				count++;
		}
		System.out.println("There are "+ count+" Strings with length less than 6");
		// lets apply stream now! - using lambda expression
		int  number = (int)names.stream().filter(ele->ele.length()<=6).count();
		System.out.println("There are "+ number+" Strings with length less than 6");
		
		
		// create an integer based collection and check the even and odd numbers
		// using lambda expression.
		
		List<Integer> ll = new ArrayList<>();
		ll.add(21);
		ll.add(42);
		ll.add(76);
		ll.add(56);
		ll.add(91);
		
		int j =0;
		for(int i:ll) {
			if(i%2==0) {
				System.out.println(i+" is even");
			}	
			else {
				System.out.println(i+" is odd");
			}
		}
        ll.stream().forEach(i -> {if (i.intValue() % 2 == 0) {System.out.println("number is even");;} else {System.out.println("number is odd");;}});
	
	}

}
