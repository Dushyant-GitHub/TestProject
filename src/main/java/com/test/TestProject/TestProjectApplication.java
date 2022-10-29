package com.test.TestProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
		subtraction(10, 5);
		//hello World
	}

	private static void subtraction(int a, int b){
		System.out.println("Result: "+(a-b));
	}

}
