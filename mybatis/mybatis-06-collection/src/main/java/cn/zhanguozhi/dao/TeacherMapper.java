package cn.zhanguozhi.dao;

import cn.zhanguozhi.pojo.Student;
import cn.zhanguozhi.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {

    Teacher getTeacherById(@Param("id") int id);

    Teacher getTeacherById2(@Param("id") int id);
    Student getStudentByTeacherId(@Param("tid") int id);
}
