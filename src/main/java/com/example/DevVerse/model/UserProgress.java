package com.example.DevVerse.model;


	import jakarta.persistence.*;

	@Entity
	public class UserProgress {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String username;

	    private int completedTopics;

	    // Getters and Setters

	    public Long getId() { return id; }
	    public void setId(Long id) { this.id = id; }

	    public String getUsername() { return username; }
	    public void setUsername(String username) { this.username = username; }

	    public int getCompletedTopics() { return completedTopics; }
	    public void setCompletedTopics(int completedTopics) { this.completedTopics = completedTopics; }
	}



