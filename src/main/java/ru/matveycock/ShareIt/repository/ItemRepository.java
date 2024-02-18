package ru.matveycock.ShareIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.matveycock.ShareIt.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Item findById(long id);
}
