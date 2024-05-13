package com.androboy.springjpaapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.androboy.springjpaapp.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	
	// JPQL method Syntax
	public List<User> findUserByfirstName(String firstName);
	public User findUserById(Integer id);
//	
	public List<User> findUserByFirstNameStartingWith(String prefix);
	public List<User> findUserByFirstNameEndingWith(String suffix);
	public List<User> findUserByFirstNameContaining(String words);
	
	
//	@Modifying
//    @Query(value = "ALTER TABLE user ADD COLUMN email VARCHAR(255)", nativeQuery = true)
//	@Query(value = "ALTER TABLE user " +
//            "ADD COLUMN city VARCHAR(255), " +
//            "ADD COLUMN email VARCHAR(255), " +
//            "ADD COLUMN age INT, " +
//            "ADD COLUMN weight INT", 
//    nativeQuery = true)
//    void addNewColumnsToTable();

}
