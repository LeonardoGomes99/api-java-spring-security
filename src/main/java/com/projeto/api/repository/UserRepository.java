package com.projeto.api.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.projeto.api.model.User;

public interface UserRepository extends CrudRepository<User, UUID> {
    Optional<User> findByUsername(String username);
  }