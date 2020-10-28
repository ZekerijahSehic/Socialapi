package com.zekerijah.socialapi.repository;

import com.zekerijah.socialapi.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {
    public List<Post> findByUserId (Integer userId);
}
