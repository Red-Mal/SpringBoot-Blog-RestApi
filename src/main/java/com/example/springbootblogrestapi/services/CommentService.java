package com.example.springbootblogrestapi.services;

import com.example.springbootblogrestapi.payload.CommentDto;

import java.util.List;

/**
 * The interface Comment service.
 */
public interface CommentService {
    /**
     * Create comment comment dto.
     *
     * @param postId     the post id
     * @param commentDto the comment dto
     * @return the comment dto
     */
    CommentDto createComment(long postId, CommentDto commentDto);

    /**
     * Gets comments by post id.
     *
     * @param postId the post id
     * @return the comments by post id
     */
    List<CommentDto> getCommentsByPostId(long postId);

    /**
     * Gets comment by id.
     *
     * @param postId    the post id
     * @param commentId the comment id
     * @return the comment by id
     */
    CommentDto getCommentById(Long postId, Long commentId);

    /**
     * Update comment comment dto.
     *
     * @param postId         the post id
     * @param commentId      the comment id
     * @param commentRequest the comment request
     * @return the comment dto
     */
    CommentDto updateComment(Long postId, long commentId, CommentDto commentRequest);

    /**
     * Delete comment.
     *
     * @param postId    the post id
     * @param commentId the comment id
     */
    void deleteComment(Long postId, Long commentId);
}
