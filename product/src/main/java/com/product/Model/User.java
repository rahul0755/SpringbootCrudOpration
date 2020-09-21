package com.product.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;


@Entity
@Table(name="user")
public class User 
{

	

	@Id
	private Long id;
	@NotNull
	private  String fisrtname ;
	@NotNull
	private String lastname;
	@NotNull
	private String address;
	@NotNull
	private String emailId ;
	@NotNull
	private  String mobileNumber;
	@NotNull
	private String city;
	@NotNull
	private String state;
	@NotNull
	private String isBusniessowner;
	@NotNull
	private String password;
	@NotNull
	private String otp;
	@NotNull
	private String avatarId;
	@NotNull
	private  String  deviceId ;
	@NotNull
	private  String	 os ;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long id, String emailId, String mobileNumber, String fisrtname, String lastname, String address,
			String city, String state, String isBusniessowner, String password, String otp, String avatarId,
			String deviceId, String os) {
		super();
		this.id = id;
		this.fisrtname = fisrtname;
		this.lastname = lastname;
		this.address = address;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.city = city;
		this.state = state;
		this.isBusniessowner = isBusniessowner;
		this.password = password;
		this.otp = otp;
		this.avatarId = avatarId;
		this.deviceId = deviceId;
		this.os = os;
	}
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFisrtname() {
		return fisrtname;
	}

	public void setFisrtname(String fisrtname) {
		this.fisrtname = fisrtname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIsBusniessowner() {
		return isBusniessowner;
	}

	public void setIsBusniessowner(String isBusniessowner) {
		this.isBusniessowner = isBusniessowner;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public String getAvatarId() {
		return avatarId;
	}

	public void setAvatarId(String avatarId) {
		this.avatarId = avatarId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", emailId=" + emailId + ", mobileNumber=" + mobileNumber + ", fisrtname="
				+ fisrtname + ", lastname=" + lastname + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", isBusniessowner=" + isBusniessowner + ", password=" + password + ", otp=" + otp + ", avatarId="
				+ avatarId + ", deviceId=" + deviceId + ", os=" + os + "]";
	}

}
