package com.assessment2.springboot.assessment2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assessment2.springboot.assessment2.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
