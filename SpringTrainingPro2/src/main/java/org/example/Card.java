package org.example;

public class Card implements VideoCard {
    private int series;
    private String mark;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Card() {
        System.out.println("Видеокарта создана");
    }

    @Override
    public void check() {
        System.out.println(mark + " " + series);
    }
}
