package com.usermanagement.service;

import com.usermanagement.dao.UserManageRepo;
import com.usermanagement.dtos.Constants;
import com.usermanagement.dtos.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@EnableAutoConfiguration
public class UserManagementService implements UserManageRepo{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Users> findUserByEmail(String email){
        String sql = Constants.GET_USER_BY_EMAIL + "'" + email + "'";
        List<Users> userdata = jdbcTemplate.query(sql, (rs, rowNum) -> new Users(
                        rs.getInt("userid"),
                        rs.getString("usertoken"),
                        rs.getString("email"),
                        rs.getString("first_name"),
                        rs.getInt("is_active"),
                        rs.getString("last_name"),
                        rs.getString("password"),
                        rs.getString("profile_photo"),
                        rs.getString("registered_date")
                )
        );
        return (List<Users>) userdata;
    }

    public String generateUUIDToken(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}