package com.example.RestWithSpringBoot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlienRepository  extends JpaRepository<Alien,Integer>{

	List<Alien> findAll();
	

}
