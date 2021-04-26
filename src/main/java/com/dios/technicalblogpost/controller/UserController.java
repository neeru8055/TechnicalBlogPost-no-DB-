package com.dios.technicalblogpost.controller;

import com.dios.technicalblogpost.model.User;
import com.dios.technicalblogpost.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    // URL : users/login
    private UserService userService = new UserService();
    @RequestMapping("users/login")   //localhost:8080/users/login : GET
    public String login(Model model){
        model.addAttribute("user",new User());
        return "users/login";
    }
    @RequestMapping(value = "users/login", method = RequestMethod.POST) //localhost:8080/users/login : POST
    public String loginuser(User user){
        System.out.println("helllllooooooooooooooooooooooooooooooooooooo");
        if(userService.login(user)){
            return "redirect:/posts";  //localhost:8080/posts :GET
        }
        else{
            return "users/login";  //localhost:8080/users/login : GET
        }

    }
    @RequestMapping("users/registration")
     public String registration(){
        return "users/registration";
     }
     @RequestMapping(value = "users/registration" , method = RequestMethod.POST)
     public String registeruser(User user){
        //TODO :  service code to register User so we can login with that credentials.
         return "users/login";
     }
}
