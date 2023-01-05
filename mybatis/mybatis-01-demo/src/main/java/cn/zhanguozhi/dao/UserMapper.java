package cn.zhanguozhi.dao;

import cn.zhanguozhi.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getAllUsers();
    User getUserById(int id);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
}
