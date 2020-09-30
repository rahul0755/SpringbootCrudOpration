package com.product.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.product.Model.BusinessRegistration;
import com.product.service.BusniessService;

@Controller
public class BusinessController {

	
	@Autowired
	BusniessService busniessService;
	
	@RequestMapping("/businessragistration")
	public String BusiniessregisterPage(HttpServletResponse response) {

		response.setContentType("text/html");
		return "Busniess";
	}
	
	@RequestMapping("/BusinessRagister")
	public String  busininessRagister(@ModelAttribute BusinessRegistration  businessRegistration)
	{

		BusinessRegistration registration= busniessService.savebusniess(businessRegistration) ;
	
		return "home";
	}
	
	@RequestMapping("/AllBusinessRegistration")
	public String getAllUser(Model model, HttpServletResponse response)
	{

		response.setContentType("text/html");

		model.addAttribute("businessList", busniessService.getAll());

		return "AllBusiness";
	}
	@RequestMapping("/deleteBusiness")
	public String deleteCarObject(Model model,@RequestParam Long id)
	{

		@SuppressWarnings("unused")
		Boolean s=busniessService.delete(id);

		return "home";

	}
	@RequestMapping("/updateBusiness")
	public String updatebusiness(Model model ,@RequestParam Long id)
	{
		Optional<BusinessRegistration> registration=busniessService.update(id);
		
		BusinessRegistration businessRegistration=registration.get();
		model.addAttribute("business", businessRegistration);
		
		//System.out.println(businessRegistration);
		
		return "UpdateBusiness";
		
	}
	
	public String updateEditedBusinessObject(Model model,@ModelAttribute BusinessRegistration registration) 
	{
		boolean b=busniessService.editBusinessObject(registration);

		//System.out.println("successfully edited"+b);
		
		List<BusinessRegistration> li=busniessService.getAll();
		
		model.addAttribute("BusinessList", li);

		return "home";
	}
	

}
