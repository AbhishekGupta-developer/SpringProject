package com.myorganisation;

import com.myorganisation.beans.Student;
import com.myorganisation.config.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //Using XML FIle
        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Student student = (Student) context.getBean("studentBean");

        //System.out.println(student);

        //Using Java Config
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Student student = context.getBean(Student.class);

        System.out.println(student);
    }
}
