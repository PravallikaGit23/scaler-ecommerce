package com.scaler.ecommerceapi.service;

import com.scaler.ecommerceapi.model.User;
import jakarta.persistence.Column;
import org.springframework.stereotype.Component;


public interface UserService {
    public void registerUser(User user);

}
