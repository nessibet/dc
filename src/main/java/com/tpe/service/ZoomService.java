package com.tpe.service;

import com.tpe.domain.Course;
import com.tpe.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ZoomService implements CourseService{

//    @Autowired//field injection
//    @Qualifier("cloudRepository")
//    private Repository repository;

//    @Autowired//setter injection
//    @Qualifier("cloudRepository")
//    private Repository repository;
//    public  void setRepository(Repository repository){
//        this.repository = repository;
//    }


    private Repository repository;//constructor injection,
    @Autowired//optional:tek constructor varsa
    public ZoomService(@Qualifier("cloudRepository") Repository repository) {
        this.repository = repository;
    }

    @Override
    public void teachCourse(Course course) {
        System.out.println(course.getName()+" dersi ile Zoom anlatılıyor...");
    }

    @Override
    public void saveCourse(Course course) {
        repository.save(course);

    }


}
