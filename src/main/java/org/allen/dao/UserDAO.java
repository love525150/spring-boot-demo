package org.allen.dao;

import org.allen.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDAO {

    @Select("SELECT name, age from user")
    List<User> getAllUser();
}
