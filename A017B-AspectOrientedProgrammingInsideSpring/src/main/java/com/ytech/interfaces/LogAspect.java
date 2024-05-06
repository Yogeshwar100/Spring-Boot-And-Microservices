package com.ytech.interfaces;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // To instruct Spring to intercept method at runtime
@Target(ElementType.METHOD) // To target method
public @interface LogAspect {
}
