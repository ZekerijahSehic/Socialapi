package com.zekerijah.socialapi.service;

import com.zekerijah.socialapi.model.User;
import com.zekerijah.socialapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> getAllUsers() {

        List<User> users = new ArrayList<>();
        repository.findAll().forEach(users::add);
        return users;
    }

    public List<User> getUserByLocation(Integer id) {
        List<User> users = new ArrayList<>();
        repository.findByLocationId(id).forEach(users::add);
        return users;
    }

    public List<User> getUserByName(String name){
        List<User> users = new ArrayList<>();
        repository.findByName(name).forEach(users::add);
        return users;
    }

    public void addUser(User user){
        repository.save(user);
    }

    public Optional<User> findUserById(Integer id) {
        return repository.findById(id);
    }

    public void updateUser(User user, Integer id) {
        repository.save(user);
    }

    public void deleteUser(Integer id){
        repository.deleteById(id);
    }

}
