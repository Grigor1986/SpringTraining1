package org.example;

import org.springframework.stereotype.Component;

@Component
public class DiscretCard implements VideoCard{

    @Override
    public void check() {
        System.out.println("riva TNT");
    }
}
