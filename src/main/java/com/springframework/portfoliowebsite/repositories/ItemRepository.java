package com.springframework.portfoliowebsite.repositories;

import com.springframework.portfoliowebsite.domain.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
