package com.module.api.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class User implements Serializable {

  private Long id;
  private String username;
  private String phone;
  private String email;
  private LocalDateTime createTime;
  private LocalDateTime updateTime;
}
