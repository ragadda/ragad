package com.userLogin.repository;

import com.userLogin.model.CustomUser;

import java.util.List;

public interface UserRepository {
    void createUser(CustomUser customUser);
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
