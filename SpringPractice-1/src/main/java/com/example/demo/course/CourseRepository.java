package com.example.demo.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<CourseModel, Integer>{
	public List<CourseModel> findByTopicModelId(int id);
}
