package com.example.backend.controller;

import com.example.backend.entities.Courses;
import com.example.backend.entities.Users;
import com.example.backend.exception.APIRequestException;
import com.example.backend.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private CourseService courseService;


    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home() {
        return "Controller backend";
    }

    @GetMapping("/Courses")
    public List<Users> getCourses() {
        return this.courseService.getCourses();
    }

    @GetMapping("/Courses/{CourseID}")
    public Users getCourse(@PathVariable String CourseID){
        return this.courseService.getCourse(Integer.parseInt(CourseID));
    }

    @PostMapping(path = "/Courses", consumes = "application/json")
    public Users AddCourse(@RequestBody Users users){
        return  this.courseService.addCourse(users);
    }

    @RequestMapping(path = "/Courses/{CourseID}",method = RequestMethod.DELETE)
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String CourseID){
        try{
//                return new ResponseEntity<HttpStatus>(HttpStatus.ACCEPTED);
            throw new APIRequestException("Data Not Found");
        } catch (Exception e){
            throw new APIRequestException("Data Not Found");
        }
    }
}
