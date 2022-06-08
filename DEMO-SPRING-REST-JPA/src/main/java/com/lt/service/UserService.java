/**
 * 
 */
package com.lt.service;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lt.entity.User;
import com.lt.repository.UserRepository;

/**
 * @author 91988
 *
 */
@Service
public class UserService {

	@Autowired(required=true)
	private UserRepository userRepository;

	public List<User> getAllUsers() {
		List<User> userRecords = new ArrayList<>();
		userRepository.findAll().forEach(userRecords::add);
		return userRecords;
	}

	public void addUser(User userRecord) {
		userRepository.save(userRecord);
	}

}
