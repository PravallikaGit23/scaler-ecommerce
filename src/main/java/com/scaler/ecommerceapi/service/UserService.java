package com.scaler.ecommerceapi.service;

import com.scaler.ecommerceapi.entity.UserEntity;
import com.scaler.ecommerceapi.model.User;

import java.util.List;


public interface UserService {
    public void registerUser(User user);

    List<User> getUserByEmailAddress(String email);
}
