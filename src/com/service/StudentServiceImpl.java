package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.StudentMapper;
import com.pojo.Addr;
import com.pojo.PageBean;
import com.pojo.StuVo;
import com.pojo.Student;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Resource
	private StudentMapper studentMapper;

	@Override
	public PageBean<Student> getStudent(StuVo stuVo,Integer pageNum) throws Exception {
		stuVo.setBeginLimit((pageNum-1)*StuVo.PERPAGE);
		 List<Student> list = studentMapper.getStudent(stuVo);
		 PageBean<Student> pb=new PageBean<Student>();
		 pb.setData(list);
		 pb.setPageNum(pageNum);
		 pb.setPerPage(StuVo.PERPAGE);
		 long totalRecord=studentMapper.getStudentTotal(stuVo);
		 int totalPage=(int) Math.ceil(totalRecord*1.0/StuVo.PERPAGE);
		 if(totalPage<1){
			 totalPage=1;
		 }
		 pb.setTotalPage(totalPage);
		 pb.setTotalRecord((int)totalRecord);
		return pb;
	}

	@Override
	public List<Addr> getAddr() throws Exception {
		// TODO Auto-generated method stub
		return studentMapper.getAddr();
	}

	@Override
	public void addStu(Student student) throws Exception {
		// TODO Auto-generated method stub
		studentMapper.saveStudent(student);
	}

	@Override
	public void delete(Student student) throws Exception {
		// TODO Auto-generated method stub
		studentMapper.delete(student);
	}

	@Override
	public List<Student> getStuById(Student student) throws Exception {
		// TODO Auto-generated method stub
		StuVo stuVo=new StuVo();
		stuVo.setStudent(student);
		List<Student> list = studentMapper.getStudent(stuVo);
		return list;
	}

	@Override
	public void update(Student student) throws Exception {
		// TODO Auto-generated method stub
		studentMapper.update(student);
	}
	
}
