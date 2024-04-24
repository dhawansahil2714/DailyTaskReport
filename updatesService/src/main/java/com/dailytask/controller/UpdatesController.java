package com.dailytask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailytask.entity.Updates;
import com.dailytask.service.UpdatesService;

@RestController
@RequestMapping("/updates")
public class UpdatesController {
	
	@Autowired
	private UpdatesService updateService;
	
	
	@GetMapping("/{empId}")
	public Updates getByEmployeeId(@PathVariable int empId) {
		
		return updateService.getByEmployeeId(empId);
	}
	
	@GetMapping
	public List<Updates> getAllUpdates(){
		
		return updateService.getAllUpdates();
	}
	
	@PostMapping
	public void saveUpdate(@RequestBody Updates update) {
		updateService.saveUpdate(update);
	}
	
}
