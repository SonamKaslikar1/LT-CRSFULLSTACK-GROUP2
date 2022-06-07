/**
 * 
 */
package com.lt.service;

import java.util.List;

import com.lt.bean.Course;
import com.lt.bean.Professor;
import com.lt.exception.CourseNotFoundException;
import com.lt.exception.GradeNotWithinRangeException;

/**
 * @author admin
 *
 */
public interface AdminService {

	public List listOfCourses();
	public List<Course> addCourse(Course course);
	public List<Course> deleteCourse(String courseName) throws CourseNotFoundException ;
	public List<Professor> addProfessor(Professor professor);
	public void generateReportCard(int studentId, int sum) throws GradeNotWithinRangeException ;
}
