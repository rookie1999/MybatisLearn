package cn.zhanguozhi.dao;

import cn.zhanguozhi.pojo.Blog;
import cn.zhanguozhi.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlogMapperTest {

    @Test
    public void testGetAllBlogs() {
        SqlSession session = MybatisUtils.getSqlSession();
        List<Blog> blogs = session.getMapper(BlogMapper.class).getAllBlogs();
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        session.close();
    }

    @Test
    public void testGetBlogByIf1() {
        SqlSession session = MybatisUtils.getSqlSession();
        Map<String, Object> map = new HashMap<String, Object>();

        List<Blog> blogs = session.getMapper(BlogMapper.class).getBlogByMap(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        session.close();
    }

    @Test
    public void testGetBlogByIf2() {
        SqlSession session = MybatisUtils.getSqlSession();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("title", "Java如此简单");
        List<Blog> blogs = session.getMapper(BlogMapper.class).getBlogByMap(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        session.close();
    }

    @Test
    public void testGetBlogByIf3() {
        SqlSession session = MybatisUtils.getSqlSession();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("author", "狂神说");
        List<Blog> blogs = session.getMapper(BlogMapper.class).getBlogByMap(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        session.close();
    }
}
