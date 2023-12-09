package ru.matveycock.ShareIt.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private long id;
    private String username;
    private String email;
    private String name;
    private String surname;
}
