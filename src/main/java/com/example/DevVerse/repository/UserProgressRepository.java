package com.example.DevVerse.repository;


	import com.example.DevVerse.model.UserProgress;
	import org.springframework.data.jpa.repository.JpaRepository;

	import java.util.Optional;

	public interface UserProgressRepository extends JpaRepository<UserProgress, Long> {
	    Optional<UserProgress> findByUsername(String username);
	}



