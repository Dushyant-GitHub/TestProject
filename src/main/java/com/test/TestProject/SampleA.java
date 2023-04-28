package com.test.TestProject;

public class SampleA {

    int a, b;
    String firstName;
    String lastName;
    String city;
    
    public SampleA(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int addTheNumbers(){
        System.out.println("Adding the numbers");
        return a+b;
    }

    public int multiply(){
        System.out.println("Multiplication ....");
        return a*b;
    }
     public void greetingTheWorld() {
         System.out.println("Hello World.....By Dushyant");
     }

    public void sayOlaToTheWorld(){
        System.out.println("say OLAAAAAAA !!!!!");
    }
    
    public String getName(){
         System.out.println("Testing rebase!!!!!");
        return "PRachi";
    }
    
     public void setlastName(String name) {
        this.lastName = name;
    }
    
     public void setfirstName(String name) {
        this.firstName = name;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    
}
