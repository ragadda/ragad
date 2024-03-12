package com.userLogin.service;

import com.userLogin.model.CustomUser;
import com.userLogin.model.CustomUserRequest;
import com.userLogin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void createUser(CustomUserRequest customUserRequest) throws Exception {
        CustomUser existingCustomUser = userRepository.findUserByUsername(customUserRequest.getUsername());
        if(existingCustomUser != null){
            throw new Exception("Username " + customUserRequest.getUsername() + " is already taken");
        }
        userRepository.createUser(customUserRequest.toCustomUser());
    }

    @Override
    public CustomUser findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }


    @Override
    public void deleteUserById(Integer id) {
        userRepository.deleteUserById(id);
    }


    @Override
    public void updateUserFirstName(Integer id, String firstName) {
        userRepository.updateUserFirstName(id,firstName);
    }

    @Override
    public void updateUserLastName(Integer id, String lastName) {
        userRepository.updateUserLastName(id,lastName);
    }

    @Override
    public void updateUserAddress(Integer id, String address) {
        userRepository.updateUserAddress(id,address);
    }

    @Override
    public void updateUserPhone(Integer id, String phone) {
        userRepository.updateUserPhone(id,phone);
    }

    @Override
    public void updateUserImg(Integer id, String img) {
        userRepository.updateUserImg(id,img);
    }


    @Override
    public CustomUser getUserById(Integer id) {
        return userRepository.getUserById(id);
    }

    @Override
    public List<CustomUser> getAllUsers() {
        return userRepository.getAllUsers();
    }





}//end class





