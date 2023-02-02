package com.springframework.portfoliowebsite.controllers;

import com.springframework.portfoliowebsite.repositories.AboutMeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private final AboutMeRepository aboutMeRepository;

    public IndexController(AboutMeRepository aboutMeRepository) {
        this.aboutMeRepository = aboutMeRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("aboutMes", aboutMeRepository.findAll());

        return "index";
    }
}
