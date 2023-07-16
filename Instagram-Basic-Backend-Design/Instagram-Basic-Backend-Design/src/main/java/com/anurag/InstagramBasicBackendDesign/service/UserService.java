package com.anurag.InstagramBasicBackendDesign.service;

import com.anurag.InstagramBasicBackendDesign.model.AuthenticationToken;
import com.anurag.InstagramBasicBackendDesign.model.Post;
import com.anurag.InstagramBasicBackendDesign.model.User;
import com.anurag.InstagramBasicBackendDesign.model.dto.SignInInput;
import com.anurag.InstagramBasicBackendDesign.model.dto.SignUpOutput;
import com.anurag.InstagramBasicBackendDesign.repository.IUserRepo;
import com.anurag.InstagramBasicBackendDesign.service.utility.EmailUtility;
import com.anurag.InstagramBasicBackendDesign.service.utility.HashingUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;

    @Autowired
    AuthenticationService authenticationService;

    @Autowired
    PostService postService;


    public SignUpOutput signUpUser(User user) {

        boolean signUpStatus = true;
        String signUpStatusMessage = null;

        String newEmail = user.getUserEmail();

        if(newEmail == null)
        {
            signUpStatusMessage = "Invalid email";
            signUpStatus = false;
            return new SignUpOutput(false,signUpStatusMessage);
        }

        User existingUser = userRepo.findFirstByUserEmail(newEmail);

        if(existingUser != null)
        {
            signUpStatusMessage = "Email already registered!!!";
            signUpStatus = false;
            return new SignUpOutput(false,signUpStatusMessage);
        }

        //hash the password: encrypt the password
        try {
            String encryptedPassword = HashingUtility.encryptPassword(user.getUserPassword());

            //saveAppointment the user with the new encrypted password

            user.setUserPassword(encryptedPassword);
            userRepo.save(user);

            return new SignUpOutput(true, "User registered successfully!!!");
        }
        catch(Exception e)
        {
            signUpStatusMessage = "Internal error occurred during sign up";
            signUpStatus = false;
            return new SignUpOutput(false,signUpStatusMessage);
        }
    }


    public String signInUser(SignInInput signInInput) {


        String signInStatusMessage = null;

        String signInEmail = signInInput.getEmail();

        if(signInEmail == null)
        {
            signInStatusMessage = "Invalid email";
            return signInStatusMessage;


        }

        //check if this user email already exists ??
        User existingUser = userRepo.findFirstByUserEmail(signInEmail);

        if(existingUser == null)
        {
            signInStatusMessage = "Email not registered!!!";
            return signInStatusMessage;

        }

        try {
            String encryptedPassword = HashingUtility.encryptPassword(signInInput.getPassword());
            if(existingUser.getUserPassword().equals(encryptedPassword))
            {
                //session should be created since password matched and user id is valid
                AuthenticationToken authToken  = new AuthenticationToken(existingUser);
                authenticationService.saveAuthToken(authToken);

                EmailUtility.sendEmail(signInEmail,"OTP Token For Creating Post",authToken.getTokenValue());
                return "Token sent to your email";
            }
            else {
                signInStatusMessage = "Invalid credentials!!!";
                return signInStatusMessage;
            }
        }
        catch(Exception e)
        {
            signInStatusMessage = "Internal error occurred during sign in";
            return signInStatusMessage;
        }

    }


    public String sigOutUser(String email) {

        User user = userRepo.findFirstByUserEmail(email);
        AuthenticationToken token = authenticationService.findFirstByUser(user);
        authenticationService.removeToken(token);
        return "User Signed out successfully";
    }


    public String createInstaPost(Post post, String email) {

        User postOwner = userRepo.findFirstByUserEmail(email);
        post.setUser(postOwner);
        return postService.createInstaPost(post);
    }
}