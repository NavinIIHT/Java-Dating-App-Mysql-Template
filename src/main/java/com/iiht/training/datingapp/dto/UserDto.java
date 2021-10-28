package com.iiht.training.datingapp.dto;

import java.util.Objects;

public class UserDto {

	
	private Long userId;

	private String name;
	
	private Integer age;
	
	private Long phoneNumber;
	
	private String gender;
	
	private String email;
	
	private String city;
	
	private String country;

	public UserDto() {
	}

	public UserDto(Long userId, String name, Integer age, Long phoneNumber, String gender, String email, String city,
			String country) {
		super();
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.email = email;
		this.city = city;
		this.country = country;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, city, country, email, gender, name, phoneNumber, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDto other = (UserDto) obj;
		return Objects.equals(age, other.age) && Objects.equals(city, other.city)
				&& Objects.equals(country, other.country) && Objects.equals(email, other.email)
				&& Objects.equals(gender, other.gender) && Objects.equals(name, other.name)
				&& Objects.equals(phoneNumber, other.phoneNumber) && Objects.equals(userId, other.userId);
	}

}
