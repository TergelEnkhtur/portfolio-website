package com.springframework.portfoliowebsite.bootstrap;

import com.springframework.portfoliowebsite.domain.Item;
import com.springframework.portfoliowebsite.repositories.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final ItemRepository itemRepository;

    public BootStrapData(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in Bootstrap");

        Item java = new Item();
        java.setName("Java");

        itemRepository.save(java);

        System.out.println("Number of Items: " + itemRepository.count());
        System.out.println("Name of Item: " + java.getName());
    }
}
