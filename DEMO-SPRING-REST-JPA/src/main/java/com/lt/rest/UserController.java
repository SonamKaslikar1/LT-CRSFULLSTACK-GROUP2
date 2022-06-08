/**
 * 
 */
package com.lt.rest;

import org.springframework.web.bind.annotation.RestController;

import com.lt.entity.User;
import com.lt.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 91988
 *
 */

@RestController
@CrossOrigin
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public List<User> getAllUser() {
		return userService.getAllUsers();
	}

	@RequestMapping(value = "/add-user", method = RequestMethod.POST)
	public void addUser(@RequestBody User userRecord) {
		userService.addUser(userRecord);
	}

}







