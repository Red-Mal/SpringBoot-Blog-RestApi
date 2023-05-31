package com.example.springbootblogrestapi.controllers;


import com.example.springbootblogrestapi.payload.PostDto;
import com.example.springbootblogrestapi.payload.PostResponse;
import com.example.springbootblogrestapi.services.PostService;
import com.example.springbootblogrestapi.utils.AppConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

/**
 * The type Post controller.
 */
@RestController
@RequestMapping()
public class PostController {

    private final PostService postService;

    /**
     * Instantiates a new Post controller.
     *
     * @param postService the post service
     */
    public PostController(PostService postService) {
        this.postService = postService;
    }


    /**
     * Create post response entity.
     *
     * @param postDto the post dto
     * @return the response entity
     */
    @PostMapping("/api/v1/posts")
    public ResponseEntity<PostDto> createPost(@Valid @RequestBody PostDto postDto){
        return new ResponseEntity<>(postService.createPost(postDto), HttpStatus.CREATED);
    }


    /**
     * Gets all posts.
     *
     * @param pageNo   the page no
     * @param pageSize the page size
     * @param sortBy   the sort by
     * @param sortDir  the sort dir
     * @return the all posts
     */
    @GetMapping("/api/v1/posts")
    public PostResponse getAllPosts(
            @RequestParam(value = "pageNo", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER, required = false) int pageNo,
            @RequestParam(value = "pageSize", defaultValue = AppConstants.DEFAULT_PAGE_SIZE, required = false) int pageSize,
            @RequestParam(value = "sortBy", defaultValue = AppConstants.DEFAULT_SORT_BY, required = false) String sortBy,
            @RequestParam(value = "sortDir", defaultValue = AppConstants.DEFAULT_SORT_DIRECTION, required = false) String sortDir
    ){
        return postService.getAllPosts(pageNo, pageSize, sortBy, sortDir);
    }


    /**
     * Gets post by id.
     *
     * @param id the id
     * @return the post by id
     */
    @GetMapping(value = "/api/v1/posts/{id}")
    public ResponseEntity<PostDto> getPostById(@PathVariable(name = "id") long id){
        return ResponseEntity.ok(postService.getPostById(id));
    }


    /**
     * Update post response entity.
     *
     * @param postDto the post dto
     * @param id      the id
     * @return the response entity
     */
    @PutMapping("/api/v1/posts/{id}")
    public ResponseEntity<PostDto> updatePost(@Valid @RequestBody PostDto postDto, @PathVariable(name = "id") long id){

        PostDto postResponse = postService.updatePost(postDto, id);

        return new ResponseEntity<>(postResponse, HttpStatus.OK);
    }


    /**
     * Delete post response entity.
     *
     * @param id the id
     * @return the response entity
     */
    @DeleteMapping("/api/v1/posts/{id}")
    public ResponseEntity<String> deletePost(@PathVariable(name = "id") long id){

        postService.deletePostById(id);

        return new ResponseEntity<>("Post entity deleted successfully.", HttpStatus.OK);
    }


    /**
     * Gets posts by category.
     *
     * @param categoryId the category id
     * @return the posts by category
     */
    @GetMapping("/api/v1/posts/category/{id}")
    public ResponseEntity<List<PostDto>> getPostsByCategory(@PathVariable("id") Long categoryId){
        List<PostDto> postDtos = postService.getPostsByCategory(categoryId);
        return ResponseEntity.ok(postDtos);
    }
}
