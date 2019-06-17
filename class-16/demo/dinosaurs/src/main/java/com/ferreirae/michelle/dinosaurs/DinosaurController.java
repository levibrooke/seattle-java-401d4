package com.ferreirae.michelle.dinosaurs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DinosaurController {

    @GetMapping("/dinosaurs")
    public String getDinosaurs() {
        return "dinosaurs";
    }
}
