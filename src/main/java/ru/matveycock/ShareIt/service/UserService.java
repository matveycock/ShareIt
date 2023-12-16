package ru.matveycock.ShareIt.service;

import org.springframework.stereotype.Service;
import ru.matveycock.ShareIt.model.User;

import java.util.EnumMap;
import java.util.List;


public interface UserService {

    User findUserByID(long id);

    List<User> findAllUsers();

    User saveNewUser(User user);

    User updateUserByEmail(User user);

    void deleteUserByID(long id);
}
