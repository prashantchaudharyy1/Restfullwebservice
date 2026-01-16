package com.example.restful.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restful.model.Admin;

@RestController

public class AdminController {

   Map<Integer,Admin> map=new HashMap<>();
	@GetMapping
	public Admin admin() {
		System.out.println("MyController");
		return new Admin(1,"Prashant","5456");
	}
	@GetMapping("/{id}")
	public Admin getAdminbyid(@PathVariable int id) {
		System.out.println("Mycontrooll");
		
		return map.get(id);}
	
	
	@GetMapping("/alladmin")
	public Map<Integer,Admin> getalladmin() {
		return map;
	}	
	
	  
	@DeleteMapping("/{id}")
	public Admin deleteadminbyid(@PathVariable int id) {
		System.out.println("Delete");
		return map.remove(id);
		
	}
	@PatchMapping
	public Admin updateadmin(@RequestBody Admin admin) {
		map.put(admin.getId(), admin);
		return admin;
		
	}
	
	@PostMapping
	public Admin requestBodyInfo(@RequestBody Admin admin) {
		System.out.println(admin);
		map.put(admin.getId(), admin);
	return admin;
	}
	
}
 