package com.dgmf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Instanciation du conteneur IoC basée sur la classe
        // de configuration BeanConfig
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        // Récupération d'un Bean de Type ShoppingCart
        ShoppingCart cart = context.getBean(ShoppingCart.class);
        cart.checkout();
    }
}
