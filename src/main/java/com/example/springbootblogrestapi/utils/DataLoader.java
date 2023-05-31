package com.example.springbootblogrestapi.utils;

import com.example.springbootblogrestapi.entities.Category;
import com.example.springbootblogrestapi.entities.Comment;
import com.example.springbootblogrestapi.entities.Post;
import com.example.springbootblogrestapi.repositories.CategoryRepository;
import com.example.springbootblogrestapi.repositories.CommentRepository;
import com.example.springbootblogrestapi.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final PostRepository postRepository;
    private final CategoryRepository categoryRepository;
    private final CommentRepository commentRepository;

    @Override
    public void run(String... args) throws Exception {

       // Category category=new Category();
        Category category1=Category.builder()
                .name("JAVA")
                .description("Java Tuto")
                .build();
        Category category2=Category.builder()
                .name("Spring Boot")
                .description("Spring boot Tuto")
                .build();
        Category category3=Category.builder()
                .name("DevOps")
                .description("DevOps Tuto")
                .build();

        categoryRepository.saveAll(List.of(category1,category2,category3));

       Post post1= Post.builder()
                .title("Post Title 1")
                .content("Post Content 1")
                .description("description 1")
                .category(category1)
                .build();
        Post post2= Post.builder()
                .title("Post Title 2")
                .content("Post Content 2")
                .description("description 2")
                .category(category2)
                .build();
        Post post3= Post.builder()
                .title("Post Title 3")
                .content("Post Content 3")
                .description("description 3")
                .category(category3)
                .build();

        postRepository.saveAll(List.of(post1,post2,post3));

        Comment comment1=Comment.builder()
                .name("red")
                .email("red@gmail.com")
                .body("Comment 1")
                .post(post1)
                .build();

        commentRepository.save(comment1);

    }
}