package com.scaler.ecommerceapi.dao.impl;

import com.scaler.ecommerceapi.dao.UserDAO;
import com.scaler.ecommerceapi.entity.UserEntity;
import com.scaler.ecommerceapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    UserRepository userRepository;
    @Override
    public void registerUser(UserEntity userEntity) {

        if(userRepository.findByEmail(userEntity.getEmail()).isEmpty()){
            userRepository.save(userEntity);
        }else {
            System.out.println("User with email address " + userEntity.getEmail() + " is already exist");
        }
    }

    @Override
    public List<UserEntity> getUserByEmail(String email) {
      List<UserEntity> userEntityList = userRepository.findByEmail(email);
     if(userEntityList.isEmpty()){
         System.out.println("no records found");
     }
    return userEntityList;
    }

    public List<UserEntity> getUserByEmailAndPassword(String email, String password){

        return userRepository.findByEmailAndPassword(email, password);
    }
}
