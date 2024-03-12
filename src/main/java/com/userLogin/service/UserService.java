package com.userLogin.service;

import com.userLogin.model.CustomUser;
import com.userLogin.model.CustomUserRequest;
import org.h2.engine.User;

import java.util.List;

public interface UserService {
    void createUser(CustomUserRequest customUser) throws Exception;
    CustomUser findUserByUsername(String username);

    void deleteUserById(Integer id);
    void updateUserFirstName(Integer id, String firstName);
    void updateUserLastName(Integer id, String lastName);
    void updateUserAddress(Integer id,String address);
    void updateUserPhone(Integer id,String phone);
    void updateUserImg(Integer id,String img);


    CustomUser getUserById(Integer id);
    List<CustomUser> getAllUsers();

}//end class
