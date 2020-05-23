package com.shrikant.k.mutyala.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shrikant.k.mutyala.account.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
    List<User> findByEmail(String email);
}
