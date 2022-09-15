package com.usermanagement.dao;

import com.usermanagement.dtos.Users;

import java.util.List;

public interface UserManageRepo {
    List<Users> findUserByEmail(String email);
}
