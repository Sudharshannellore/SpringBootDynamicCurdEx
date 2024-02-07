package com.springdynamiccurd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springdynamiccurd.repo.DataBaseRepo;
import com.springdynamiccurd.users.Users;

@Controller
public class UserController {
	
	@Autowired
	private DataBaseRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "Home";
	}
	
	@RequestMapping("/add")
	public String addform()
	{
		return "addform";
	}
	@RequestMapping("/req")
	public String saveform(Users users, ModelMap map) {
		
		repo.save(users);
		
		return "success";
	}
	@RequestMapping("/view")
	public String viewform(ModelMap map) {
		
		map.put("users", repo.findAll());
		
	    return "viewform";	
	}
	
	@RequestMapping("/edit/{userid}")
	public String name(@PathVariable int userid, ModelMap map) {
	
		map.put("command", repo.findById(userid).get());
		
		return "editform";
	}
	
	@RequestMapping("/editandsave")
	public String editsave(Users users, ModelMap map) {
		
		repo.save(users);
		
		return "redirect:/view";
	}
	
	@RequestMapping("/delete/{userid}")
	public String delete(@PathVariable int userid)
	{
		repo.deleteById(userid);
		
		return "redirect:/view";
	}
}
