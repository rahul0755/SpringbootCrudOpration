package com.product.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.product.Model.CategoryRagistration;
import com.product.Model.User;
import com.product.repository.CategoryRepository;
import com.product.service.CategoryService;

@Controller
public class CategoryController {
	
	@Autowired
	CategoryService service;
	
	@GetMapping("/categoryragistration")
	public String BusiniessregisterPage(HttpServletResponse response)
	{

		response.setContentType("text/html");
		return "category";
	}
	
	@PostMapping("/category")
	public String savecategory(@ModelAttribute CategoryRagistration ragistration)
	
	{
		@SuppressWarnings("unused")
		CategoryRagistration ragistration1=service.savebusniess(ragistration);
		
		return "home";
		
	}
	@RequestMapping("/Allcategory")
	public String getallcategory(Model model)
	{
		model.addAttribute("categorylist", service.getall());
		
		
		return "Allcategory";
		
	}
	
	@RequestMapping("/deletecatogry")
	public String deletecategory(@RequestParam Long id)
	{
		Boolean s=service.delete(id);
		
		return "home";
		
	}
	@RequestMapping("/updateCategory")
	public String updateCategoryObject(Model model,@RequestParam Long id)
	{
		Optional<CategoryRagistration> u=service.update(id);
		CategoryRagistration ragistration=u.get();

		//System.out.println(ragistration);
		model.addAttribute("category", ragistration);

		return "UpdateCategory";

	}
	
	public String updatecategoryObject(Model model,@ModelAttribute CategoryRagistration ragistration) 
	{
		boolean b=service.editCategoryrObject(ragistration);

		//System.out.println("successfully edited"+b);
		List<CategoryRagistration> list=service.getall();
		
		model.addAttribute("UserList", list);

		return "home";
	}

}
