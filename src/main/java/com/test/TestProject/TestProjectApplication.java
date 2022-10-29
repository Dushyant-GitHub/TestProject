package com.test.TestProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
		addNumber(5,10);
		//hello World
	}

	private static void addNumber(int a, int b){
		int result = a+b;
		System.out.println("Addition is : "+result);
	}

	private static void multiplyNumber(int a, int b){
		int result = a*b;
		System.out.println("Multiplication is : "+result);
	}

}
