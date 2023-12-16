package ru.matveycock.ShareIt.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.matveycock.ShareIt.model.User;
import ru.matveycock.ShareIt.repository.InMemoryUserDAO;
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
    public User updateUserByEmail(User user) {
        return repository.updateUserByEmail(user);
    }

    @Override
    public void deleteUserByID(long id) {
        repository.deleteUserByID(id);
    }
}
