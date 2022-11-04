package com.example.posts.controller;


import com.example.posts.domain.Comment;
import com.example.posts.domain.User;
import com.example.posts.repo.CommentRepo;
import com.example.posts.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/comment")
@RequiredArgsConstructor
public class CommentController {

    @Autowired
    CommentService commentService;


    @GetMapping
    public List<Comment> findAll(){
       return commentService.findAll();
    }
}