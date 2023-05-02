package com.dgmf;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    // Different Aspects :
    // Logging (LoggingAspect)
    // Authentication & Authorization
    // Sanitize the Data
    public void checkout(String status) {
        System.out.println("Checkout Method from ShoppingCart Called ...");
    }
}
