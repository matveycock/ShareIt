package ru.matveycock.ShareIt.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.matveycock.ShareIt.model.Item;
import ru.matveycock.ShareIt.model.User;
import ru.matveycock.ShareIt.repository.user.UserRepository;
import ru.matveycock.ShareIt.service.UserService;

import java.util.List;
import java.util.Optional;

@Service
@Primary
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    @Override
    public User findUserByID(long id) {
        return repository.findById(id);
    }

    @Override
    public List<User> findAllUsers() {
        return repository.findAll();
    }

    @Override
    public User saveNewUser(User user) {
        return repository.save(user);
    }

    @Override
    public void updateUserByEmail(User user) {
        repository.save(user);
    }

    @Override
    public void deleteUserByID(long id) {
        repository.deleteById(id);
    }

    @Override
    public void addNewItem(Long id, Item item) {
        User user;
        user = repository.findById(id).get();
        user.addItem(item);
        item.setOwnerId(id);
        repository.save(user);
    }
}
