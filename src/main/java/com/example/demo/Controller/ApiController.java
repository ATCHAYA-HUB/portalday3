package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.service;
import com.example.demo.model.Student;
@RestController
public class ApiController {
         @Autowired
         service s;    
         @GetMapping("/getfam")
         public List<Student> showDetails(){
        	 return s.getDetails();
         }
         @PostMapping("/postfam")
         public String addDetails(@RequestBody Student m) {
        	 s.add(m);
        	 return "Added product "+m.getId();
         }
}