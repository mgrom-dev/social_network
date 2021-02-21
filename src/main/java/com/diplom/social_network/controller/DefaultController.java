package com.diplom.social_network.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//для обычных запросов не через API (главная страница - /, в частности)

@Controller
@RequestMapping("/")
public class DefaultController {

    @GetMapping
    public String home() {
        return "index.html";
    }
}
