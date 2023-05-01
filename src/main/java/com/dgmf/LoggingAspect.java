package com.dgmf;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
    public void logger() {
        System.out.println("Loggers ...");
    }
}
