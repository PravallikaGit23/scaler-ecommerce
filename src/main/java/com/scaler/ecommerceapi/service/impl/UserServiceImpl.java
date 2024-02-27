package com.scaler.ecommerceapi.service.impl;

import com.scaler.ecommerceapi.dao.UserDAO;
import com.scaler.ecommerceapi.entity.UserEntity;
import com.scaler.ecommerceapi.model.User;
import com.scaler.ecommerceapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;
    @Override
    public void registerUser(User user) {
        UserEntity userEntity = getUserEntity(user);
          userDAO.registerUser(userEntity);

    }

    @Override
    public List<User> getUserByEmailAddress(String email) {
        List<UserEntity> userEntityList =  userDAO.getUserByEmail(email);
        return entityListToUserList(userEntityList);
    }

    public List<User> userLogin(User user){

           List<UserEntity> userEntityList =   userDAO.getUserByEmailAndPassword(user.getEmail(),user.getPassword());
            if(userEntityList.isEmpty()){
            System.out.println(" check your emailId and password ! ");
            }
           return entityListToUserList(userEntityList);

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
    private User getUserFromUserEntity(UserEntity userEntity) {
        User user = new User();
        user.setUserId(userEntity.getUserId());
        user.setUserName(userEntity.getUserName());
        user.setEmail(userEntity.getEmail());
        user.setPassword(userEntity.getPassword());
        user.setPhoneNumber(userEntity.getPhoneNumber());
        return user;
    }

    public List<User> entityListToUserList(List<UserEntity> userEntityList) {
        List<User> userList = new ArrayList<>();
        for (UserEntity userEntity : userEntityList) {
            User user = getUserFromUserEntity(userEntity);
            userList.add(user);
        }
        return userList;
    }
}
