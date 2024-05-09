package com.androboy.springjpaapp;

import java.util.ArrayList;
import java.util.List;

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

        User user = new User();
        user.setFirstName("Chandravir");
        user.setLastName("Singh");
        user.setAddress("Greater Noida West");
       
       // it is to save single user at time;
//       User uuuu =  repository.save(user);
//       System.out.print("  user ---->> "+ uuuu);
        
        
       // let's see how can save multiple user in one time
        
//        List<User> users = new ArrayList<>();
        
        User user2 = new User();
        user2.setFirstName("Anil");
        user2.setLastName("Kumar");
        user2.setAddress("Raheem nager kasganj");
        
//        users.add(user2);
        
//        User user3 = new User();
//        user3.setFirstName("Gajendra");
//        user3.setLastName("Singh");
//        user3.setAddress("Raheem nager kasganj ()");
//        
//        users.add(user3);
//        
//       
//        Iterable<User> usersAAA = repository.saveAll(users);
//        System.out.print("------>>" + usersAAA);
        
        
//        System.out.print("------>>");
//        repository.deleteById(2);
        
//        Iterable<User> users = repository.findAll();
        
        
        // By custome query method
        
        User uuuu = repository.findUserByFirstName("Gajendra");
        System.out.print("------>>" + uuuu);
	}
	

}
