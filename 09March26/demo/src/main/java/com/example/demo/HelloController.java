package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	@GetMapping("/")
	public String hello() {
		return "Hello World";
	}	
	@GetMapping("/add")
	public String add(@RequestParam int a, @RequestParam int b){
		return "a + b = " + (a + b);
	}
	@GetMapping("/college/name/{name}/age/{age}")
	public String college(@PathVariable String name, @PathVariable int age) {
		return "Welcome to the College Website. \n Your name: " + name + "! You are " + age + " years old.";
	}
	@PostMapping("/greet")
	public String greet(@RequestBody String name) {
		return "Hello, " + name + "! Welcome to our website.";
	}
	@PostMapping("/car")
	public String carModel(@RequestBody Car car){
		return "Car model: "+car.getModel()+", Price: "+car.getPrice()+", Color: "+car.getColor();
	}
	@PostMapping("/student")
	public String Student(@RequestBody Student student){
		int total = student.getEnglish()+student.getKannada()+student.getMaths()+student.getScience()+student.getSocialscience();
		int avg = total/5;
		boolean result;
		if(avg<75)
			result = false;
		else
			result = true;
		return "Name: "+student.getName()+", Age: "+student.getAge()+", Total: "+total+", Average: "+avg+", Pass: "+result; 
	}
}
class Car{
	private int price;
	private String model;
	private String color;
	int getPrice(){
		return price;
	}
		String getModel(){
		return model;
	}
		String getColor(){
		return color;
	}
	void setPrice(int price){
		this.price = price;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
