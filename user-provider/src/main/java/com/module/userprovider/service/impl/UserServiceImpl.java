package com.module.userprovider.service.impl;

import com.module.userprovider.entity.User;
import com.module.userprovider.mapper.UserMapper;
import com.module.userprovider.service.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@Service
@DubboService // 暴露为 Dubbo 服务
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
