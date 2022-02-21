package com.arthmate.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthmate.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
