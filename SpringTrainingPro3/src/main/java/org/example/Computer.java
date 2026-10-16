package org.example;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;

@Getter
@Setter
public class Computer {

    private VideoCard videoCard;

    public Computer() {
        System.out.println("Бин компа создан через пустой конструктор с картой");
    }

    public Computer(@Qualifier(value = "card") VideoCard videoCard) {
        System.out.println("Бин компа создан через конструктор с картой");
        this.videoCard = videoCard;
    }
}
