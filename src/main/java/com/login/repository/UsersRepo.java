package com.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.entity.Users;



@Repository
public interface UsersRepo extends JpaRepository<Users, String> {
  
}
