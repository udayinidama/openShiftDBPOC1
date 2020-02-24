/**
 * 
 */
package com.example.demoDB1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author syam
 *
 */
@RestController
@RequestMapping("/demo")
public class TestController {
	
	@Autowired
	TestRepository testRepository;

	@GetMapping("/list")
	public Test list() {
		return testRepository.findById(1);
	}
}
