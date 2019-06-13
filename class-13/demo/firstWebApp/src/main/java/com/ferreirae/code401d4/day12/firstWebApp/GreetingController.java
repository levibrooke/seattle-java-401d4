package com.ferreirae.code401d4.day12.firstWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class GreetingController {

    @Autowired
    GreetingRepository greetingRepository;

    @GetMapping("/greetings")
    public String getAllGreetings(Model m) {
        Iterable<Greeting> greetings = greetingRepository.findAll();
        m.addAttribute("greetings", greetings);
        return "allGreetings";
    }

    @GetMapping("/greetings/new")
    public String getAddGreetingForm() {
        return "greetingForm";
    }

    @PostMapping("/greetings")
    public RedirectView addGreeting(@RequestParam String text, @RequestParam String language) {
        Greeting greeting = new Greeting(text, language);
        greetingRepository.save(greeting);
        return new RedirectView("/greetings");
    }
}
