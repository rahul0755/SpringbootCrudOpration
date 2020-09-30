package com.product.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.Model.BusinessRegistration;
import com.product.Model.CategoryRagistration;
import com.product.repository.CategoryRepository;

@Repository
@Transactional
public class CategoryService {
	
	
	@Autowired
	CategoryRepository categoryRepository;
	

	public CategoryRagistration savebusniess(CategoryRagistration ragistration )
	{
		return categoryRepository.save(ragistration);

	}
	
	public List<CategoryRagistration> getall()
	{
		return categoryRepository.findAll();
		
	}
	public Boolean delete( Long Id)
	{
		categoryRepository.deleteById(Id);
		
		return true;
		
	}
	public Optional<CategoryRagistration> update(Long id){

		return categoryRepository.findById(id);
	}

	public boolean editCategoryrObject(CategoryRagistration ragistration)
	{
		Long id=ragistration.getId();
		Optional<CategoryRagistration> db=update(id);
		
		CategoryRagistration registration2=db.get();
		 
		registration2.setId(ragistration.getId());
		registration2.setCategory(ragistration.getCategory());
		registration2.setIndicatorImage(ragistration.getIndicatorImage());
	     registration2.setIsValid(ragistration.getIsValid());
	
		return true;
	}
}
