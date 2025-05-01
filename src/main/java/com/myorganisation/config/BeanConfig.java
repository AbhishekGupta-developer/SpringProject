package com.myorganisation.config;

import com.myorganisation.beans.Course;
import com.myorganisation.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Course createCourseBean() {
        return new Course(1L, "Spring Boot", 100000D);
    }

    @Bean
    public Student createStudentBean() {
        return new Student(1L, "Abhishek", createCourseBean());
    }
}
