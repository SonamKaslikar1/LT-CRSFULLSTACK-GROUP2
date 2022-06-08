package com.lt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lt.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	// No need to implement any CURD operation like create, update , delete in
	// implementation of JPA, because this are all method of
	// CURD repository
	
	//Note: only custom methods needs to be implemented here based on the annotation @Query using JPQL
}