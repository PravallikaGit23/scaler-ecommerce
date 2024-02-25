package com.scaler.ecommerceapi.dao;

import com.scaler.ecommerceapi.entity.UserEntity;
import com.scaler.ecommerceapi.model.User;

import java.util.List;

public interface UserDAO {
      //boolean findByEmail(String email);

     void registerUser(UserEntity userEntity);

     List<UserEntity> getUserByEmail(String userEntity);
}
