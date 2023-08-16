package com.codippa.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codippa.Entity.Post;

@Repository
public interface PostRepo extends CrudRepository<Post, Integer> {
    
	
}
