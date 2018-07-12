package hello_world.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import hello_world.model.Greeting;
import hello_world.service.GreetingService;

@RestController
public class GreetingController {

	@Autowired
	GreetingService greetingService;

	@RequestMapping(value="/greeting/{id}", method=RequestMethod.GET)
	public @ResponseBody Greeting get(@PathVariable("id") int id){
		Greeting greeting = greetingService.findGreetingById(id);
		return greeting;
	}

}
