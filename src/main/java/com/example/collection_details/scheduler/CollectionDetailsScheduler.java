package com.example.collection_details.scheduler;

import com.example.collection_details.service.CollectionDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class CollectionDetailsScheduler {

    @Autowired
    CollectionDetailsService collectionDetailsService;

    @Scheduled(fixedRate = 10000)
    public void collectionSettled(){
        collectionDetailsService.fetchCollections();
    }

}
