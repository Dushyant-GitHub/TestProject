package com.test.TestProject;

public class SampleA {

    int a, b;
    String name;

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

    public void setName(String name){
        System.out.println("Name  : "+name);
       this.name = name;
    }

    public int getRollNo(){
        System.out.println("Testing rebase!!!!!");
        return 34;
    }
}
