package com.zekerijah.socialapi.service;

import com.zekerijah.socialapi.model.Post;
import com.zekerijah.socialapi.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public List<Post> getAllPosts(){
        List<Post> posts = new ArrayList<>();
        repository.findAll().forEach(posts::add);
        return posts;
    }

    public List<Post> getPostsByUser(Integer id){
        List<Post> posts = new ArrayList<>();
        repository.findByUserId(id).forEach(posts::add);
        return posts;
    }


    public Optional<Post> getPostById(Integer id){
        return repository.findById(id);
    }

    public void addPost(Post post){
        repository.save(post);
    }

    public void updatePost(Post post, Integer id){
        repository.save(post);
    }

    public void deletePost(Integer id){
        repository.deleteById(id);
    }

}
