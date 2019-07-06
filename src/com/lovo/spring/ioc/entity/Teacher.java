package com.lovo.spring.ioc.entity;

import java.util.List;

public class Teacher {
     //教师名字
	private String teacherName;
	//教师年龄
	private String teacherAge;
	private String subject;
	
	private List<Student> listStu;
	
	
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherAge() {
		return teacherAge;
	}
	public void setTeacherAge(String teacherAge) {
		this.teacherAge = teacherAge;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public List<Student> getListStu() {
		return listStu;
	}
	public void setListStu(List<Student> listStu) {
		this.listStu = listStu;
	}
	
	
	
}
