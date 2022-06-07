package com.lt.service;

import java.util.List;

import com.lt.bean.Course;
import com.lt.bean.Professor;
import com.lt.bean.Student;
import com.lt.exception.CourseNotFoundException;

public interface AdminService {

	public List<Course> addCourse(List<Course> course);

	public List<Course> veiwCourse();

	public List<Professor> addProfessor(List<Professor> professor);

	public List<Professor> veiwProfessor();

	public List<Student> addStudent(List<Student> student);

	public List<Student> viewStudents();

	public String removeCourse(String courseCode) throws CourseNotFoundException;

	public String removeStudent(String id);

	public String removeProfessor(String name);

}
