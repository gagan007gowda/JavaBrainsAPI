package com.example.demo.Topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;
	
	public List<TopicModel> getAllTopics(){
		List<TopicModel> topics=new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Optional<TopicModel> getTopicById(Integer id) {
		return topicRepository.findById(id);
	}
	
	public void insertTopic(TopicModel obj) {
		topicRepository.save(obj);
	}
	
	public void updateTopic(Integer id, TopicModel obj) {
		topicRepository.save(obj);
	}
	
	public void deleteTopic(Integer id) {
		topicRepository.deleteById(id);
	}
}
