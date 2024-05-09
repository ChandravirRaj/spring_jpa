package com.androboy.springjpaapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.androboy.springjpaapp.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	
	public User findUserByFirstName(String name);
	
	public User findUserById(Integer id);

}
