package web.example.cbt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.example.cbt.model.Staff;
import web.example.cbt.repository.StaffRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class StaffController {

	@Autowired
	private StaffRepository staffRepository;
	
	// get all staff
	
	@GetMapping("/staffs")
	public List<Staff> getAllStaff(){
		return staffRepository.findAll();
	}
}
