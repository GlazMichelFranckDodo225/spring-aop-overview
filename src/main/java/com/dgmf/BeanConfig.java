package com.dgmf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// Définit la config des Beans
@Configuration
// Là où trouver les classes à "Beanner"
@ComponentScan(basePackages = "com.dgmf")
// Active les fonctionnalités de l'AOP dans la config des Beans
@EnableAspectJAutoProxy
public class BeanConfig {
}
