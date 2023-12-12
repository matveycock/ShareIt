package ru.matveycock.ShareIt.controller;

import org.springframework.web.bind.annotation.*;
import ru.matveycock.ShareIt.model.User;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public User getUserById(@PathVariable long id){
        return null;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return null;
    }

    @PostMapping
    public void addNewUser(){

    }

    @PostMapping("/{id}")
    public void updateUserByID(@PathVariable long id){

    }


}
