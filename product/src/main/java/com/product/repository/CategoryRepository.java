package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.Model.CategoryRagistration;

public interface CategoryRepository  extends JpaRepository<CategoryRagistration, Long>{

	
}
