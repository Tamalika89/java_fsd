package com.example;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
@Autowired
EmpRepo repo;
Logger log=Logger.getAnonymousLogger();
@ResponseBody
@RequestMapping("/register-user/{user}/{password}/{email}")
public String registerms(HttpServletRequest request,HttpServletResponse response,@PathVariable("user") String user,@PathVariable("password") String password,@PathVariable("email") String email) {
	log.info("entered into the ms of the registartion");
	Employee e=new Employee();
	e.setUser(user);
	e.setPassword(password);
	e.setEmail(email);
	repo.save(e);
	return "done";



}
}
