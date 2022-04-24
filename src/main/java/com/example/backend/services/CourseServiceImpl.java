package com.example.backend.services;

import com.example.backend.DAO.cookbookDAO;
import com.example.backend.entities.Courses;
import com.example.backend.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

        @Autowired
        private cookbookDAO cookbookDAO;


    @Override
    public List<Users> getCourses() {
        return cookbookDAO.findAllSortedByName();
    }

    @Override
    public Users getCourse(int CourseID) {
        return cookbookDAO.getById(CourseID);
    }

    @Override
    public Users addCourse(Users courses) {
            cookbookDAO.save(courses);
            return courses;
    }
}
