 package com.example.restful.service;



 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;

 import com.example.restful.dao.AdminRepo;
 import com.example.restful.model.Admin;

 @Service
 public class AdminService {
 	@Autowired
 	private AdminRepo adminRepository;

 	public Admin saveAdmin(Admin admin) {
 		if (admin != null) {
 			adminRepository.save(admin);
 		}
 		return admin;
 	}

 }