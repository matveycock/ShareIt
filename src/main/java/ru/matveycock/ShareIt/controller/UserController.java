package ru.matveycock.ShareIt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.matveycock.ShareIt.model.User;

import java.util.List;

@RestController("/users")
public class UserController {

    @GetMapping("/{id}")
    public User getUserById(long id){
        return null;
    }

    @GetMapping()
    public List<User> getAllUsers(){
        return null;
    }

    @PostMapping("")
    public void addNewUser(){

    }

    @PatchMapping("/{id")
    public void updateUser(long id){

    }

}
