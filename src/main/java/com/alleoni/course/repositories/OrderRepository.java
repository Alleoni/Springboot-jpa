package com.alleoni.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alleoni.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
