package com.module.userconsumer.mapper;


import com.module.api.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

  @Select("SELECT * FROM user")
  List<User> selectAllUsers();

  @Select("SELECT * FROM user WHERE id = #{id}")
  User selectById(Long id);
}
