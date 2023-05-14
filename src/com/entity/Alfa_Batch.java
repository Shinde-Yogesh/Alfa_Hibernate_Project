package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alfa_Batch {
	@Id
	private int id;
	private String name;
	private String salary;

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

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Alfa_Batch [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
