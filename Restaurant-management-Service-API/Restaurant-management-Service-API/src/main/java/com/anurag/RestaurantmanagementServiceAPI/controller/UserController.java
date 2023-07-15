package com.anurag.RestaurantmanagementServiceAPI.controller;

import com.anurag.RestaurantmanagementServiceAPI.model.Order;
import com.anurag.RestaurantmanagementServiceAPI.model.User;
import com.anurag.RestaurantmanagementServiceAPI.model.dto.SignInInput;
import com.anurag.RestaurantmanagementServiceAPI.model.dto.SignUpOutput;
import com.anurag.RestaurantmanagementServiceAPI.service.AuthenticationService;
import com.anurag.RestaurantmanagementServiceAPI.service.UserService;
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
    public SignUpOutput signUpUser(@RequestBody User user)
    {

        return userService.signUpUser(user);
    }

    @PostMapping("user/signIn")
    public String sigInUser(@RequestBody @Valid SignInInput signInInput)
    {
        return userService.signInUser(signInInput);
    }

    @DeleteMapping("user/signOut")
    public String sigOutUser(String email, String token)
    {
        if(authenticationService.authenticate(email,token)) {
            return userService.sigOutUser(email);
        }
        else {
            return "Sign out not allowed for non authenticated user.";
        }

    }

    @PostMapping("order/food")
    public String orderFood(@RequestBody Order order, String email, String token)
    {

        if(authenticationService.authenticate(email,token)) {
            boolean status = userService.orderFood(order);
            return status ? "Food is ordered":"error occurred during Ordering Food";
        }
        else
        {
            return "Ordering failed because invalid authentication";
        }
    }

    @DeleteMapping("order/cancel")
    public String  cancelOrder(String email, String token)
    {

        if(authenticationService.authenticate(email,token)) {
            userService.cancelOrder(email);
            return "canceled Order successfully";
        }
        else
        {
            return "Ordering failed because invalid authentication";
        }
    }
}
