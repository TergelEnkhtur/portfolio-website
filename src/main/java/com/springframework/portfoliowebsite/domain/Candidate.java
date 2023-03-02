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
    private String pitch;

    private String programming;
    private String frameworks;
    private String databases;
    private String frontend;
    private String os;
    private String cicd;

    private String project1desc;
    private String project1tech;
    private String project2desc;
    private String project2tech;

    private String skill1;
    private String skill2;
    private String skill3;
    private String skill4;
    private String skill5;

    private String major;
    private String minor;
    private String concentration;
    private String SchoolName;
    private String SchoolLoc;
    private String SchoolYears;
}
