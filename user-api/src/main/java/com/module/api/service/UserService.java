package com.module.api.service;

import com.module.api.entity.User;
import java.util.List;

public interface UserService {

  List<User> listUsers();

  User getById(Long id);
}
