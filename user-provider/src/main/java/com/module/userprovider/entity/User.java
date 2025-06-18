package com.module.userprovider.entity;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class User {

  private Long id;
  private String username;
  private String phone;
  private String email;
  private LocalDateTime createTime;
  private LocalDateTime updateTime;
}
