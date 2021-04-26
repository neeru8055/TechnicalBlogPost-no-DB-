package com.dios.technicalblogpost.service;

import com.dios.technicalblogpost.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public boolean login(User user){
        if(user.getUsername().equals("admin") && user.getPassword().equals("root")) {
            return true;
        }
        else
        {
            return false;
        }
    }

}
