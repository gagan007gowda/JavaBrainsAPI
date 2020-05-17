package com.example.demo.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TopicModel {
	
	@Id
	Integer id;
	String name;
	String title;
	
	public TopicModel() {
		
	}
	
	
	public TopicModel(Integer id, String name, String title) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
