package com.example.posts.repo;


import com.example.posts.domain.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepo extends CrudRepository<Post, Long> {

    List<Post> findAll();


    @Query(value = "Select * from Post where Post.Title = :title", nativeQuery = true)
    public List<Post> findPostByTitle(String title);

}
