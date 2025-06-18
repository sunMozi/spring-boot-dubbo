package com.module.userprovider.service;

import com.module.userprovider.entity.User;

import java.util.List;

public interface UserService {
    List<User> listUsers();
    User getById(Long id);
}
