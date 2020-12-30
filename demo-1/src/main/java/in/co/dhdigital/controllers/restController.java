package in.co.dhdigital.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class restController {

	@GetMapping("/{name}")
	public String sayhi(@PathVariable String name)
	{
		String msg;
		msg="Hello "+name+"....!";		
		return msg;
		
	}
	
}
