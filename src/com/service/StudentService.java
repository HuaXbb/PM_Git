package com.service;

import java.util.List;

import com.pojo.Addr;
import com.pojo.PageBean;
import com.pojo.StuVo;
import com.pojo.Student;

public interface StudentService {

	PageBean<Student> getStudent(StuVo stuVo, Integer pageNum) throws Exception;

	List<Addr> getAddr() throws Exception;

	void addStu(Student student)throws Exception;

	void delete(Student student)throws Exception;

	List<Student> getStuById(Student student) throws Exception;

	void update(Student student) throws Exception;

	
}
