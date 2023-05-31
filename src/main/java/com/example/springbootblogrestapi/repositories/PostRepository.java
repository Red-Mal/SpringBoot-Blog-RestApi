package com.example.springbootblogrestapi.repositories;

import com.example.springbootblogrestapi.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * The interface Post repository.
 */
public interface PostRepository extends JpaRepository<Post, Long> {
    /**
     * Find by category id list.
     *
     * @param categoryId the category id
     * @return the list
     */
    List<Post> findByCategoryId(Long categoryId);



}
