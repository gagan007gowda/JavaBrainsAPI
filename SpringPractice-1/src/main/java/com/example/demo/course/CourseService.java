package com.example.demo.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<CourseModel> getAllCourse(Integer id){
		List<CourseModel> topics=new ArrayList<>();
		courseRepository.findByTopicModelId(id).forEach(topics::add);
		return topics;
	}
	
	public Optional<CourseModel> getCourseById(Integer id) {
		return courseRepository.findById(id);
	}
	
	public void insertCourse(CourseModel obj) {
		courseRepository.save(obj);
	}
	
	public void updateCourse(Integer id, CourseModel obj) {
		courseRepository.save(obj);
	}
	
	public void deleteCourse(Integer id) {
		courseRepository.deleteById(id);
	}
}
