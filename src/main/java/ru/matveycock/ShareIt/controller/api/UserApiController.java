package ru.matveycock.ShareIt.controller.api;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.matveycock.ShareIt.model.Item;
import ru.matveycock.ShareIt.model.User;
import ru.matveycock.ShareIt.service.UserService;

import java.util.List;


@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserApiController {

    private UserService service;

    @GetMapping("/{id}")
    public User findUserByID(@PathVariable Long id){
        return service.findUserByID(id);
    }

    @GetMapping
    public List<User> findAllUsers(){
        return service.findAllUsers();
    }

    @PostMapping
    public User saveNewUser(@RequestBody User user) {
        return service.saveNewUser(user);
    }

    @PutMapping("/{id}/update")
    public String updateUserByEmail(@RequestBody User user){
        service.updateUserByEmail(user);
        return "User updated";
    }

    @DeleteMapping("/{id}/delete")
    public String deleteUserByID(@PathVariable Long id){
        service.deleteUserByID(id);
        return "User deleted";
    }

    @PutMapping("/{id}/add-item")
    public String addNewItem(@PathVariable Long id,@RequestBody Item item){
        service.addNewItem(id, item);
        return "success add new item";
    }

}
