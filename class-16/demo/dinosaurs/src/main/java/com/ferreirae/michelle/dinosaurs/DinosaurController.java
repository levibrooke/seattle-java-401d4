package com.ferreirae.michelle.dinosaurs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class DinosaurController {

    @GetMapping("/")
    public String getDinosaurs(Principal p, Model m) {
        System.out.println(p.getName());
        m.addAttribute("principal", p);
        return "dinosaurs";
    }
}
