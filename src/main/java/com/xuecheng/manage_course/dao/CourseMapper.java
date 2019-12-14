package com.xuecheng.manage_course.dao;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: xcEduService01
 * @description:
 * @author: WZH
 * @create: 2019-09-08 15:57
 **/
@Mapper
public interface CourseMapper {
   Page<CourseMapper> findCourseListPage();
}
