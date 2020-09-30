package com.product.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.product.Model.CategoryRagistration;
import com.product.Model.Products;
import com.product.service.ProductService;

public class ProductController {
	
	
	@Autowired 
    ProductService service;
	
	
	@RequestMapping("/productRegistration")
	public String ProductregisterPage(HttpServletResponse response)
	{

		response.setContentType("text/html");
		
		return "Product";
	}
	
	@PostMapping("/Products")
	public String savecategory(@ModelAttribute  Products products)
	
	{
		@SuppressWarnings("unused")
		Products product=service.saveProduct(products);
		
		return "home";
		
	}
	
}
