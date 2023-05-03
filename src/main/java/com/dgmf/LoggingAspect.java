package com.dgmf;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect // Classe chargée du cross-cutting concern Loggin
@Component // Classe à "Beanner"
public class LoggingAspect {
    // Méthodes du LoggingAspect
    @Before("execution(* com.dgmf.ShoppingCart.checkout(..))")
        public void beforeLogger(JoinPoint jp) {
        System.out.println(jp.getSignature());
        String joinPointArg = jp.getArgs()[0].toString();

        System.out.println("Before Loggers with Argument : " + joinPointArg);
    }

    @After("execution(* *.*.*.checkout(..))")
    public void afterLogger() {
        System.out.println("After Loggers ...");
    }
}
