package com.whzw.sc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorQuery {
	
	@Autowired
	private DoctorRepository doctorRepo;
	
    @RequestMapping("/query")
    public List<Doctor> query(@RequestParam String name) {
    	List<Doctor> doctors = null;
    	if(name.isEmpty())
    		doctors = doctorRepo.findAll();
    	else
    		doctors = doctorRepo.findByName(name);
        return doctors;
    }

}
