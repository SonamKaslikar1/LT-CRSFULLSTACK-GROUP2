/**
 * 
 */
package com.lt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lt.bean.Course;
import com.lt.bean.Professor;
import com.lt.dao.AdminDAO;
import com.lt.exception.CourseNotFoundException;
import com.lt.exception.GradeNotWithinRangeException;

/**
 * @author admin
 *
 */
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDAO adminDao;

	/**
	 * 
	 */
	@Override
	public List listOfCourses() {
		// TODO Auto-generated method stub
		return adminDao.listOfCourses();
	}

	/**
	 * 
	 */
	@Override
	public List<Course> addCourse(Course course) {
		// TODO Auto-generated method stub
		return adminDao.addCourse(course);
	}

	/**
	 * 
	 */
	@Override
	public List<Course> deleteCourse(String courseName) throws CourseNotFoundException {
		// TODO Auto-generated method stub
		return adminDao.deleteCourse(courseName);
	}

	/**
	 * 
	 */
	@Override
	public List<Professor> addProfessor(Professor professor) {
		// TODO Auto-generated method stub
		return adminDao.addProfessor(professor);
	}

	/**
	 * 
	 */
	@Override
	public void generateReportCard(int studentId, int sum) throws GradeNotWithinRangeException {
		// TODO Auto-generated method stub
		adminDao.generateReportCard(studentId, sum);
	}

}
