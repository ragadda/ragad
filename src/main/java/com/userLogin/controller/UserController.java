package com.userLogin.controller;

import com.userLogin.model.CustomUser;
import com.userLogin.model.CustomUserRequest;
import com.userLogin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/public/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    @CrossOrigin
    public ResponseEntity<?> createUser(@RequestBody CustomUserRequest customUser){
        try{
           userService.createUser(customUser);
           return null;
        } catch (Exception exception){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
        }
    }





    @PutMapping(value = "/update_first_name")
    public void updateUserFirstName(@RequestParam(value = "user_id") Integer id, @RequestParam(value = "first_name") String firstName){
        userService.updateUserFirstName(id,firstName);
    }
    @PutMapping(value = "/update_last_name")
    public void updateUserLastName(@RequestParam(value = "user_id") Integer id,@RequestParam(value = "last_name") String lastName){
        userService.updateUserLastName(id,lastName);
    }

    @PutMapping(value = "/update_address")
    public void updateUserEmail(@RequestParam(value = "user_id") Integer id,@RequestParam String address){
        userService.updateUserAddress(id,address);
    }
    @PutMapping(value = "/update_phone")
    public void updateUserPhone(@RequestParam(value = "user_id") Integer id,@RequestParam String phone){
        userService.updateUserPhone(id,phone);
    }
    @PutMapping(value = "/update_address")
    public void updateUserImg(@RequestParam(value = "user_id") Integer id,@RequestParam String img){
        userService.updateUserImg(id,img);
    }
    @DeleteMapping(value = "/delete")
    public void deleteUserById(@RequestParam(value = "user_id") Integer id){
        userService.deleteUserById(id);
    }

    @GetMapping(value="/by_id")
    public CustomUser getUserById(@RequestParam(value = "user_id") Integer id){
        return userService.getUserById(id);
    }

    @GetMapping(value = "/all")
    public List<CustomUser> getAllUsers(){
        return userService.getAllUsers();
    }
}//end class



