package com.example.demo.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Repository.repository;
import com.example.demo.model.Student;
@Service
public class service {
@Autowired
 repository r;
public String add(Student m) {
	r.save(m);
	return "Added";
}
public List<Student> getDetails(){
	return r.findAll();
}
}