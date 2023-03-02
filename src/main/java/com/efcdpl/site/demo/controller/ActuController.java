package com.efcdpl.site.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efcdpl.site.demo.model.Actu;
import com.efcdpl.site.demo.repository.ActuRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ActuController {

	@Autowired(required = false)
	ActuRepository actuRepository;
	
	
	@GetMapping("/actus")
	public List<Actu> getActus(){
		return actuRepository.findAll();
	}
}
