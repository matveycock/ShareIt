package ru.matveycock.ShareIt.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.matveycock.ShareIt.model.Item;
import ru.matveycock.ShareIt.repository.item.ItemRepository;
import ru.matveycock.ShareIt.service.ItemService;

import java.util.List;

@Service
@Primary
@AllArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository repository;
    @Override
    public List<Item> getAllItems() {
        return repository.findAll();
    }

    @Override
    public Item getItemByID(long id) {
        return repository.findById(id);
    }

    @Override
    public Item updateItemByID(Item item) {
        return repository.save(item);
    }

    @Override
    public Item addNewItem(Item item) {
        return repository.save(item);
    }

    @Override
    public void deleteItemByID(long id) {
        repository.deleteById(id);
    }
}
