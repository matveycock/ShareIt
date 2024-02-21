package ru.matveycock.ShareIt.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.matveycock.ShareIt.model.Item;
import ru.matveycock.ShareIt.repository.item.InMemoryItemDAO;
import ru.matveycock.ShareIt.service.ItemService;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryItemServiceImpl implements ItemService {

    private final InMemoryItemDAO repository;

    @Override
    public List<Item> getAllItems() {
        return repository.getAllItems();
    }

    @Override
    public Item getItemByID(long id) {
        return repository.getItemByID(id);
    }

    @Override
    public Item updateItemByID(Item item) {
        return repository.updateItemByID(item);
    }

    @Override
    public Item addNewItem(Item item) {
        return repository.addNewItem(item);
    }

    @Override
    public void deleteItemByID(long id) {
        repository.deleteItemByID(id);
    }

}
