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
		//hello World
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

	}

}
