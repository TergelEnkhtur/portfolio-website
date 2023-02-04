package com.springframework.portfoliowebsite.repositories;

import com.springframework.portfoliowebsite.domain.Candidate;
import org.springframework.data.repository.CrudRepository;

public interface CandidateRepository extends CrudRepository<Candidate, Long> {
}
