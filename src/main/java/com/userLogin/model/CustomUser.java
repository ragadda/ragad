package com.userLogin.model;

public class CustomUser {


    private Long id;

    private String username;

    private String password;

    private int active;

    private String roles = "";

    private String permissions = "";

////////////////////////////////////////////////////////////////////

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String img;
    private String address;

    public CustomUser(Long id, String username, String password, String roles, String permissions){
        this.id = id;
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.permissions = permissions;
        this.active = 1;
    }


    public CustomUser(Long id, String username, String password, int active, String roles, String permissions, String firstName, String lastName, String email, String phone, String img, String address) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.active = active;
        this.roles = roles;
        this.permissions = permissions;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.img = img;
        this.address = address;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    protected CustomUser(){}

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getActive() {
        return active;
    }

    public String getRoles() {
        return roles;
    }

    public String getPermissions() {
        return permissions;
    }
}