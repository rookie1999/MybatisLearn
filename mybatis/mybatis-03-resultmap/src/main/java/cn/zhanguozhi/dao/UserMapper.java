package cn.zhanguozhi.dao;

import cn.zhanguozhi.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getAllUsers();
    User getUserById(int id);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
    User getUserByNameAndPassword(Map<String, Object> map);
}
