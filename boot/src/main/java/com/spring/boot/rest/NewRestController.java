package com.spring.boot.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewRestController {
	@Value("${myname}")
	String name;
	
	@Value("${myage}")
	String age;
@RequestMapping("/")
public String hello() {
	return "Hello, time is "+ LocalDateTime.now()+" "+name+" "+age;
}
@RequestMapping("/demo")
public String demo() {
	return"Hello, test demo";
}
@RequestMapping("/toolTest")
public String test() {
	return"Hello, test devtool";
}

}
