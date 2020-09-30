package com.product.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.Model.Products;
import com.product.repository.ProductRepository;

@Service
@Transactional
public class ProductService {



	@Autowired
	ProductRepository repository;

	public Products saveProduct(Products product)
	{
		return repository.save(product);

	}


	public List<Products> getall() 
	{  
		
		return repository.findAll();

	}  
	
	public Boolean delete( Long Id)
	{ 
		repository.deleteById(Id);

	return true;

	} 
	public Optional<Products> update(Long id)
	{

		return repository.findById(id);
		}

	public boolean editproductsObject(Products products) 
	{ 
		Long id=products.getId();
		Optional<Products> db=update(id);

		Products pro=db.get();

		pro.setId(products.getId());
		pro.setProductName(products.getProductName());
		pro.setCategoryid(products.getCategoryid());
		pro.setIsValid(products.getIsValid());

		return true; 
		}

}
