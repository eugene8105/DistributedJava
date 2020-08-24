package com.baton;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
// will be retained at runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    public abstract String yourName() default "No name";
    String yourAge();
}
