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
        candidate.setPhone("(872) 240-6609");
        candidate.setLinkedin("linkedin.com/in/tergel-enkhtur");
        candidate.setGithub("github.com/TergelEnkhtur");
        candidate.setPitch("Dean’s List Earner for five quarters in Computer Science with experience in Java, SQL and Spring Framework who is excited to apply related coursework and knowledge at your company.");

        candidate.setProgramming("Java, JavaScript, Python, JPA, C, NodeJS, REST API");
        candidate.setFrameworks("Spring Framework, Spring Boot, Express.js");
        candidate.setDatabases("SQL, PostgreSQL, Oracle, PL/SQL, MS SQL Server, T-SQL");
        candidate.setCicd("CircleCI, GitHub Actions, Maven, Gradle, Docker");
        candidate.setFrontend("HTML, CSS, jQuery, Spring MVC, Thymeleaf, Bootstrap");
        candidate.setOs("Windows, Linux (Ubuntu), MacOS");

        candidate.setProject1desc("My Portfolio Website built with Spring Boot 2.7.2 / Spring Framework 5.");
        candidate.setProject1tech("Java, Spring, Spring Boot, Thymeleaf, HTML, CSS, Spring Web, Spring Data JPA, H2 Database");
        candidate.setProject2desc("Simulated a library bookkeeping app that a librarian would use to Create, Read, Update, and Delete books to a PostgreSQL database which patrons could rent from. The app has a log-in page to distinguish librarians from patrons.");
        candidate.setProject2tech("JavaScript, Express, NodeJS, PostgreSQL, Pug, HTML, CSS");

        candidate.setSkill1("Effective communication");
        candidate.setSkill2("Team player");
        candidate.setSkill3("Strong problem solver");
        candidate.setSkill4("Attention to Detail");
        candidate.setSkill5("Good time management");

        candidate.setMajor("BS Computer Science");
        candidate.setMinor("Data Science");
        candidate.setConcentration("Software Development");
        candidate.setSchoolName("DePaul University");
        candidate.setSchoolLoc("Chicago, IL");
        candidate.setSchoolYears("Sep 2020 - Mar 2023");

        candidateRepository.save(candidate);

        System.out.println("Number of candidate: " + candidateRepository.count());
        System.out.println("Languages: " + candidate.getProgramming());
    }
}
