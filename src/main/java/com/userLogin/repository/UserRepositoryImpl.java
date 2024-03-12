package com.userLogin.repository;

import com.userLogin.model.CustomUser;
import com.userLogin.repository.mapper.UserMapper;
import com.userLogin.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    //private static final String USER_TABLE_NAME = "user";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createUser(CustomUser customUser) {
        String sql = "INSERT INTO " + Constant.USER_TABLE_NAME + " (username, password, roles, permissions) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, customUser.getUsername(), customUser.getPassword(), customUser.getRoles(), customUser.getPermissions());
    }

    @Override
    public CustomUser findUserByUsername(String username) {
        String sql = "SELECT * FROM " + Constant.USER_TABLE_NAME + " WHERE username=?";
        try {
            return jdbcTemplate.queryForObject(sql, new UserMapper(), username);
        } catch (EmptyResultDataAccessException error) {
            return null;
        }
    }

/////////////////////////////////////////////////////////////////////

    @Override
    public void deleteUserById(Integer id) {
        String sql = "DELETE FROM "+ Constant.USER_TABLE_NAME+" WHERE id = ?";
        jdbcTemplate.update(sql,id);
    }



    @Override
    public void updateUserFirstName(Integer id, String firstName) {
        String sql = "UPDATE "+ Constant.USER_TABLE_NAME +" SET first_name = ? WHERE id = ?";
        jdbcTemplate.update(sql,firstName,id);
    }

    @Override
    public void updateUserLastName(Integer id, String lastName) {
        String sql = "UPDATE "+ Constant.USER_TABLE_NAME +" SET last_name = ? WHERE id = ?";
        jdbcTemplate.update(sql,lastName,id);
    }

    @Override
    public void updateUserAddress(Integer id,String address) {
        String sql = "UPDATE "+ Constant.USER_TABLE_NAME +" SET address = ? WHERE id = ?";
        jdbcTemplate.update(sql,address,id);

    }

    @Override
    public void updateUserPhone(Integer id, String phone) {
        String sql = "UPDATE "+ Constant.USER_TABLE_NAME +" SET address = ? WHERE id = ?";
        jdbcTemplate.update(sql,phone,id);
    }

    @Override
    public void updateUserImg(Integer id, String img) {
        String sql = "UPDATE "+ Constant.USER_TABLE_NAME +" SET address = ? WHERE id = ?";
        jdbcTemplate.update(sql,img,id);
    }

    @Override
    public CustomUser getUserById(Integer id) {
        try {
            String sql = "SELECT * FROM " + Constant.USER_TABLE_NAME + " WHERE id = ?";
            return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    @Override
    public List<CustomUser> getAllUsers() {
        String sql = "SELECT * FROM "+ Constant.USER_TABLE_NAME;
        return jdbcTemplate.query(sql,new UserMapper());
    }



}//end class


