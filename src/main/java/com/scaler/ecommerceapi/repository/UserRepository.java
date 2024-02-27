package com.scaler.ecommerceapi.repository;

import com.scaler.ecommerceapi.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    List<UserEntity> findByEmail(String email);

    List<UserEntity> findByEmailAndPassword(String email, String password);
}
