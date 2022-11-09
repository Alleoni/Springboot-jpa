package com.alleoni.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alleoni.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
