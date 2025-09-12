package com.example.DevVerse.repository;


	import org.springframework.data.jpa.repository.JpaRepository;
	import com.example.DevVerse.model.User;

	public interface UserRepository extends JpaRepository<User, Long> {
	    User findByUsername(String username);
	}

 
