package com.pojo;

public class StuVo {
	public static final int PERPAGE=5;

	private Student student;
	private Integer beginLimit;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Integer getBeginLimit() {
		return beginLimit;
	}
	public void setBeginLimit(Integer beginLimit) {
		this.beginLimit = beginLimit;
	}
	
}
