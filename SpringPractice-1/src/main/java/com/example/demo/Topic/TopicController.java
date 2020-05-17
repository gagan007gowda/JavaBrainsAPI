package com.example.demo.Topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	TopicService topicService = new TopicService();
	
	@RequestMapping("/topic")
	public List<TopicModel> getAllTopic() {	
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topic/{id}")
	public Optional<TopicModel> getTopicById(@PathVariable Integer id) {
		return topicService.getTopicById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/topic")
	public void insertTopic(@RequestBody  TopicModel topic) {
		topicService.insertTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="topic/{id}")
	public void updateTopic(@PathVariable  Integer id,@RequestBody TopicModel topic) {
		topicService.updateTopic(id, topic);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="topic/{id}")
	public void deleteTopic(@PathVariable Integer id) {
		topicService.deleteTopic(id);
	}
}
