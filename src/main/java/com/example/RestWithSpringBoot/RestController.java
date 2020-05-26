package com.example.RestWithSpringBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
	AlienRepository repo;
	@RequestMapping("aliens")
	public List<Alien> getAlien() {
	
		List<Alien>aliens=repo.findAll();
		return aliens;
		
	}
	

}
