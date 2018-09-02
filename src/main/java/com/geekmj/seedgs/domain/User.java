package com.geekmj.seedgs.domain;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long userId;
	
	/*Only Alphabets allowed in name*/
	@NotNull
	@Size(min=2, max=255, message="{Size.User.Name}")
	private String name;
	
	@NotNull
	@Min(value = 13, message="Minimum age required is 13, you passed: ${validatedValue}")
	private Integer age;
	
	@NotNull
	@Email
	private String email;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
