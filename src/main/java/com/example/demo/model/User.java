package com.example.demo.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

public class User {

	@NotNull
	private String name;
	private Integer id;
	@Past
	private Date birthDate;

	public User() {

	}

	public User(String name, Integer id, Date birthDate) {
		super();
		this.name = name;
		this.id = id;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}
