package com.whzw.sc;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Doctor implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Doctor(String name, String age, String email, String grade, String department) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.grade = grade;
		this.department = department;
	}


	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false, unique = true)
	private String name;
	@Column(nullable = false)
	private String age;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = true )
	private String grade;
	@Column(nullable = true)
	private String department;


	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAge() {
		return age;
	}



	public void setAge(String age) {
		this.age = age;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
