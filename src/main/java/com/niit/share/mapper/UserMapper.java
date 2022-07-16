package com.niit.share.mapper;

import com.niit.share.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAll();

    User getUserById(Integer id);

    User getUserByName(String name);
}
