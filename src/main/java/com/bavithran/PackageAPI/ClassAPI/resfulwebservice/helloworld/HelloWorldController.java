package com.bavithran.PackageAPI.ClassAPI.resfulwebservice.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
//to access cross source
//@CrossOrigin(origins="http://localhost:4200")
@CrossOrigin(origins="http://172.27.192.1:4200")
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET, path="/helloworld")
	//@GetMapping(path="/hello-world")
	public String helloworld(){
		
		return "Hello World";
	}
	
	@GetMapping(path="/hello")
	public int returnNumber(){
			return 1000;
			
		}
	
	@GetMapping(path="/helloworldbean")
	public HelloWorldBean HelloWorldBean(){
			
			return new HelloWorldBean("++++++++++++++HELLO WORLD BEAN+++++++++++++++++");
			
		}
	
	@GetMapping(path="/helloworldbean/path/{name}")
	public HelloWorldBean HelloWorldBeanPath(@PathVariable String name){
		
		//throw new RuntimeException("Something went wrong");
		return new HelloWorldBean(String.format("Hello World Welcome %s",name));
	}
}
