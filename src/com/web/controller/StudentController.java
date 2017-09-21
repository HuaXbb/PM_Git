package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Addr;
import com.pojo.PageBean;
import com.pojo.StuVo;
import com.pojo.Student;
import com.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value="/show.do")
	public String show(StuVo stuVo,Model model,Integer pageNum){
		
		if(pageNum==null || pageNum<1){
			pageNum=1;
		}
		try {
			PageBean<Student> pb = studentService.getStudent(stuVo,pageNum);
			
			model.addAttribute("pb",pb);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "show";
	}
	@RequestMapping(value="/loadAddr.do")
	@ResponseBody
	public List<Addr> show(){
		List<Addr> list=null;
		try {
			list = studentService.getAddr();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return list;
	}
	
	@RequestMapping("/add.do")
	public String toAddJsp(Student student){
		try {
			studentService.addStu(student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/show.do";
	}
	@RequestMapping("/ToAdd.do")
	public String toAddJsp(){
		return "add";
	}
	@RequestMapping("/delete.do")
	public String delete(Student student){
		try {
			studentService.delete(student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/show.do";
	}
	
	@RequestMapping("/update.do")
	public String update(Student student,Model model){
		try {
			Student s = studentService.getStuById(student).get(0);
			List<Addr> addr = studentService.getAddr();
		
			model.addAttribute("addr",addr);
			model.addAttribute("student",s);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "update";
	}
	@RequestMapping("/updateTo.do")
	public String update2(Student student){
	
		try {
			studentService.update(student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
		return "redirect:/show.do";
	}
	
	
}
