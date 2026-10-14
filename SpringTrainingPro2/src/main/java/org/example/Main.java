package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cтарт приложения");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
      Card card = context.getBean("card", Card.class);
      Computer computer1 = context.getBean("computer", Computer.class);
      Computer computer2 = context.getBean("computer", Computer.class);
      Computer computer3 = context.getBean("computer", Computer.class);
      System.out.println(computer1.getVideoCard());
      System.out.println(computer2.getVideoCard());
      System.out.println(computer3.getVideoCard());
        System.out.println(computer1 == computer2);
//      card.setMark("RTX 3050");
//        Card card2 = context.getBean("card", Card.class);
//        card2.setMark("RTX 3070");
//        System.out.println(card == card2);
        System.out.println(card.getMark() + " " + card.getSeries());
//        System.out.println(card2.getMark());
        context.close();
        System.out.println("Конец приложения");
    }
}
