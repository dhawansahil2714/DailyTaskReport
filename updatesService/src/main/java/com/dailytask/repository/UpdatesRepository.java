package com.dailytask.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dailytask.entity.Updates;

@Repository
public interface UpdatesRepository extends MongoRepository<Updates, Integer> {

}
