package com.springbootdev.examples.microservices.courseservice.controller;

import com.springbootdev.examples.microservices.courseservice.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController
{

    @GetMapping("/courses/{course_id}")
    public Course getCourseBuId(@PathVariable("course_id") Integer courseId)
    {
        return new Course(1, "Bsc-IT", "English");
    }


    @GetMapping("/courses")
    public List<Course> getAllCourses()
    {
        List<Course> courseList = new ArrayList<>();

        courseList.add(new Course(1, "Bsc-IT", "English"));
        courseList.add(new Course(2, "Bsc-CS", "English"));
        courseList.add(new Course(3, "Msc-IT", "English"));
        courseList.add(new Course(4, "Zend Certification", "English"));
        return courseList;
    }
}
