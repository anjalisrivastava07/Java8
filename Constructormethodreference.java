package com.bct.java8features.methodreferences;

interface Myinterface{
	Hello display(String say);
}
class Hello{
	//constructor 
	Hello(String say) {
		System.out.println("Good morning guys..!! " +say);
	}
}
public class Constructormethodreference {

	public static void main(String[] args) {
		//Method reference to a constructor.
		Myinterface ref = Hello::new;
		ref.display("How are you doing..!!");

	}

}
