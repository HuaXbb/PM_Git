package com.mapper;

import java.util.List;

import com.pojo.Addr;
import com.pojo.StuVo;
import com.pojo.Student;

public interface StudentMapper {

	List<Student> getStudent(StuVo stuVo) throws Exception;
	long getStudentTotal(StuVo stuVo) throws Exception;
	List<Addr> getAddr() throws Exception;
	void saveStudent(Student student) throws Exception;
	void delete(Student student) throws Exception;
	void update(Student student) throws Exception;


}
