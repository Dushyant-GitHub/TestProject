package com.test.TestProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
		addNumber(5,10);
		subtraction(10, 5);
		multiplyNumber(3,4);
		division(4,2);
		reminder(5,3);
		//hello World

		SampleA sampleA = new SampleA(3,8);
		sampleA.addTheNumbers();
		sampleA.multiply();
		division(100,2);
	}

	private static void addNumber(int a, int b){
		int result = a+b;
		System.out.println("Addition is : "+result);
	}
	private static void subtraction(int a, int b){
		System.out.println("Result: "+(a-b));
	}

	private static void multiplyNumber(int a, int b){
		int result = a*b;
		System.out.println("Multiplication is : "+result);
		System.out.println("This is Dushyant Shinde.");
		System.out.println("This is Prachi Dushyant Shinde");
		System.out.println("Hello world");
	}
	private static void division(int a, int b){
		float division = a/b;
		System.out.println("Division is : "+division);
	}
	private static void reminder(int a, int b){
		int reminder = a%b;
		System.out.println("reminder : "+reminder);
		System.out.println("reminder is printed");
		System.out.println("new commite");
		System.out.println("This change is by Prachi...");
	}

	public static void divideAndMultiply(int a ,int b){
		System.out.println("Divide : "+a/b);
		System.out.println("Multiply :"+a*b);
	}

}
