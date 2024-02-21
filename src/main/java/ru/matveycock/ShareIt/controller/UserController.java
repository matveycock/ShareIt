package ru.matveycock.ShareIt.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.matveycock.ShareIt.model.User;
import ru.matveycock.ShareIt.service.UserService;

import java.util.List;


@Controller
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private UserService service;

    @GetMapping("/{id}")
    public String findUserByID(@PathVariable long id, Model model){
        model.addAttribute("user", service.findUserByID(id));
        return "users/user";
    }

    @GetMapping
    public String findAllUsers(Model model){
        model.addAttribute("users", service.findAllUsers());
        return "users/users";
    }

    @PostMapping
    public User saveNewUser(@RequestBody User user) {
        return service.saveNewUser(user);
    }

    @PutMapping("/{id}/update")
    public User updateUserByEmail(@RequestBody User user){
        return service.updateUserByEmail(user);
    }

    @DeleteMapping("/{id}/delete")
    public void deleteUserByID(@PathVariable long id){
        service.deleteUserByID(id);
    }


}
