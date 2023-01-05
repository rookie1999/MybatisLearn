package cn.zhanguozhi.dao;

import cn.zhanguozhi.pojo.Teacher;
import cn.zhanguozhi.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TeacherMapperTest {
    @Test
    public void testGetStudentById() {
        SqlSession session = MybatisUtils.getSqlSession();
        Teacher teacher = session.getMapper(TeacherMapper.class).getTeacherById(1);
        System.out.println(teacher);
        session.close();
    }

    @Test
    public void testGetStudentById2() {
        SqlSession session = MybatisUtils.getSqlSession();
        Teacher teacher = session.getMapper(TeacherMapper.class).getTeacherById2(1);
        System.out.println(teacher);
        session.close();
    }
}
