package com.baton;

public class Test {
    @MyAnnotation(yourName = "Eugene",yourAge = "25")
    public void myMethod1() {
        System.out.println("Method 1");
    }

    @MyAnnotation(yourAge = "No age.")
    public void myMethod2() {
        System.out.println("Method 2");
    }
}
