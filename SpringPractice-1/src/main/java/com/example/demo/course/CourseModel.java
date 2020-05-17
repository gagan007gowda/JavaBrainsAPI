package com.example.demo.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.demo.Topic.TopicModel;

@Entity
public class CourseModel {
	
	@Id
	Integer id;
	String name;
	String title;
	
	@ManyToOne
	TopicModel topicModel;
	
	public CourseModel() {
		
	}
	
	
	public CourseModel(Integer id, String name, String title,Integer topicId) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.topicModel=new TopicModel(topicId,"","");
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


	public TopicModel getTopicModel() {
		return topicModel;
	}


	public void setTopicModel(TopicModel topicModel) {
		this.topicModel = topicModel;
	}
	
	
}
