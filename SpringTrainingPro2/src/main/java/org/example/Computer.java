package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Computer {

    private VideoCard videoCard;

    public Computer() {
        System.out.println("Бин создан через пустой конструктор");
    }
@Autowired
    public Computer(@Qualifier(value = "card") VideoCard videoCard) {
        System.out.println("Бин компа создан через конструктор с картой");
        this.videoCard = videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        System.out.println("Видеокарта внедрена через сеттер");
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }
}