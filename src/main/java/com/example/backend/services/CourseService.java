package com.example.backend.services;
import com.example.backend.entities.Users;

import java.util.List;

public interface CourseService {
    public List<Users>getCourses();
    public Users getCourse(int CourseID);
    public Users addCourse(Users Users);
}
