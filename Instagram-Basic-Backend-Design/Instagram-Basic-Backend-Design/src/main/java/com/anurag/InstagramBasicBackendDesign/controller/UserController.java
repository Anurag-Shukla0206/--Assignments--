package com.anurag.InstagramBasicBackendDesign.controller;

import com.anurag.InstagramBasicBackendDesign.model.User;
import com.anurag.InstagramBasicBackendDesign.model.dto.SignInInput;
import com.anurag.InstagramBasicBackendDesign.model.dto.SignUpOutput;
import com.anurag.InstagramBasicBackendDesign.service.AuthenticationService;
import com.anurag.InstagramBasicBackendDesign.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    AuthenticationService authenticationService;


    @PostMapping("user/signup")
    public SignUpOutput signUpUser(@RequestBody User user) {

        return userService.signUpUser(user);
    }

    @PostMapping("user/signIn")
    public String sigInUser(@RequestBody @Valid SignInInput signInInput) {
        return userService.signInUser(signInInput);
    }

    @DeleteMapping("user/signOut")
    public String sigOutUser(String email, String token) {
        if (authenticationService.authenticate(email, token)) {
            return userService.sigOutUser(email);
        } else {
            return "Sign out not allowed for non authenticated user.";
        }

    }



}
