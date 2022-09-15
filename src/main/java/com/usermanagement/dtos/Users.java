package com.usermanagement.dtos;

import javax.persistence.*;

@Entity
@Table(name = "users", schema = "twitter-like")
public class Users {

    @Id
    private Integer userid;
    private String usertoken;
    private String email;
    private String first_name;
    private Integer is_active;
    private String last_name;
    private String password;
    private String profile_photo;
    private String registered_date;

    public Users(Integer userid, String usertoken, String email, String first_name, Integer is_active, String last_name, String password, String profile_photo, String registered_date) {
        this.userid = userid;
        this.usertoken = usertoken;
        this.email = email;
        this.first_name = first_name;
        this.is_active = is_active;
        this.last_name = last_name;
        this.password = password;
        this.profile_photo = profile_photo;
        this.registered_date = registered_date;
    }

    public Users(String userid, String usertoken, String last_name, String first_name, String password, String profile_photo, String registered_date, int is_active) {

    }

    public Users() {

    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsertoken() {
        return usertoken;
    }

    public void setUsertoken(String usertoken) {
        this.usertoken = usertoken;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfile_photo() {
        return profile_photo;
    }

    public void setProfile_photo(String profile_photo) {
        this.profile_photo = profile_photo;
    }

    public String getRegistered_date() {
        return registered_date;
    }

    public void setRegistered_date(String registered_date) {
        this.registered_date = registered_date;
    }

    public Integer getIs_active() {
        return is_active;
    }

    public void setIs_active(Integer is_active) {
        this.is_active = is_active;
    }

}
