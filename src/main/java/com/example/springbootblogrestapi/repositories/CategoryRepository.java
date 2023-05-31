package com.example.springbootblogrestapi.repositories;

import com.example.springbootblogrestapi.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Category repository.
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
