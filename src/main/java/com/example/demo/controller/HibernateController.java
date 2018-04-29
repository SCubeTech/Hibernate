package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Player;
import com.example.demo.model.UserDetails;
import com.example.demo.repository.PlayerRepository;
import com.example.demo.repository.UserDetailsRepository;

@RestController
public class HibernateController {

	@Autowired
	UserDetailsRepository repository;
	
	@Autowired
	PlayerRepository playerRepo;

//	@RequestMapping(value = "/employee", method = RequestMethod.GET)
//	public void firstPage() {
//		UserDetails emp = new UserDetails();
//		emp.setUserName("Shreeya");
//		emp.setDescription("Employee");
//		emp.setComments("I will not goto DB");
//		emp.setGender("F");
//		emp.setDob(new Date());
//		Address homeAddress = new Address();
//		homeAddress.setAddress("Home Address");
//		homeAddress.setPin("6901");
//		emp.setHomeAddress(homeAddress);
//		repository.save(emp);
//	}
//
//	@RequestMapping(value = "/employee1", method = RequestMethod.GET)
//	public void secondPage() {
//		UserDetails emp = new UserDetails();
//		emp.setUserName("Shreeya211");
//		emp.setDescription("CEO");
//		emp.setComments("I will not goto DB");
//		emp.setGender("F");
//		emp.setDob(new Date());
//		Address homeAddress = new Address();
//		homeAddress.setAddress("Office Address");
//		homeAddress.setPin("1045");
//		emp.setOfficeAddres(homeAddress);
//		repository.save(emp);
//
//	}
	
	@RequestMapping(value = "/getEmployee/{userId}", method = RequestMethod.GET)
	public UserDetails getEmployee(@PathVariable Long userId) {
		UserDetails details = new UserDetails();
		details = repository.findOne(userId);
		return details;
	}
	
	@RequestMapping(value = "/getEmployeeAll", method = RequestMethod.GET)
	public List<UserDetails> getEmployeeAll() {
		return repository.findAll();
	}
	
	@RequestMapping(value="/addEmployee", method=RequestMethod.POST)
	public UserDetails inseretUser(@RequestBody UserDetails user) {
		return repository.save(user);
	}
	
	
	@RequestMapping(value="/addPlayers", method=RequestMethod.POST)
	public Player insertPlayer(@RequestBody Player player) {
		return playerRepo.save(player);
	}
	
	
	@RequestMapping(value="/modifiyEmployee/{userId}", method=RequestMethod.PUT)
	public UserDetails modifiyUser(@PathVariable Long userId, @RequestBody UserDetails user) {
		UserDetails details = new UserDetails();
		details = repository.findOne(userId);
		details.setDescription(user.getDescription());
		UserDetails modified=repository.save(details);
		return modified;
	}
	
	@RequestMapping(value="/deleteEmployee/{userId}",method=RequestMethod.DELETE)
	public ResponseEntity<?> deleteUser(@PathVariable Long userId) {	
		try{
			repository.delete(userId);
		}catch(Exception e) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().build();
	}
	
	
	

}
