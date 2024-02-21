package ru.matveycock.ShareIt.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.matveycock.ShareIt.model.Item;
import ru.matveycock.ShareIt.model.User;
import ru.matveycock.ShareIt.repository.user.InMemoryUserDAO;
import ru.matveycock.ShareIt.service.UserService;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryUserServiceImpl implements UserService {

    private final InMemoryUserDAO repository;

    @Override
    public User findUserByID(long id) {
        return repository.findUserByID(id);
    }

    @Override
    public List<User> findAllUsers() {
         return repository.findAllUsers();
    }

    @Override
    public User saveNewUser(User user) {
        return repository.saveNewUser(user);
    }

    @Override
    public void updateUserByEmail(User user) {
        repository.updateUserByEmail(user);
    }

    @Override
    public void deleteUserByID(long id) {
        repository.deleteUserByID(id);
    }

    @Override
    public void addNewItem(Long id, Item item) {
        // TODO Auto-generated method stub
    }
}
