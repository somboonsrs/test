package com.em.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Customer implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8354769203535785720L;
	@Id
	private Long id;
	private String name;
	private String gender;
	
	@Autowired
	@ManyToOne
	private Application application;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
