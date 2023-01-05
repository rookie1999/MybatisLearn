package cn.zhanguozhi.dao;

import cn.zhanguozhi.pojo.Student;
import cn.zhanguozhi.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {

    Student getStudentById(@Param("id") int id);

    Student getStudentById2(@Param("id") int id);
    Teacher getTeacherById(@Param("tid") int tid);
}
