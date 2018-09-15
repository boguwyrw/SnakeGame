package pl.home.snake.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SnakeController {

    //@RequestMapping(path = "/", method = RequestMethod.GET)
    @GetMapping(path = "/snake/")
    public String snake(){
        return "snakePage";
    }

}
