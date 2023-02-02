package com.springframework.portfoliowebsite.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class AboutMe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String languages;
    private String frameworks;
    private String databases;
    private String editors;
    private String os;
    private String cicd;
}
