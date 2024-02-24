package ru.matveycock.ShareIt.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.matveycock.ShareIt.kafka.KafkaProducer;
import ru.matveycock.ShareIt.model.Item;
import ru.matveycock.ShareIt.service.ItemService;

@Controller
@RequestMapping("/items")
@AllArgsConstructor
public class ItemController {

    private ItemService service;

    private final KafkaProducer producer;

    @GetMapping
    public String getAllItems(Model model){
        model.addAttribute("items", service.getAllItems());
        producer.sendMessage("123");
        return "items/items";
    }

    @GetMapping("/{id}")
    public String getItemByID(@PathVariable long id, Model model){
        model.addAttribute("item", service.getItemByID(id));
        return "items/item";
    }

    @PutMapping("/{id}/update")
    public Item updateItemByID(@RequestBody Item item){
        return service.updateItemByID(item);
    }

    @PostMapping
    public Item addNewItem(@RequestBody Item item){
        return service.addNewItem(item);
    }

    @DeleteMapping("/{id}/delete")
    public void deleteItemByID(@PathVariable long id){
        service.deleteItemByID(id);
    }

}
