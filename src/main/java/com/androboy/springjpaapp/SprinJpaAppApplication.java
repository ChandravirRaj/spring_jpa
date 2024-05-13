package com.androboy.springjpaapp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.androboy.springjpaapp.entities.User;
import com.androboy.springjpaapp.repository.UserRepository;

@SpringBootApplication
public class SprinJpaAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SprinJpaAppApplication.class, args);
		UserRepository repository = context.getBean(UserRepository.class);
		findUserByFirstNameEndingWith(repository);
	}
	
	
	
	
	
	
	
	//-----------------------------JPA Query Methods--------------start--------------------------
	public static void findUserById(UserRepository repository) {
		User user = repository.findUserById(153);
		System.out.println("----------user---------->> " + user);
		
	}
	
	public static void findUserByfirstName(UserRepository repository) {
		
		List<User> users = repository.findUserByfirstName("Rajat");
		users.forEach(new Consumer<User>() {

			@Override
			public void accept(User user) {
				System.out.println("----------user---------->> " + user);
				
			}
			
		});
	}
	
	
    public static void findUserByFirstNameStartingWith(UserRepository repository) {
		
		List<User> users = repository.findUserByFirstNameStartingWith("A");
		users.forEach(new Consumer<User>() {

			@Override
			public void accept(User user) {
				System.out.println("----------user---------->> " + user);
				
			}
			
		});
	}
    
    
    
	 public static void findUserByFirstNameEndingWith(UserRepository repository) {
			
			List<User> users = repository.findUserByFirstNameEndingWith("t");
			users.forEach(new Consumer<User>() {
	
				@Override
				public void accept(User user) {
					System.out.println("----------user---------->> " + user);
					
				}
				
			});
		}
	 
	 
	 public static void findUserByFirstNameConstaining(UserRepository repository) {
			
			List<User> users = repository.findUserByFirstNameContaining("at");
			users.forEach(new Consumer<User>() {
	
				@Override
				public void accept(User user) {
					System.out.println("----------user---------->> " + user);
					
				}
				
			});
		}
	
	//-----------------------------JPA Query Methods-------end---------------------------------
	
//	public static void findUserByFirstNameContaining(UserRepository repository) {
//		List<User> users = repository.findUserByfirstName("Anil");
//		users.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User user) {
//				System.out.println("----------user---------->> " + user);
//				
//			}
//			
//		});
//		
//	}

	public static void getAllUsers(UserRepository repository) {
		repository.findAll().forEach(new Consumer<User>() {

			@Override
			public void accept(User user) {
				System.out.println("----------user---------->> " + user);

			}

		});

	}

//	public static void alterTable(UserRepository repository) {
//		try {
//			repository.addNewColumnsToTable();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}

	public static void deleteAll(UserRepository repository) {
		repository.deleteAll();

	}

	public static void saveSingleUser(UserRepository repository) {
		try {
			User user = new User();
			user.setFirstName("Chandravir");
			user.setLastName("Singh");
			user.setAddress("Greater Noida West");

			User savedUser = repository.save(user);
			System.out.println("----------savedUser---------->> " + savedUser);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void saveMultipleUsers(UserRepository repository) {

		try {

			List<User> userList = new ArrayList<>();

			User user = new User();
			user.setFirstName("Chandravir");
			user.setLastName("Singh");
			user.setAge(30);
			user.setCity("Noida");
			user.setEmail("chandravir550@gmail.com");
			user.setWeight(70);
			user.setAddress("Greater Noida West");
			userList.add(user);

			User user2 = new User();
			user2.setFirstName("Anil");
			user2.setLastName("Kumar");
			user2.setAge(30);
			user2.setCity("Noida");
			user2.setEmail("anil550@gmail.com");
			user2.setWeight(75);
			user2.setAddress("Raheem nager kasganj");
			userList.add(user2);

			User user3 = new User();
			user3.setFirstName("Lalit");
			user3.setLastName("Kumar");
			user3.setAge(30);
			user3.setCity("Kasganj");
			user3.setEmail("lalit550@gmail.com");
			user3.setWeight(50);
			user3.setAddress("ramghat road kasganj");
			userList.add(user3);

			User user4 = new User();
			user4.setFirstName("Akash");
			user4.setLastName("Singh");
			user4.setAge(30);
			user4.setCity("Jaipur");
			user4.setEmail("akash550@gmail.com");
			user4.setWeight(63);
			user4.setAddress("405 transformar gali tank road Jaipur");
			userList.add(user4);

			User user5 = new User();
			user5.setFirstName("Rajat");
			user5.setLastName("Patidar");
			user5.setAge(28);
			user5.setCity("Banlloru");
			user5.setEmail("rajat874@gmail.com");
			user5.setWeight(68);
			user5.setAddress("echo garden 403");
			userList.add(user5);

			User user6 = new User();
			user6.setFirstName("Virat");
			user6.setLastName("Samrajya");
			user6.setAge(28);
			user6.setCity("Banglooru");
			user6.setEmail("virat6789@gmail.com");
			user6.setWeight(88);
			user6.setAddress("Echo village 408");
			userList.add(user6);

			Iterable<User> usersItrable = repository.saveAll(userList);
			usersItrable.forEach(new Consumer<User>() {

				@Override
				public void accept(User user) {
					System.out.println("---------User by Iterable print----------->>" + user);
				}

			});

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void deleteDuplicateUser(UserRepository repository) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
