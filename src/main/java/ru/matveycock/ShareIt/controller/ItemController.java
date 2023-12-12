package ru.matveycock.ShareIt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.matveycock.ShareIt.model.Item;

import java.util.List;

@RestController("/item")
public class ItemController {


    @GetMapping
    public List<Item> getAllItems(){
        return null;
    }


    @GetMapping("/{id}")
    public Item getItembyID( long id){
        return null;
    }

    @PostMapping
    public void addNewItem(){

    }

    @PostMapping("/{id}")
    public void updateItemByID(){

    }


}
