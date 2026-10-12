package org.example;

public class Computer {
    private VideoCard videoCard;

    public Computer() {
        System.out.println("комп создан");
    }

    public void setVideoCard(VideoCard videoCard) {
        System.out.println("Видеокарта внедрена через сеттер");
        this.videoCard = videoCard;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }
}
