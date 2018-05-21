package com.shann.topic.hello;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shann.topic.Topics;

@RestController
public class HelloController {
	
	@RequestMapping("/topics")
	public List<Topics> getalltopics(){
		return Arrays.asList(
				new Topics("1", "spring", "dependency injection"),
				new Topics("2", "hibernate", "object relational mapping"),
				new Topics("3", "aws", "cloud server")
				);		
	}
}
