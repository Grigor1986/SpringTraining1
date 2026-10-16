package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
       Card card = context.getBean("card", Card.class);
        System.out.println(card.getMark() + " " + card.getSeries());
        context.close();
    }
}
