package com.github.kellenmpetersen.urlshortener;

import com.github.kellenmpetersen.urlshortener.model.Url;
import com.github.kellenmpetersen.urlshortener.service.UrlService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * UrlController
 * 
 * Presentation Layer:
 * Handles clients requests sent over HTTP.
 * 
 * Recieves clients requests.
 * Forwards clients requests to Service layer.
 * Returns results to clients.
 */

@RestController
public class UrlController {

	private final UrlService urlService;

	@Autowired
	public UrlController(UrlService	urlService){
		this.urlService = urlService;
	}

	// CREATE operation
	@PostMapping("/urlService/create")
	public void createUrl(@RequestParam(value = "longUrl", defaultValue = "") String longUrl){
		urlService.setUrl(longUrl);
	}

	// READ operation
	@GetMapping("/urlService/read")
	public Url getUrl(@RequestParam(value = "longUrl", defaultValue = "") String longUrl){
		return urlService.getUrl(longUrl);
	}
/*
	TODO: implement update and delete

	//	UPDATE operation
	@PutMapping("/urlService")
	public void updateUrl(){

	}

	// DELETE operation
	@DeleteMapping("/urlservice")
	public void deleteUrl(){

	}
*/
}