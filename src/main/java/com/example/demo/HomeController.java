package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
@GetMapping("/tvform")
    public String loadTvForm(Model model){
    model.addAttribute("tvshow", new House());
    return "tvform";

}

}
