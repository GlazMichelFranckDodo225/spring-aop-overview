package com.dgmf;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect // Classe chargée du cross-cutting concern Loggin
@Component // Classe à "Beanner"
public class LoggingAspect {
    // Méthodes du LoggingAspect
    @Before("execution(* com.dgmf.ShoppingCart.checkout())")
    public void logger() {
        System.out.println("Loggers ...");
    }
}
