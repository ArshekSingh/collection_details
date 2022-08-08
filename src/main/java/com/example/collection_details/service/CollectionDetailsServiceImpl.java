package com.example.collection_details.service;

import com.example.collection_details.entity.CollectionDetail;
import com.example.collection_details.repository.CollectionDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CollectionDetailsServiceImpl implements CollectionDetailsService{

    @Autowired
    CollectionDetailsRepo collectionDetailsRepo;

    public Optional<List<CollectionDetail>> fetchCollections(){
        Optional<List<CollectionDetail>> collectionDetail= collectionDetailsRepo.fetchCollections("C");
        System.out.println(collectionDetail);
        return collectionDetail;
    }
}
