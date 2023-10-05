package com.github.kellenmpetersen.urlshortener;

import java.util.concurrent.atomic.AtomicLong;
import java.util.List;

import com.github.kellenmpetersen.urlshortener.model.Url;
import com.github.kellenmpetersen.urlshortener.service.UrlService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	public UrlController(UrlService urlService){
		this.urlService = urlService;
	}

	private static final String TEMPLATE = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
	}
}