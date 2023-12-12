package ru.matveycock.ShareIt.controller;

import org.springframework.web.bind.annotation.*;
import ru.matveycock.ShareIt.model.Item;

import java.util.List;

@RestController
public class ItemController {


    @GetMapping("/item")
    public List<Item> getAllItems(){
        return null;
    }


    @GetMapping("/item/{id}")
    public Item getItemByID(@PathVariable long id){
        return null;
    }


    @PostMapping("/item/{id}")
    public void updateItemByID(@PathVariable long id){

    }

    @PostMapping("/item")
    public void addNewItem(){

    }


}
