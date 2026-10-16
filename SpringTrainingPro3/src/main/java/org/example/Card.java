package org.example;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter
public class Card implements VideoCard {
    @Value("${card.mark}")
    private String mark;
    @Value("${card.series}")
    private int series;

    public Card() {
        System.out.println("Бин карты создан");
    }

    @PostConstruct
    public void init() {
        System.out.println("Бин инит метод");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Бин дестрой метод");
    }
}
