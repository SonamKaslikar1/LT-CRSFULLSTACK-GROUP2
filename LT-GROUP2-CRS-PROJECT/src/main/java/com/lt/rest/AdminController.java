/**
 * 
 */
package com.lt.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lt.bean.Course;
import com.lt.bean.Professor;
import com.lt.exception.CourseNotFoundException;
import com.lt.service.AdminServiceImpl;

/**
 * @author admin
 *
 */
@RestController
@CrossOrigin
public class AdminController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	@Autowired
	private AdminServiceImpl adminService;

	/**
	 * 
	 * @return
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/viewCourseDetails")
	@ResponseBody
	public List viewCourseDetails() {
		logger.debug("inside view course details.");
		logger.info("logger info in course details");
		return adminService.listOfCourses();
	}

	/**
	 * 
	 * @param course
	 * @return
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/addCourse")
	@ResponseBody
	public List addCourseDetails(@RequestBody Course course) {

		return adminService.addCourse(course);
	}

	/**
	 * 
	 * @param courseName
	 * @return
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.DELETE, value = "/deleteCourse")
	@ResponseBody
	public ResponseEntity deleteCourseDetails(@RequestBody String courseName) {

		try {
			adminService.deleteCourse(courseName);
		} catch (CourseNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity("Something went wrong for " + courseName, HttpStatus.NOT_FOUND);

		}
		return new ResponseEntity("Entry deleted for " + courseName, HttpStatus.OK);
	}

	/**
	 * 
	 * @param professor
	 * @return
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/addProfessor")
	@ResponseBody
	public List addProfessorDetails(@RequestBody Professor professor) {

		return adminService.addProfessor(professor);

	}
	
	

}
