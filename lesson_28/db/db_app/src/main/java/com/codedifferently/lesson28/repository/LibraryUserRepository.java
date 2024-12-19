package com.codedifferently.lesson28.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codedifferently.lesson28.models.LibraryUserModel;

public interface LibraryUserRepository extends CrudRepository<LibraryUserModel, String>{
  @Override
  List<LibraryUserModel> findAll();
}
