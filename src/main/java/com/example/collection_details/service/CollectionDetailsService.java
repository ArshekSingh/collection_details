package com.example.collection_details.service;

import com.example.collection_details.entity.CollectionDetail;

import java.util.List;
import java.util.Optional;

public interface CollectionDetailsService {
    Optional<List<CollectionDetail>> fetchCollections();


}
