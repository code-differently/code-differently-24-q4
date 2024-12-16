package com.codedifferently.lesson28.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "library_users")
public class LibraryUserModel {
    @Id public String id;
    public String email;
    public String first_name;
    public String last_name;
    public String password;

    public LibraryUserModel() {
        this.id = UUID.randomUUID().toString();
    }
}
