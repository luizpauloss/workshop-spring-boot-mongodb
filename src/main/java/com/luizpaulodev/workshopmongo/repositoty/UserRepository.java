package com.luizpaulodev.workshopmongo.repositoty;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.luizpaulodev.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
