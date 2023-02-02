package com.springframework.portfoliowebsite.repositories;

import com.springframework.portfoliowebsite.domain.AboutMe;
import org.springframework.data.repository.CrudRepository;

public interface AboutMeRepository extends CrudRepository<AboutMe, Long> {
}
