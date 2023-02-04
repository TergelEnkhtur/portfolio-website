package com.springframework.portfoliowebsite.controllers;

import com.springframework.portfoliowebsite.repositories.CandidateRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private final CandidateRepository candidateRepository;

    public IndexController(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("Candidates", candidateRepository.findAll());

        return "index";
    }
}
