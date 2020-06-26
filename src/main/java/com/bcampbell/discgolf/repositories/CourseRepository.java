package com.bcampbell.discgolf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bcampbell.discgolf.models.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
