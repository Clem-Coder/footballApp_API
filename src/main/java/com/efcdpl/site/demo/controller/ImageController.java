package com.efcdpl.site.demo.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.efcdpl.site.demo.model.Image;
import com.efcdpl.site.demo.repository.ImageRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ImageController {
	
	@Autowired
	ImageRepository imageRepository;
	
	@GetMapping("/pictures")
	public List<Image> getAllPictures(){
		return imageRepository.findAll();
	}
	

	@PostMapping("/picture/upload")
	public void postPictures(@RequestParam("image") List<MultipartFile> files) throws IOException {
		List<Image> images = new ArrayList<>();
		for(MultipartFile image: files) {
			images.add(new Image(image.getBytes()));
		}
		imageRepository.saveAll(images);
		}
	
	



}
