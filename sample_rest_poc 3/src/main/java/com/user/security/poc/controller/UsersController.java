package com.user.security.poc.controller;

import com.user.security.poc.dto.UserTo;
import com.user.security.poc.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserTo createUser(@RequestBody UserTo userTo){

        return userService.createUser(userTo);
    }

    @GetMapping(value = "/{userId}", produces =  MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public UserTo getUserById(@PathVariable(name = "userId") Long useId){

        return userService.getUserById(useId);
    }


    @GetMapping(produces =  MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<UserTo> getAllUsers(){
        return userService.getAllUsers();
    }
}
