package com.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Crickstaff {
	@Id
	int id;
	String name;
	int age;
	String department;
	int workexperience;
	public Crickstaff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Crickstaff(int id, String name, int age, String department, int workexperience) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
		this.workexperience = workexperience;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getWorkexperience() {
		return workexperience;
	}

	public void setWorkexperience(int workexperience) {
		this.workexperience = workexperience;
	}

	@Override
	public String toString() {
		return "Crickstaff [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department
				+ ", workexperience=" + workexperience + "]";
	}

	
}
