package ru.matveycock.ShareIt.controller.api;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.matveycock.ShareIt.model.Item;
import ru.matveycock.ShareIt.service.ItemService;

import java.util.List;

@RestController
@RequestMapping("/api/items")
@AllArgsConstructor
public class ItemApiController {

    private ItemService service;

    @GetMapping
    public List<Item> getAllItems(){
        return service.getAllItems();
    }

    @GetMapping("/{id}")
    public Item getItemByID(@PathVariable long id){
        return service.getItemByID(id);
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
