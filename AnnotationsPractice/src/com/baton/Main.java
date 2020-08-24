package com.baton;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = new Test().getClass().getMethod("myMethod1");
        MyAnnotation myAnn = method.getAnnotation(MyAnnotation.class);
        System.out.println(myAnn.yourName() + "\t" + myAnn.yourAge());
    }
}
