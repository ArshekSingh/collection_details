package com.example.collection_details.repository;

import com.example.collection_details.entity.CollectionDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface CollectionDetailsRepo extends JpaRepository<CollectionDetail, Integer> {

    @Query(value = "select * from collection_detail where status =:status", nativeQuery = true)
    Optional<List<CollectionDetail>> fetchCollections(String status);
}
