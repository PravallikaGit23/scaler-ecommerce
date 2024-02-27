package com.scaler.ecommerceapi.dao;

import com.scaler.ecommerceapi.entity.UserEntity;

import java.util.List;

public interface UserDAO {
      //boolean findByEmail(String email);

     void registerUser(UserEntity userEntity);

     List<UserEntity> getUserByEmail(String userEntity);

      List<UserEntity> getUserByEmailAndPassword(String email, String password);
}
