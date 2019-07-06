package com.lovo.spring.ioc.entity;

import java.util.Properties;

public class Student {

   private Properties prop;
    //学生名字
	private String studentName;


	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	
	
	
}
