package org.example;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "org.example")
@PropertySource(value = "classpath:application.properties")
public class Config {

    @Bean
    @Scope("prototype")
    public VideoCard card() {
        return new Card();
    }

    @Bean
    public Computer computer() {
        return new Computer(card());
    }
}
