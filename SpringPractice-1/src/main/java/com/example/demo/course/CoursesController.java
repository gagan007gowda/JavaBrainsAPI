package com.example.demo.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Topic.TopicModel;

@RestController
public class CoursesController {
	
	@Autowired
	CourseService courseService = new CourseService();
	
	@RequestMapping("/topic/{id}/course")
	public List<CourseModel> getAllTopic(@PathVariable (value = "id") Integer id) {	
		return courseService.getAllCourse(id);
	}
	
	@RequestMapping("/topic/{topicid}/course/{id}")
	public Optional<CourseModel> getTopicById(@PathVariable (value = "id")Integer id) {
		return courseService.getCourseById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/topic/{topicId}/course")
	public void insertTopic(@RequestBody  CourseModel course, @PathVariable (value = "topicId") Integer id) {
		course.setTopicModel(new TopicModel(id,"",""));
		courseService.insertCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="topic/{topicId}/course/{id}")
	public void updateTopic(@PathVariable  Integer id,@RequestBody CourseModel course, @PathVariable (value = "topicId") Integer topicId) {
		course.setTopicModel(new TopicModel(topicId,"",""));
		courseService.updateCourse(id, course);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="topic/{topicid}/course/{id}")
	public void deleteTopic(@PathVariable(value = "id") Integer id) {
		courseService.deleteCourse(id);
	}
}
