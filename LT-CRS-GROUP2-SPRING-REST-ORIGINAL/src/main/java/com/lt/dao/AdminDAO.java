package com.lt.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.lt.bean.Course;
import com.lt.bean.Professor;
import com.lt.bean.Student;
import com.lt.exception.CourseNotFoundException;
import com.lt.rest.AdminController;

/**
 * 
 * @author admin
 *
 */
@Repository
public class AdminDAO implements AdminDAOInterface {

	private static final Logger logger = LoggerFactory.getLogger(AdminDAO.class);
	/**
	 * 
	 */
	public static List<Student> studentList = new ArrayList<Student>();
	/**
	 * 
	 */
	private static List<Course> courseList;
	{

		courseList = new ArrayList();

		Course course1 = new Course("101", " Physics", "true", "ABC");
		Course course2 = new Course("102", "Chemistry", "true", "DEF");
		Course course3 = new Course("103", "Maths", "true", "XYZ");
		Course course4 = new Course("104", "English", "true", "YHHG");

		courseList.add(course1);
		courseList.add(course2);
		courseList.add(course3);
		courseList.add(course4);
		logger.info("Course List is : " + courseList.toString());
	}

	/**
	 * 
	 */
	private static List<Professor> professorList;
	{

		professorList = new ArrayList<Professor>();
		professorList.add(new Professor("Mitchel", "Physics", "Professor"));
		logger.info("Professor List is : " + professorList.toString());

	}

	/**
	 * 
	 */
	@Override
	public List<Course> addCourse(List<Course> course) {
		// TODO Auto-generated method stub
		for (Course c : course) {
			courseList.add(c);
		}
		logger.info("course List after adding course is :" + courseList.toString());
		return courseList;
	}

	/**
	 * 
	 */
	@Override
	public List<Course> veiwCourse() {
		// TODO Auto-generated method stub
		return courseList;
	}

	/**
	 * 
	 */
	@Override
	public List<Professor> addProfessor(List<Professor> professor) {
		// TODO Auto-generated method stub
		for (Professor p : professor) {
			professorList.add(p);
		}
		logger.info("Professor List after adding professor is :" + professorList.toString());
		return professorList;
	}

	/**
	 * 
	 */
	@Override
	public List<Student> addStudent(List<Student> student) {
		// TODO Auto-generated method stub

		for (Student s : student) {
			studentList.add(s);
		}
		logger.info("Student List after adding student is :" + studentList.toString());
		return studentList;
	}

	/**
	 * 
	 */
	@Override
	public List<Student> viewStudents() {
		// TODO Auto-generated method stub
		return studentList;
	}

	/**
	 * 
	 */
	@Override
	public List<Professor> veiwProfessor() {
		// TODO Auto-generated method stub
		return professorList;
	}

	/**
	 * 
	 */
	@Override
	public String removeCourse(String courseCode) throws CourseNotFoundException {
		// TODO Auto-generated method stub
		List<Course> clist = courseList.stream().filter(n -> n.getCourseCode().equals(courseCode))
				.collect(Collectors.toList());
		if (clist.size() !=0) {
			courseList.removeAll(clist);
			logger.info("Course List after removing course is  :" + courseList.toString());
			return "Removed Succesfully";
		} else {
			logger.error("Exception in Removing course code" + courseCode);
			throw new CourseNotFoundException("Exception in Removing course code" + courseCode);
		}

	}

	/**
	 * 
	 */
	@Override
	public String removeStudent(String id) {
		List<Student> slist = studentList.stream().filter(n -> n.getId().equals(id)).collect(Collectors.toList());
		studentList.removeAll(slist);
		logger.info("Student List after removing student is  :" + studentList.toString());
		return "Removed Succesfully";
	}

	/**
	 * 
	 */
	@Override
	public String removeProfessor(String name) {
		List<Professor> plist = professorList.stream().filter(n -> n.getProfName().equals(name))
				.collect(Collectors.toList());
		professorList.removeAll(plist);
		logger.info("Professor List after removing professor is  :" + professorList.toString());
		return "Removed Succesfully";
	}

}
