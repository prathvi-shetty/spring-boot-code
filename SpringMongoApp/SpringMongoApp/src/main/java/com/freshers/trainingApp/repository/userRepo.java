package com.freshers.trainingApp.repository;

import com.freshers.trainingApp.model.users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends MongoRepository<users, String> {

}
