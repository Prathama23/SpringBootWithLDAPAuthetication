package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Todo {

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 Long id;
 
 String description;
 Boolean isCompleted;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Boolean getIsCompleted() {
	return isCompleted;
}
public void setIsCompleted(Boolean isCompleted) {
	this.isCompleted = isCompleted;
}
 
 
}
