package com.example.shop3.repo;


import com.example.shop3.Items;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface ItemRepository extends JpaRepository<Items, Long> {
    List<Items> findByCategories(int category, Sort sort);
}

