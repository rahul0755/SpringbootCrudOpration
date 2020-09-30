package com.product.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="BusinessRegistration")
public class BusinessRegistration
{
	
	@Id
	private Long id ;
	@NotNull
	private  Long categoryId ;
	 @NotNull
	private Long userId ;
	@NotNull
	private String nameOfbusiness ;
	@NotNull
	private  String streetAddress ;
	@NotNull
	private String postalCode ;
	@NotNull
	private String city ;
	@NotNull
	private String stateProvince;
	@NotNull
	private String latitude ;
	@NotNull
	private String longitude;
	@NotNull
	private String country ;

	public BusinessRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusinessRegistration(Long id, Long categoryId, Long userId, String nameOfbusiness, String streetAddress,
			String postalCode, String city, String stateProvince, String latitude, String longitude, String country) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.userId = userId;
		this.nameOfbusiness = nameOfbusiness;
		this.streetAddress = streetAddress;
		this.postalCode = postalCode;
		this.city = city;
		this.stateProvince = stateProvince;
		this.latitude = latitude;
		this.longitude = longitude;
		this.country = country;
	}

	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getNameOfbusiness() {
		return nameOfbusiness;
	}

	public void setNameOfbusiness(String nameOfbusiness) {
		this.nameOfbusiness = nameOfbusiness;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "BusinessRegistration [id=" + id + ", categoryId=" + categoryId + ", userId=" + userId
				+ ", nameOfbusiness=" + nameOfbusiness + ", streetAddress=" + streetAddress + ", postalCode="
				+ postalCode + ", city=" + city + ", stateProvince=" + stateProvince + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", country=" + country + "]";
	}

	
	
	
}
