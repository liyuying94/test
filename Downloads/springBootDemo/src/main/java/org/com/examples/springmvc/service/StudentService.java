package org.com.examples.springmvc.service;

import java.util.List;
import org.com.examples.springmvc.entity.Student;
import org.com.examples.springmvc.manager.studentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Studeng Service
 * 业务层
 */
@Service
public class StudentService {

	 @Autowired
	 private studentManager studentManagerDao;
	 
	 public List<Student> getList(){
		 
		 return studentManagerDao.getList(); 
	 }
}
