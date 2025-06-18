package com.module.userprovider.controller;

import com.module.api.entity.User;
import com.module.api.entity.service.UserService;
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
    List<User> users = userService.listUsers();
    return ResponseEntity.ok(users);
  }

  @GetMapping("/{id}")
  public ResponseEntity<User> getById(@PathVariable Long id) {
    User user = userService.getById(id);
    if (user == null) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(user);
  }
}
