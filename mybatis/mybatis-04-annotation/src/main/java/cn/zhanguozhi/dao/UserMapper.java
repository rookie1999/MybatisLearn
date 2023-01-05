package cn.zhanguozhi.dao;

import cn.zhanguozhi.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    @Select("select * from user")
    List<User> getAllUsers();

    @Select("select id, name, pwd as password from user where id = #{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user values (#{id}, #{name}, #{password})")
    void addUser(User user);

    @Update("update user set name = #{name}, pwd = #{password} where id = #{id}")
    void updateUser(User user);

    @Delete("delete from user where id = #{uid}")
    void deleteUser(@Param("uid") int id);

    @Select("select id, name, pwd as password from user limit #{startIndex}, #{pageSize}")
    List<User> getUsersByLimit(Map<String, Object> map);
}
