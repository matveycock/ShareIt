package ru.matveycock.ShareIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.matveycock.ShareIt.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findById(long id);
}
