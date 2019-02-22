package com.em.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Credit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7515886584615132378L;
	@Id
	private Long id;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
