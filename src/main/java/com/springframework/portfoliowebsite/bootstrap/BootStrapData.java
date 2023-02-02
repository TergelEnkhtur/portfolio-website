package com.springframework.portfoliowebsite.bootstrap;

import com.springframework.portfoliowebsite.domain.AboutMe;
import com.springframework.portfoliowebsite.repositories.AboutMeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AboutMeRepository aboutMeRepository;

    public BootStrapData(AboutMeRepository aboutMeRepository) {
        this.aboutMeRepository = aboutMeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in Bootstrap");

        AboutMe aboutMe = new AboutMe();
        aboutMe.setLanguages("Java, JavaScript, Python");
        aboutMe.setFrameworks("Spring, Spring Boot, Express.js");
        aboutMe.setDatabases("PostgreSQL, Oracle, MS SQL Server");
        aboutMe.setEditors("IntelliJ IDEA, Emacs, VSCode, Eclipse");
        aboutMe.setOs("Windows, Linux (Ubuntu), MacOS");
        aboutMe.setCicd("GitHub Actions, CircleCI");

        aboutMeRepository.save(aboutMe);

        System.out.println("Number of aboutMe: " + aboutMeRepository.count());
        System.out.println("Languages: " + aboutMe.getLanguages());
    }
}
