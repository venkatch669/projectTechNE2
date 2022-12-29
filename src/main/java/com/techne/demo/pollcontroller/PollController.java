package com.techne.demo.pollcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PollController {
	
	List names = new ArrayList();
	
	@GetMapping("/")
	public String getHelloWorld() {
		return "hello world";
	}
	
	@GetMapping("/postname")	
	public String getHelloWorld(@RequestParam String name) {
		names.add(name);
		return "added successfullly";
	}
	
	
	@GetMapping("/getname")
	public List<String> getName() {
		return names;
	}
	
	@DeleteMapping("/clearname")
	public String clearnames() {
		names = new ArrayList();
		return "cleared sucessfully";
	}
	
}
