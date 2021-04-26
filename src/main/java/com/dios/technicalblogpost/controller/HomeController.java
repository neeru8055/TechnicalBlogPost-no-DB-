package com.dios.technicalblogpost.controller;

import com.dios.technicalblogpost.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.AttributedString;
import java.util.ArrayList;
import java.util.Date;
@Controller
public class HomeController {
   @RequestMapping("/getallposts")
    public String getAllPosts(Model model){
        ArrayList<Post> posts = new ArrayList<Post>();

        Post post1 = new Post();
        post1.setTitle("Post 1");
        post1.setBody("Body of Post 1  named Mirzapur \" Munna Bhaiya ki Sarkar \"");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Post 2");
        post2.setBody("Body of Post 2  named GangsOfWassepur  \" Faizal ka Badla \" ");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Post 3");
        post3.setBody("Body of Post 3  named Lucy  \" Use upto 100% of Mind\"");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

 /*     model.addAttribute("name",values);       */
        model.addAttribute("posts",posts);
        return "index";
    }
}
