package com.module.userprovider.service.impl;

import com.module.api.entity.User;
import com.module.api.service.UserService;
import com.module.userprovider.mapper.UserMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(interfaceClass = UserService.class, version = "1.0.0", group = "default")
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserMapper userMapper;

  @Override
  public List<User> listUsers() {
    return userMapper.selectAllUsers();
  }

  @Override
  public User getById(Long id) {
    return userMapper.selectById(id);
  }
}
