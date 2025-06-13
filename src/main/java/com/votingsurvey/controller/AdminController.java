package com.votingsurvey.controller;

import com.votingsurvey.entity.Admin;
import com.votingsurvey.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/admin")
@CrossOrigin(value = "http://localhost:5173")
public class AdminController {

    @Autowired
    private AdminService service; // Add @Autowired

    @GetMapping("/{id}") // Fix missing path parameter
    public Optional<Admin> getUserByIdController(@PathVariable(name = "id") Long id) {
        return service.getAdminById(id);
    }
    
    @PostMapping(value = "/auth")
    public boolean authAdminByIdAndPassword(@RequestBody Map<String, String> logingRequest) {
    	Long id = Long.valueOf(logingRequest.get("id").toString());
    	String password = logingRequest.get("password").toString();
    	
    	System.out.println("From Controller: Voter ID = " + id + ", Password = " + password);
    	return service.authAdminByIdAndPassword(id, password);
    }
}



