package com.klu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klu.model.Student;
import com.klu.service.Studentservice;

@RestController
@RequestMapping("/api")
public class Studentcontroller {
        @Autowired
        private Studentservice service;
        @GetMapping("/greet")
        //link=http://localhost:8080/api/greet
            //type=get
        public String getWelcomeMessage() {
        	return service.getWelcomeMessage();
        }
        @PostMapping("/students/add")
        //link=http://localhost:8080/api/students/add
        //type=post
        public Student createStudent(@RequestBody Student student) {
        	return service.createStudent(student);
        }
        @GetMapping("/student/getid/{id}")
        //link=http://localhost:8080/api/student/getid/{id}
         //type=get
        public Student getStudentById(@PathVariable int id) {
        	return service.getStudentById(id);
        }
        @GetMapping("/student/getall")
        //type=get
        //link=http://localhost:8080/api/student/getall

        public List<Student> getAllStudents() {
        	return service.getAllStudents();
        }
        
        @PutMapping("/student/update/{id}")
        //type=put
        //link=http://localhost:8080/api/student/update/{id}
         //{
        //"name": "Ravi Kumar",
        //"course": "AI"
      //}

        public Student updateStudent(@PathVariable  int id,@RequestBody Student student) {
        	return service.updateStudent(id, student);
        }
        
        @DeleteMapping("/student/del/{id}")
        //type=delete
        //link=http://localhost:8080/api/student/del/{id}

        	public String deleteStudent(@PathVariable int id) {
        	     return service.deleteStudent(id);
        }
        
        @GetMapping("/student/search/")
        //type=get
        //link=http://localhost:8080/api/student/search/?name=Ravi&course=CSE
        public List<Student> searchStudent(@RequestParam String name,@RequestParam String course){
        	return service.searchStudent(name, course);
        }
        
}