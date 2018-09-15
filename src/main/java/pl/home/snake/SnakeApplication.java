package pl.home.snake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"pl.home.snake.controller"})
public class SnakeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnakeApplication.class, args);
    }
}
