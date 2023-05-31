package com.example.springbootblogrestapi.repositories;

import com.example.springbootblogrestapi.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * The interface Comment repository.
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {
    /**
     * Find by post id list.
     *
     * @param postId the post id
     * @return the list
     */
    List<Comment> findByPostId(long postId);
}