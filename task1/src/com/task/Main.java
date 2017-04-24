package com.task;

public class Main {

    public static void main(String[] args) {//class invokes run method in each class
	// write your code here
        squarecalculator.run();
        System.out.println("-- next class--");
        velocity.run();
        System.out.println("-- next class--");
        CircleCalculations.run();
    }
}
