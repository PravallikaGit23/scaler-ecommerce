package com.scaler.ecommerceapi.controller;

import com.scaler.ecommerceapi.model.User;
import com.scaler.ecommerceapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/ecommerce")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public void registerUser(@RequestBody User user){

        userService.registerUser(user);
    }
    @GetMapping("/user/{email}")
    public ResponseEntity<List<User>> getUser(@PathVariable String email){

        return ResponseEntity.status(HttpStatus.OK).body(userService.getUser(email));
    }

}
