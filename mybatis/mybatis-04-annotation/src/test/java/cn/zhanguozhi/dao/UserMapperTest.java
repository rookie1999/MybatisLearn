package cn.zhanguozhi.dao;

import cn.zhanguozhi.pojo.User;
import cn.zhanguozhi.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {


    @Test
    public void testGetUsers() {
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.getAllUsers();
        for (User u : users)
            System.out.println(u);
        session.close();
    }

    @Test
    public void testGetUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserById(1);
        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void testAddUser() {
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);

        User user = new User(6, "Ð¡²»µã", "xiaobudian");
        mapper.addUser(user);

        session.commit();
        session.close();
    }

    @Test
    public void testGetUsersByLimit() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("startIndex", 1);
        map.put("pageSize", 2);
        List<User> users = mapper.getUsersByLimit(map);
        for (User u : users)
            System.out.println(u);

        sqlSession.close();
    }
}
