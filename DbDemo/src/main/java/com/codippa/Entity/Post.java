package com.codippa.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="test")
public class Post {
 
	@Id
	@GeneratedValue
	private Integer id ;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	private String Name ;
	
	private String city ;

	@Override
	public String toString() {
		return "Post [id=" + id + ", Name=" + Name + ", city=" + city + "]";
	}
	
	
	 
 }
