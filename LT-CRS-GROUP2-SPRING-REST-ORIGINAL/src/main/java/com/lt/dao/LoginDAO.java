/**
 * 
 */
package com.lt.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.lt.bean.Course;
import com.lt.bean.Login;
import com.lt.exception.CourseNotFoundException;
import com.lt.exception.NameOrPasswordInvalidException;

/**
 * @author admin
 *
 */
@Repository
public class LoginDAO implements LoginDAOInterface {
	private static final Logger logger = LoggerFactory.getLogger(AdminDAO.class);

	/**
	 * 
	 */
	private static List<Login> loginUserList;
	{
		loginUserList = new ArrayList<Login>();
		loginUserList.add(new Login("admin", "admin", "admin"));
		loginUserList.add(new Login("student", "student", "student"));
		loginUserList.add(new Login("professor", "professor", "professor"));

	}

	/**
	 * 
	 * @return
	 */
	public List<Login> veiwLoginUserList() {
		// TODO Auto-generated method stub
		return loginUserList;
	}

	/**
	 * 
	 */
	@Override
	public String loginUser(Login login) throws NameOrPasswordInvalidException{
		// TODO Auto-generated method stub
		List<Login> loginlist = loginUserList.stream()
				.filter(n -> (n.getUsername().equals(login.getUsername())
						&& (n.getPassword().equals(login.getPassword()) && (n.getRole().equals(login.getRole())))))
				.collect(Collectors.toList());
		if (loginlist.size() != 0) {

			logger.info("Loggin in   :" + login.getUsername());
			return "SUCCESS";

		} else {
			logger.error("Error in Logging in : " + login.getUsername());
			throw new NameOrPasswordInvalidException("Please enter username/password again.");
		}
	}

}
