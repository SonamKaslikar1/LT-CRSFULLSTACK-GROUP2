/**
 * 
 */
package com.lt.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lt.bean.Admin;
import com.lt.bean.Course;
import com.lt.bean.Professor;
import com.lt.exception.CourseNotFoundException;
import com.lt.exception.GradeNotWithinRangeException;

/**
 * @author admin
 *
 */

@Repository
public class AdminDAO {
	/**
	 * 
	 */
	private static List<Course> courseList;
	{

		courseList = new ArrayList();

		Course course1 = new Course("101", " Physics", true, "ABC");
		Course course2 = new Course("102", "Chemistry", true, "DEF");
		Course course3 = new Course("103", "Maths", true, "XYZ");
		Course course4 = new Course("104", "English", true, "YHHG");

		courseList.add(course1);
		courseList.add(course2);
		courseList.add(course3);
		courseList.add(course4);

	}

	/**
	 * 
	 * @return
	 */
	public List listOfCourses() {
		return courseList;
	}

	/**
	 * 
	 */
	private static List<Professor> professorList;
	{

		professorList = new ArrayList<Professor>();
		professorList.add(new Professor("Mitchel", "Physics", "Professor"));
	}

	/**
	 * 
	 * @return
	 */
	public List listOfProfessor() {
		return professorList;
	}

	public List<Course> addCourse(Course course) {

		List<Course> courselist = listOfCourses();
		int size = courselist.size();
		courselist.add(size, course);
		return courselist;

	}

	/**
	 * 
	 * @param CourseName
	 * @return
	 * @throws CourseNotFoundException
	 */
	public List<Course> deleteCourse(String CourseName) throws CourseNotFoundException {

		List<Course> courselist = listOfCourses();
		int count = 0;
		Iterator<Course> courselistIterator = courselist.iterator();
		while (courselistIterator.hasNext()) {
			if (courselistIterator.next().getName().equals(CourseName)) {
				courselistIterator.remove();
				count++;
			}
		}
		if (count == 0) {
			throw new CourseNotFoundException("Course name with the given name is not found.");

		}

		return courselist;
	}

	/**
	 * 
	 * @param professor
	 * @return
	 */
	public List<Professor> addProfessor(Professor professor) {
		List<Professor> professorList = listOfProfessor();
		int size = professorList.size();
		professorList.add(size, professor);
		return professorList;
	}

	/**
	 * 
	 * @param studentId
	 * @param sum
	 * @throws GradeNotWithinRangeException
	 */
	public void generateReportCard(int studentId, int sum) throws GradeNotWithinRangeException {
		String grade = "";
		int mean = sum / 4;
		if (mean >= 80) {
			grade = "A";
		} else if (mean < 80 && mean >= 60) {
			grade = "B";
		} else if (mean < 60 && mean >= 40) {
			grade = "C";
		} else {
			grade = "D";
		}
		if (mean < 100) {
			System.out.println("Grade for Student Id " + studentId + " is " + grade);
		} else {
			throw new GradeNotWithinRangeException("Grade is not within the range of 100.");
		}
	}
}
