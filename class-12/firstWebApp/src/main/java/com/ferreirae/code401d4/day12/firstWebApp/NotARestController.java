package com.ferreirae.code401d4.day12.firstWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotARestController {

    @GetMapping("/notresthello")
    public String getNotRestHello() {
        return "hello";
    }

}
