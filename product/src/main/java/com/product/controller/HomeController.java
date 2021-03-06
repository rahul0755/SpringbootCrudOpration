package com.product.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.product.Model.BusinessRegistration;
import com.product.Model.User;
import com.product.service.BusniessService;
import com.product.service.UserService;

@Controller
public class HomeController {
	@Autowired
	UserService userservice;

	

	@RequestMapping("/")
	public String homePage(HttpServletResponse response) {
		response.setContentType("text/html");
		return "login";
	}

	@GetMapping("/home")
	public String homepage(HttpServletResponse response) {

		response.setContentType("text/html");
		return "home";
	}

	@GetMapping("/register")
	public String registerPage(HttpServletResponse response) {

		response.setContentType("text/html");
		return "register";
	}

	@PostMapping("/users")
	public String save(@ModelAttribute User theUser) {
		@SuppressWarnings("unused")
		User user = userservice.save(theUser);

		return "redirect:home";
	}

	@GetMapping("/showuser")
	public String getAllUser(Model model, HttpServletResponse response)
	{

		response.setContentType("text/html");

		model.addAttribute("userlist", userservice.getAll());

		return "showuser";
	}

	@PostMapping("/GetUserById")
	public String getById(@ModelAttribute User user,Model model)
	{

		model.addAttribute("user",userservice.getById(user.getId()));

		return "GetByIduser";
	}
	@RequestMapping("/deleteUser")
	public String deleteCarObject(Model model,@RequestParam Long id)
	{

		Boolean s=userservice.delete(id);

		return "home";

	}

	@RequestMapping("/updateUser")
	public String updateCarObject(Model model,@RequestParam Long id)
	{
		Optional<User> u=userservice.update(id);
		User user=u.get();

		//System.out.println(user);
		model.addAttribute("user", user);

		return "update";

	}
	public String updateEditedUserObject(Model model,@ModelAttribute User user) 
	{
		boolean b=userservice.editUserObject(user);

		//System.out.println("successfully edited"+b);
		
		List<User> li=userservice.getAll();

		model.addAttribute("UserList", li);

		return "updateuser";
	}

}
