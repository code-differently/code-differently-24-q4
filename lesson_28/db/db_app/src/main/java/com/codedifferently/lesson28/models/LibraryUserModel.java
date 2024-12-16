package com.codedifferently.lesson28.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "library_users")
public class LibraryUserModel {
    public String first_name;
    public String last_name;
    @Id public String email;
}
