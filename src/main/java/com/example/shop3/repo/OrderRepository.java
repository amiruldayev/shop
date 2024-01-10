package com.example.shop3.repo;

import com.example.shop3.Orders;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface OrderRepository extends JpaRepository<Orders, Long> {
}
