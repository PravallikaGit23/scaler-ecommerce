package com.scaler.ecommerceapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
public class User {
   private int userId;
   private String userName;
   private String email;
   private String password;
   private String phoneNumber;
}
