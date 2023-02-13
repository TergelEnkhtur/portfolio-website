package com.springframework.portfoliowebsite.bootstrap;

import com.springframework.portfoliowebsite.domain.Candidate;
import com.springframework.portfoliowebsite.repositories.CandidateRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CandidateRepository candidateRepository;

    public BootStrapData(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in Bootstrap");

        Candidate candidate = new Candidate();

        candidate.setName("Tergel (Terry) Enkhtur");
        candidate.setRole("Software Developer");
        candidate.setEmail("tergel.e9@gmail.com");
        candidate.setPhone("+1 872 240 6609");
        candidate.setLinkedin("linkedin.com/in/tergel-enkhtur");
        candidate.setGithub("github.com/TergelEnkhtur");

        candidate.setLanguages("Java, JavaScript, Python");
        candidate.setFrameworks("Spring, Spring Boot, Express.js");
        candidate.setDatabases("PostgreSQL, Oracle, MS SQL Server");
        candidate.setEditors("IntelliJ IDEA, Emacs, VSCode, Eclipse");
        candidate.setOs("Windows, Linux (Ubuntu), MacOS");
        candidate.setCicd("GitHub Actions, CircleCI");

        candidateRepository.save(candidate);

        System.out.println("Number of candidate: " + candidateRepository.count());
        System.out.println("Languages: " + candidate.getLanguages());
    }
}
