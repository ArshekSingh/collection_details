package com.example.collection_details;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableJpaRepositories("com.example.collection_details")
@EnableScheduling
@SpringBootApplication
public class CollectionDetailsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CollectionDetailsApplication.class, args);
    }

}
