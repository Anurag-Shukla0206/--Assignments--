package com.anurag.UserManagementSystem.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {


    private Integer userId;
    private String name;


    private String userName;


    private String userContact;


    private String userAddress;




}