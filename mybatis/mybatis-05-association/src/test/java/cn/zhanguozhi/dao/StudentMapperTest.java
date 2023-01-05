package cn.zhanguozhi.dao;

import cn.zhanguozhi.pojo.Student;
import cn.zhanguozhi.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class StudentMapperTest {
    @Test
    public void testGetStudentById() {
        SqlSession session = MybatisUtils.getSqlSession();
        Student student = session.getMapper(StudentMapper.class).getStudentById(2);
        System.out.println(student);
        session.close();
    }

    @Test
    public void testGetStudentById2() {
        SqlSession session = MybatisUtils.getSqlSession();
        Student student = session.getMapper(StudentMapper.class).getStudentById2(3);
        System.out.println(student);
        session.close();
    }
}
