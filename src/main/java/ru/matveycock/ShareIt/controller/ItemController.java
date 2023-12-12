package ru.matveycock.ShareIt.controller;

import org.springframework.web.bind.annotation.*;
import ru.matveycock.ShareIt.model.Item;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {


    @GetMapping
    public List<Item> getAllItems(){
        return null;
    }


    @GetMapping("/{id}")
    public Item getItemByID(@PathVariable long id){
        return null;
    }


    @PostMapping("{id}")
    public void updateItemByID(@PathVariable long id){

    }

    @PostMapping
    public void addNewItem(){

    }


}
