package com.scaler.ecommerceapi.service.impl;

import com.scaler.ecommerceapi.dao.UserDAO;
import com.scaler.ecommerceapi.entity.UserEntity;
import com.scaler.ecommerceapi.model.User;
import com.scaler.ecommerceapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO;
    @Override
    public void registerUser(User user) {
        UserEntity userEntity = getUserEntity(user);
          userDAO.registerUser(userEntity);

    }

    private UserEntity getUserEntity(User user) {
       UserEntity userEntity = new UserEntity();
        userEntity.setUserName(user.getUserName());
        userEntity.setEmail(user.getEmail());
        userEntity.setPassword(user.getPassword());
        userEntity.setPhoneNumber(user.getPhoneNumber());
        userEntity.setCreatedTime(new Date());
        userEntity.setUpdatedTime(new Date());

       return userEntity;
    }
}
