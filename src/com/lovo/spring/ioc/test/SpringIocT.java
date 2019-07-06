package com.lovo.spring.ioc.test;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.spring.ioc.entity.Student;
import com.lovo.spring.ioc.entity.Teacher;

public class SpringIocT {
	ClassPathXmlApplicationContext app = null;

	@Before
	public void before() {
		// 启动spring
		app = new ClassPathXmlApplicationContext("/resouse/ioc.xml");
	}

	@Test
	public void createTeahcer() {

		// 去容器找我们想要的对象
		Teacher t = (Teacher) app.getBean("teacher");
		Teacher t1 = (Teacher) app.getBean("teacher");
		Teacher t2 = (Teacher) app.getBean("teacher");
		System.out.println(t);
		System.out.println(t1);
		System.out.println(t2);
		// System.out.println(t.getTeacherName()+"/"+t.getTeacherAge());
	}

	@Test
	public void listT() {

		// 去容器找我们想要的对象
		Teacher t = (Teacher) app.getBean("teacher");
		List<Student> list = t.getListStu();
		for (Student student : list) {
			System.out.println("教师名字为:" + t.getTeacherName() + "他拥有的学生名字为:" + student.getStudentName());
		}
	}

	@Test
	public void propT() {

		// 去容器找我们想要的对象
		Student stu = (Student) app.getBean("student3");
		System.out.println(
				stu.getStudentName() + "/" + stu.getProp().getProperty("age") + "/" + stu.getProp().getProperty("sex"));
	}

}
