package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Primary
public class Card implements VideoCard {
@Value("${card.mark}")
    private String mark;
@Value("${card.series}")
    private int series;

    public Card() {
        System.out.println("Бин карты создан");
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @PostConstruct
    public void init() {
        System.out.println("Бин инит метод");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Бин дестрой метод");
    }

    @Override
    public void check() {

    }
//    @Override
//    public void check() {
//        System.out.println(mark + " " + series);
//    }
}
