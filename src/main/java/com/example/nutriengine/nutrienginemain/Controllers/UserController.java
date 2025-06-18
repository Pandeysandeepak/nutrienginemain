package com.example.nutriengine.nutrienginemain.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nutriengine.nutrienginemain.Entity.User;
import com.example.nutriengine.nutrienginemain.Services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService ;

   @PostMapping
    public User addUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    public void editUser(){

    }

    public void deleteUser(){

    }

    public void findUserByUsername(){

    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

}
