package cn.zhanguozhi.dao;

import cn.zhanguozhi.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    List<Blog> getAllBlogs();

    List<Blog> getBlogByMap(Map<String, Object> map);
}
