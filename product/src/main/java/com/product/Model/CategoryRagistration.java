package com.product.Model;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class CategoryRagistration {
	
	
	@Id
	private Long id;
	private Long category;
	private Blob indicatorImage;
	private Boolean isValid ;
	
	
	public CategoryRagistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CategoryRagistration(Long id, Long category, Blob indicatorImage, Boolean isValid) {
		super();
		this.id = id;
		this.category = category;
		this.indicatorImage = indicatorImage;
		this.isValid = isValid;
	}
	
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCategory() {
		return category;
	}
	public void setCategory(Long category) {
		this.category = category;
	}
	public Blob getIndicatorImage() {
		return indicatorImage;
	}
	public void setIndicatorImage(Blob indicatorImage) {
		this.indicatorImage = indicatorImage;
	}
	public Boolean getIsValid() {
		return isValid;
	}
	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

	@Override
	public String toString() {
		return "CategoryRagistration [id=" + id + ", category=" + category + ", indicatorImage=" + indicatorImage
				+ ", isValid=" + isValid + "]";
	}
	
}
