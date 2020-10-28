package com.zekerijah.socialapi.controller;

import com.zekerijah.socialapi.model.Post;
import com.zekerijah.socialapi.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PostController {

    @Autowired
    private PostService service;

    @RequestMapping(value = "/posts")
    public List<Post> getAllPosts(){
        return service.getAllPosts();
    }

    @RequestMapping(value = "/post/{id}")
    public Optional<Post> getPostById(@PathVariable Integer id){
        return service.getPostById(id);
    }

    @RequestMapping(value = "/posts", method = RequestMethod.POST)
    public void addNewPost(@RequestBody Post post){
        service.addPost(post);
    }

    @RequestMapping(value = "/post/{id}/edit", method = RequestMethod.PUT)
    public void updatePost(@PathVariable Integer id, @RequestBody Post post){
        service.updatePost(post, id);
    }

    @RequestMapping(value = "/post/{id}/delete", method = RequestMethod.DELETE)
    public void deletePost(@PathVariable Integer id){
        service.deletePost(id);
    }


}
