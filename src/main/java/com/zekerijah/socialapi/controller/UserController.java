package com.zekerijah.socialapi.controller;

import com.zekerijah.socialapi.model.User;
import com.zekerijah.socialapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@Controller
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/users")
    public String getAllUsers(Model model){
        //return service.getAllUsers();
        List<User> listUsers = service.getAllUsers();
        model.addAttribute("usersList", listUsers);
        return "users";
    }

    @RequestMapping(value = "/user/{id}")
    public java.util.Optional<User> getUserById(@PathVariable Integer id){
        return service.findUserById(id);
    }

    @RequestMapping(value = "/users", method=RequestMethod.POST)
    public void addUser (@RequestBody User user){
        service.addUser(user);
    }

    @RequestMapping(value = "/user/{id}/update", method = RequestMethod.PUT)
    public void updateUser(@RequestBody User user, @PathVariable Integer id){
        service.updateUser(user, id);
    }

    @RequestMapping(value = "/user/{id}/delete", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Integer id) {
        service.deleteUser(id);
    }

    @RequestMapping(value = "/users/location/{id}")
    public List<User> getUserByLocation(@PathVariable Integer id){
        return service.getUserByLocation(id);
    }

    @RequestMapping(value = "/users/name/{name}")
    public List<User> getUserByName(@PathVariable String name) {
        return service.getUserByName(name);
    }
}
