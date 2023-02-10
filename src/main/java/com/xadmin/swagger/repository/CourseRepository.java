package com.xadmin.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xadmin.swagger.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}