package com.module.userconsumer.controller;

import com.module.api.entity.User;
import com.module.api.service.UserService;
import java.util.List;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  @DubboReference(version = "1.0.0", group = "default")
  private UserService userService;

  @GetMapping
  public ResponseEntity<List<User>> listUsers() {
    return ResponseEntity.ok(userService.listUsers());
  }

  @GetMapping("/{id}")
  public ResponseEntity<User> getById(@PathVariable Long id) {
    User user = userService.getById(id);
    return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
  }
}
