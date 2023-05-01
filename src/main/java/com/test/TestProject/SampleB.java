package com.test.TestProject;

public class SampleB {

    String length;
    String height;
    String depth;

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public void calculateDimension(){
        System.out.println("calculating the dimensions");
        System.out.println("Result is the product of l*h*b");
       // return length*height*depth;
    }

    public void doingSomeThing() {
        try {
            // Displaying the thread that is running
            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + " is running");
        } catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
