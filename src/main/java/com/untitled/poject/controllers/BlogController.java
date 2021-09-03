package com.untitled.poject.controllers;

import com.untitled.poject.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.untitled.poject.repo.PostRepository;

@Controller
public class BlogController {

    @Autowired
    private PostRepository PostRepository;


    @GetMapping("/blog-main")
    public String blogMain(Model model){
        Iterable<Post> posts = PostRepository.findAll();
        model.addAttribute("posts",posts);
        return "blog-main";

    }
}
