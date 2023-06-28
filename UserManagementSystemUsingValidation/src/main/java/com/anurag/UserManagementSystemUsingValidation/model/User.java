package com.anurag.UserManagementSystemUsingValidation.model;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @NotNull
    private Integer userId;

    @NotBlank(message = "name cannot be blank")
    private String userName;

    @Email(message = "Given email id is invalid")
    private String userEmail;


    @Size(min = 7,max = 12)
    @Pattern(regexp = "^[0-9]+$")
    private String userContact;

    @NotNull
    private LocalDate userDOB;


    @NotNull
    private  LocalDate currDate;
    @NotNull
    private LocalTime currTime;
}
