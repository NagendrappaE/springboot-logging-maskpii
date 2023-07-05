package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("data")
@RestController
@Slf4j
public class StudentController {

	@PostMapping("/req")
	public String hello(@RequestBody String reqStr) {

		log.error("the request {}", reqStr);

		return "hellow";

	}

}
