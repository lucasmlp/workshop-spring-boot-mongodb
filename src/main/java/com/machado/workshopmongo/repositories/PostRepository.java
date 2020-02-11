package com.machado.workshopmongo.repositories;


import com.machado.workshopmongo.domain.Post;
import com.machado.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
