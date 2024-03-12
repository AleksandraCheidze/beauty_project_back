package com.example.end.repository;


import com.example.end.models.User;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

  List<User> findByRoles_Name(String roleName);
  Optional<User> findByEmail(String email);
  boolean existsByFirstName(String firstname);
  boolean existsByEmail(String email);

  User findByFirstName(String firstName);

  int countByActiveTrue();
}


