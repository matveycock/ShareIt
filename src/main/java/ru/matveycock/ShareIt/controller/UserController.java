package ru.matveycock.ShareIt.controller;

import org.springframework.web.bind.annotation.*;
import ru.matveycock.ShareIt.model.User;

import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable long id){
        return null;
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return null;
    }

    @PostMapping("/users")
    public void addNewUser(){

    }

    @PostMapping("/users/{id}")
    public void updateUserByID(@PathVariable long id){

    }


}
