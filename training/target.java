package com.peters;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.peters.model.Course;

/**
 * Hello world!
 *
 */
//Target class
public class Student {
	// dependent
	private Course course;
	private int studId;
	private String studName;

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}


	
	
	public Student(Course course,int studId,String studName) {
		System.out.println("parameterised constructor and student object is created"
				);
		this.course = course;
		this.studId = studId;
		this.studName = studName;
	}

	static {
		System.out.println("Student class is loaded");
	}
	
	public Student() {
		System.out.println("default constructor");
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public void study() {
		System.out.println();
		System.out.println("the student is studying" + course);
		System.out.println(studId+" "+studName);

	}

	public static void main(String[] args) {
		FileSystemResource resource = 
		   new FileSystemResource("./src/main/java/com/peters/cfg/applicationContext.xml");
	BeanFactory factory = 
			new XmlBeanFactory(resource);
		Student obj = (Student)factory.getBean("s");
		obj.study();

	}
}
