package com.product.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Products {

	
	@Id
	private Long id;
	private String ProductName;
	private Long categoryid;
	private Boolean isValid;
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Products(Long id, String productName, Long categoryid, Boolean isValid) {
		super();
		this.id = id;
		ProductName = productName;
		this.categoryid = categoryid;
		this.isValid = isValid;
	}
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public Long getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}
	public Boolean getIsValid() {
		return isValid;
	}
	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", ProductName=" + ProductName + ", categoryid=" + categoryid + ", isValid="
				+ isValid + "]";
	}
	

	
}
