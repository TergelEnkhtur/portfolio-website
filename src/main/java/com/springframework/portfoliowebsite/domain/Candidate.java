package com.springframework.portfoliowebsite.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String role;
    private String email;
    private String phone;
    private String linkedin;
    private String github;

    private String languages;
    private String frameworks;
    private String databases;
    private String editors;
    private String os;
    private String cicd;
}
