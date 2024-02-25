package com.scaler.ecommerceapi.dao;

import com.scaler.ecommerceapi.entity.UserEntity;

public interface UserDAO {
      //boolean findByEmail(String email);

     void registerUser(UserEntity userEntity);
}
