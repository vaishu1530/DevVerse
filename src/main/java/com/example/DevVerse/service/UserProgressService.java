package com.example.DevVerse.service;


	import com.example.DevVerse.model.UserProgress;
	import com.example.DevVerse.repository.UserProgressRepository;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	@Service
	public class UserProgressService {

	    @Autowired
	    private UserProgressRepository userProgressRepository;

	    public int getCompletedTopics(String username) {
	        return userProgressRepository.findByUsername(username)
	                .map(UserProgress::getCompletedTopics)
	                .orElse(0);
	    }
	}


