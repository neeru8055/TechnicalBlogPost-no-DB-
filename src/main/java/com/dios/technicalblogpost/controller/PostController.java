package com.dios.technicalblogpost.controller;

import com.dios.technicalblogpost.model.Post;
import com.dios.technicalblogpost.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class PostController {
    // localhost:8080/posts : GET
    PostService postService = new PostService();
    @RequestMapping("/posts")
    public String getUserPost(Model model){
        ArrayList<Post> posts = postService.getAllPosts();
        model.addAttribute("posts",posts);
        return "posts";
    }
}
