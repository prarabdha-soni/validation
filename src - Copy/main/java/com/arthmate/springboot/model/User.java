package com.arthmate.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Table(name = "main")
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name", nullable = false)
	
	@NotEmpty
	@Size(min = 2, message = "user name should have at least 2 characters")
	private String name;
	@NotEmpty
	@Email
	private String email;
	@NotEmpty
	@Size(min = 2, message = "password should have at least 8 characters")
	private String password;
	private Long aadhar_number;
	private String date_of_birth;
	private String coapplicant_first_name;
	private String coapplicant_last_name;
	private int coapplicant_age;
	private int residentail_stability_in_months;
	private int monthly_income;
	private String address;
	private String city;
	private String state;
	private String pin_code;
	private String mobile_number;
	

	public User() {
		
	}
	
	/*public User(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}*/
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public Long getAadhar_number() {
		return aadhar_number;
	}

	public void setAadhar_number(Long aadhar_number) {
		this.aadhar_number = aadhar_number;
	}


	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	

	public String getCoapplicant_first_name() {
		return coapplicant_first_name;
	}

	public void setCoapplicant_first_name(String coapplicant_first_name) {
		this.coapplicant_first_name = coapplicant_first_name;
	}

	public String getCoapplicant_last_name() {
		return coapplicant_last_name;
	}

	public void setCoapplicant_last_name(String coapplicant_last_name) {
		this.coapplicant_last_name = coapplicant_last_name;
	}

	public int getCoapplicant_age() {
		return coapplicant_age;
	}

	public void setCoapplicant_age(int coapplicant_age) {
		this.coapplicant_age = coapplicant_age;
	}

	

	public int getResidentail_stability_in_months() {
		return residentail_stability_in_months;
	}

	public void setResidentail_stability_in_months(int residentail_stability_in_months) {
		this.residentail_stability_in_months = residentail_stability_in_months;
	}

	public int getMonthly_income() {
		return monthly_income;
	}

	public void setMonthly_income(int monthly_income) {
		this.monthly_income = monthly_income;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getPin_code() {
		return pin_code;
	}

	public void setPin_code(String pin_code) {
		this.pin_code = pin_code;
	}


	

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
